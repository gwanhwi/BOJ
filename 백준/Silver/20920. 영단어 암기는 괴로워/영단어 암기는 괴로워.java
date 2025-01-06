import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            String str = br.readLine();
            if(str.length()<M) continue;
            map.put(str,map.getOrDefault(str,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(String key : map.keySet()){
            list.add(key);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o2)==map.get(o1)){
                    if(o1.length()==o2.length()){
                        return o1.compareTo(o2);
                    }
                    return o2.length()-o1.length();

                }
                return map.get(o2)-map.get(o1);
            }
        });
        for(int i=0;i<list.size();i++) sb.append(list.get(i)).append("\n");
        System.out.println(sb);
    }
}