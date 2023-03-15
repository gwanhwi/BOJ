import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            /*for (int i = 0; i < 3; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            list.sort(Comparator.naturalOrder());
            if(list.get(0)==0&&list.get(1)==0&&list.get(2)==0)
               break;
            else if ((list.get(0)*list.get(0) + list.get(1)*list.get(1))
                    == list.get(2)*list.get(2))
                System.out.println("right");
            else
                System.out.println("wrong");
            list.clear();
             */
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int z=Integer.parseInt(st.nextToken());
            if(x==0 && y==0 && z==0)break;
            if((x*x+y*y)==z*z)
                System.out.println("right");
            else if((x*x+z*z)==y*y)
                System.out.println("right");
            else if((z*z+y*y)==x*x)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}