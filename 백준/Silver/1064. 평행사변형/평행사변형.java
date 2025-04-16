import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int xa= Integer.parseInt(st.nextToken());
        int ya= Integer.parseInt(st.nextToken());
        int xb= Integer.parseInt(st.nextToken());
        int yb= Integer.parseInt(st.nextToken());
        int xc= Integer.parseInt(st.nextToken());
        int yc= Integer.parseInt(st.nextToken());
        int[] A = {xa, ya};
        int[] B = {xb, yb};
        int[] C = {xc, yc};
        double AB = calLineDistance(A, B);
        double AC = calLineDistance(A, C);
        double BC = calLineDistance(B, C);
        //AB AC
        double BAC =(AB+AC)*2;
        //AB BC
        double ABC =(AB+BC)*2;
        //AC BC
        double ACB =(AC+BC)*2;
        double answer = Math.max(BAC,Math.max(ABC,ACB)) - Math.min(BAC, Math.min(ABC,ACB));
        double[] vectorAB = {xa-xb, ya-yb};
        double[] vectorAC = {xa-xc, ya-yc};
        if(vectorAB[0]==0&&vectorAC[0]==0 || vectorAB[1]/vectorAB[0]==vectorAC[1]/vectorAC[0]) answer=-1;


        System.out.println(answer);
    }
    public static double calLineDistance(int[] a, int[] b) {
        return Math.sqrt(Math.pow((a[0]-b[0]),2) + Math.pow((a[1]-b[1]),2));
    }
}