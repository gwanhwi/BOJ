import java.io.*;
import java.util.*;
class Main {
    static int r;
    static int c;
    static int arrSize;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arrSize = (int)Math.pow(2,N) * (int)Math.pow(2,N);
        int time = recursion((int)Math.pow(2,N),0);
        System.out.println(time);
    }
    public static int recursion(int arrLength, int visitTime){
        int halfSize = arrLength/2;
        int quarterArrSize = arrSize/4;
        if(arrLength==1){
            return visitTime;
        }
        if(r<halfSize && c<halfSize){
            visitTime+=quarterArrSize*0;
        }
        if(r<halfSize && c>=halfSize){
            visitTime+=quarterArrSize*1;
        }
        if(r>=halfSize && c<halfSize){
            visitTime+=quarterArrSize*2;
        }
        if(r>=halfSize && c>=halfSize){
            visitTime+=quarterArrSize*3;
        }
        r%=halfSize;
        c%=halfSize;
        arrSize/=4;
        return recursion(halfSize,visitTime);
    }
}