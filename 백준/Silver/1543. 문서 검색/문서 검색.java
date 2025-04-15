import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String doc = br.readLine();
        String target = br.readLine();
        int count=0;
        for(int i=0;i<doc.length()-target.length()+1;i++){
            if(doc.charAt(i)==target.charAt(0)){
                if(doc.substring(i,i+target.length()).equals(target)) {
                    count++;
                    i+=target.length()-1;
                }
            }
        }
        System.out.println(count);
    }
}