import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String answer="";
        int len = str.length();
        for(int i=1;i<len;i++){
            for(int j=i+1;j<len;j++){
                String str1=str.substring(0,i);
                String str2=str.substring(i,j);
                String str3=str.substring(j,len);

                for(int a=str1.length()-1;a>=0;a--){
                    sb.append(str1.charAt(a));
                }
                for(int a=str2.length()-1;a>=0;a--){
                    sb.append(str2.charAt(a));
                }
                for(int a=str3.length()-1;a>=0;a--){
                    sb.append(str3.charAt(a));
                }
                if(answer.equals("")){
                    answer=sb.toString();
                }else{
                    if(answer.compareTo(sb.toString())>0){
                        answer=sb.toString();
                    }
                }
                sb.delete(0,sb.length());
            }
        }
        System.out.println(answer);
    }
}