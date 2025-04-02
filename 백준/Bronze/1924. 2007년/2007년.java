import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int days=0;
        for(int i=1;i<x;i++){
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days+=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days+=30;
                    break;
                case 2:
                    days+=28;
                    break;
            }
        }
        days+=y;
        switch (days%7){
            case 0:
                sb.append("SUN");
                break;
            case 1:
                sb.append("MON");
                break;
            case 2:
                sb.append("TUE");
                break;
            case 3:
                sb.append("WED");
                break;
            case 4:
                sb.append("THU");
                break;
            case 5:
                sb.append("FRI");
                break;
            case 6:
                sb.append("SAT");
                break;
        }
        System.out.println(sb);
    }
}