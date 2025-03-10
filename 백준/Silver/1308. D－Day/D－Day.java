import java.io.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int todayYear = Integer.parseInt(st.nextToken());
        int todayMonth = Integer.parseInt(st.nextToken());
        int todayDay = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int targetYear = Integer.parseInt(st.nextToken());
        int targetMonth = Integer.parseInt(st.nextToken());
        int targetDay = Integer.parseInt(st.nextToken());

        LocalDate today = LocalDate.of(todayYear,todayMonth,todayDay);
        LocalDate dDay =  LocalDate.of(targetYear,targetMonth,targetDay);

        if(ChronoUnit.YEARS.between(today,dDay)>=1000) sb.append("gg");
        else sb.append("D-"+ChronoUnit.DAYS.between(today,dDay));
        System.out.println(sb);
    }
}