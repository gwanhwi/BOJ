import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(br.readLine());
        }
        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                }else if(o1.length() < o2.length()){
                    return -1;
                }
                else {
                    int len = o1.length();
                    int sum1 = 0;
                    int sum2 = 0;
                    for (int i = 0; i < len; i++) {
                        char c1 = o1.charAt(i);
                        char c2 = o2.charAt(i);
                        if (c1 >= '0' && c1 <= '9') {
                            sum1 += c1 - '0';
                        }
                        if (c2 >= '0' && c2 <= '9') {
                            sum2 += c2 - '0';
                        }
                    }

                    if (sum1 > sum2) {
                        return 1;
                    } else if(sum1 < sum2){
                        return -1;
                    }
                    else {
                        return o1.compareTo(o2);
                    }
                }
            }
        });
        for(String str : list) sb.append(str).append("\n");
        System.out.println(sb);
    }
}