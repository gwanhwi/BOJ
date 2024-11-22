import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<=S.length();j++){
                map.put(S.substring(i,j), 1);
            }
        }
        System.out.println(map.size());
    }
}