import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        int count=0;
        int index=0;
        if(list.contains(2))
            count++;
        while(index< list.size()){
            for(int i=2;i<list.get(index);i++){
                if(i==(list.get(index)-1) && (list.get(index)%i != 0))
                    count++;
                if((list.get(index)%i) == 0)
                    break;
            }
            index++;
        }
        System.out.println(count);
    }
}
