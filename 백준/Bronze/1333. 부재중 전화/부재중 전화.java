import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        List<Integer> canHearTime = new ArrayList<>();
        int songTime=0;
        for(int i=0;i<N;i++){
            songTime+=L;
            for(int j=0;j<5;j++){
                canHearTime.add(songTime++);
            }
        }
        for(int i=0;i<5;i++){
            canHearTime.remove(canHearTime.size()-1);
        }
        int ringTime=D;
        int answer=0;
        while (ringTime<songTime-5){
            if(canHearTime.contains(ringTime)) {
                answer=ringTime;
                break;
            }
            ringTime+=D;
        }
        if(answer==0) answer = ringTime;
        System.out.println(answer);
    }
}