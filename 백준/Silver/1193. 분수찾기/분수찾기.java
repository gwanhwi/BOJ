import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int X = Integer.parseInt(br.readLine());
        int sum=0;
        int addVal=1;
        for(int i=0;i<1000000;i++){
            if(sum<=X-1 && X-1<(sum+addVal)){
                for(int j=0;j<addVal;j++){
                    if(j+sum ==X-1) {
                        if(addVal%2 == 0) sb.append(j+1).append("/").append(addVal-j);
                        if(addVal%2 != 0) sb.append(addVal-j).append("/").append(j+1);
                        i=1000000;
                        break;
                    }
                }
            }
            sum+=addVal;
            addVal++;
        }
        System.out.println(sb);
    }
}