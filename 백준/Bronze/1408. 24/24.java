import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String start = br.readLine();
        String target = br.readLine();
        int startTime = stringToSecondTime(start);
        int targetTime = stringToSecondTime(target);
        int remainTime=0;
        if(startTime>targetTime) {
            remainTime = 24*60*60 - startTime+targetTime;
        } else{
            remainTime = targetTime-startTime;
        }
        int hour = remainTime/3600;
        remainTime%=3600;
        int minute= remainTime/60;
        remainTime%=60;
        int second = remainTime;
        if(hour<10) sb.append("0");
        sb.append(hour+":");
        if(minute<10) sb.append("0");
        sb.append(minute+":");
        if(second<10) sb.append("0");
        sb.append(second);

        System.out.println(sb);
    }
    public static int stringToSecondTime(String str) {
        return Integer.parseInt(str.substring(0,2))*60*60 +
                Integer.parseInt(str.substring(3,5))*60 +
                Integer.parseInt(str.substring(6,8));
    }
}