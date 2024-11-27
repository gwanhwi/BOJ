import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] X = new int[N];
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<N;i++){
            X[i]=Integer.parseInt(st.nextToken());
            set.add(X[i]);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        for(int i=0;i<N;i++){
            sb.append(binarySearch(arr,X[i])).append(" ");
        }
        System.out.println(sb);
    }
    public static int binarySearch(Integer[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) start=mid+1;
            if(arr[mid]>target) end = mid-1;
        }
        return -1;
    }
}