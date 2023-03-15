import javax.xml.stream.events.StartDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class plane{
    int x;
    int y;
    plane(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<plane> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            plane p= new plane(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            list.add(p);
        }
        Collections.sort(list, new Comparator<plane>() {
            @Override
            public int compare(plane o1, plane o2) {
                return o1.x-o2.x;
            }
        });
        Collections.sort(list, new Comparator<plane>() {
            @Override
            public int compare(plane o1, plane o2) {
                if(o1.x==o2.x)
                    return o1.y-o2.y;
                return 0;
            }
        });
        for(int i=0;i<n;i++){
            sb.append(list.get(i).x).append(' ').append(list.get(i).y).append('\n');
        }
        System.out.println(sb);
    }
}
