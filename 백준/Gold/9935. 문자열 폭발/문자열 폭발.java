import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String boomStr = br.readLine();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= boomStr.charAt(boomStr.length()-1)){
                list.add(str.charAt(i));
            } else {
                list.add(str.charAt(i));
                if(list.size()<boomStr.length())continue;
                boolean isBoom=true;
                for(int j=0;j<boomStr.length();j++){
                    if(list.get(list.size()-boomStr.length()+j)!=boomStr.charAt(j)){
                        isBoom=false;
                        break;
                    }
                }
                if(isBoom){
                    for(int j=0;j<boomStr.length();j++){
                        list.remove(list.size()-1);
                    }
                }
            }
        }
        for(int i=0;i<list.size();i++){
            sb.append(Character.toString(list.get(i)));
        }
        if(list.size()==0) sb.append("FRULA");
        System.out.println(sb);
    }
}
