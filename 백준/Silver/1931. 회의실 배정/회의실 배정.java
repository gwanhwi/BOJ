import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
class Meeting{
    public Meeting(int startTime, int finishTime){
        this.startTime=startTime;
        this.finishTime=finishTime;
    };
    int startTime;
    int finishTime;
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        Meeting[] arr= new Meeting[n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int finishTime = Integer.parseInt(st.nextToken());
            arr[i]=new Meeting(startTime,finishTime);
        }
        Arrays.sort(arr, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if(o1.startTime==o2.startTime) return o1.finishTime-o2.finishTime;
                return o1.startTime-o2.startTime;
            }
        });
        int beforeMeetingFinishTime=0;
        int maxMeetingCount=0;
        for(int i=0;i<n;i++){
            if(beforeMeetingFinishTime>arr[i].finishTime) {
                beforeMeetingFinishTime=arr[i].finishTime;
                continue;
            }
            if(beforeMeetingFinishTime>arr[i].startTime) continue;
            beforeMeetingFinishTime=arr[i].finishTime;
            maxMeetingCount++;
        }
        System.out.println(maxMeetingCount);
    }
}