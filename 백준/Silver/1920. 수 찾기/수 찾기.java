import javax.xml.stream.events.StartDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static int binarySearch(int[] arr, int n){
        int first=0;
        int end=arr.length-1;
        while(first<=end){
            int mid=(first+end)/2;
            if(n==arr[mid])
                return 1;
            if(n>arr[mid])
                first=mid+1;
            if(n<arr[mid])
                end=mid-1;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());

        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        //counting sort

        Arrays.sort(arr1);
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            sb.append(binarySearch(arr1,Integer.parseInt(st.nextToken()))).append("\n");
        }
        System.out.println(sb);
    }
}
