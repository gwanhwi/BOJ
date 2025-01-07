import java.io.*;
import java.util.*;

class Main {
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int students= Integer.parseInt(br.readLine());
        for(int i=0;i<students;i++){
            st=new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if(gender==1){
                for(int j=1;num*j<=N;j++){
                    int idx = num*j;
                    changeSwitch(idx);
                }
            } else if (gender==2) {
                int left=num-1;
                int right=num+1;
                changeSwitch(num);
                while(left>=1 && right<=N){
                    if(arr[left]==arr[right]){
                        changeSwitch(left--);
                        changeSwitch(right++);
                    }
                    else break;
                }
            }
        }
        for(int i=1;i<=N;i++) {
            sb.append(arr[i]).append(" ");
            if(i%20==0)sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void changeSwitch(int index){
        if(arr[index]==1) arr[index]=0;
        else if(arr[index]==0) arr[index]=1;
    }
}