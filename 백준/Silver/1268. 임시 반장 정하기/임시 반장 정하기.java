import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][5];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        List<Set<Integer>> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(new HashSet<>());
        }
        for(int j=0;j<5;j++){
            for(int i=0;i<N;i++){
                int val = arr[i][j];
                for(int k=0;k<N;k++){
                    if(k==i) continue;
                    if(arr[k][j] == val){
                        list.get(i).add(k);
                    }
                }
            }
        }
        int maxNum=list.get(0).size();
        int student=1;
        for(int i=1;i<list.size();i++){
            if(list.get(i).size()>maxNum){
                maxNum=list.get(i).size();
                student=i+1;
            }
        }
        System.out.println(student);
    }
}