import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String str=br.readLine();
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        map.put('f',6);
        map.put('g',7);
        map.put('h',8);
        map.put('i',9);
        map.put('j',10);
        map.put('k',11);
        map.put('l',12);
        map.put('m',13);
        map.put('n',14);
        map.put('o',15);
        map.put('p',16);
        map.put('q',17);
        map.put('r',18);
        map.put('s',19);
        map.put('t',20);
        map.put('u',21);
        map.put('v',22);
        map.put('w',23);
        map.put('x',24);
        map.put('y',25);
        map.put('z',26);
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=map.get(str.charAt(i)) * Math.pow(31,i);
        }
        ans%=1234567891;
        System.out.println(ans);
    }
}
