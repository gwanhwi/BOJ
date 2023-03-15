import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        ArrayList<String> arrList = new ArrayList<>();
        for(int i=0;i<n;i++){
            arrList.add(br.readLine());
        }
        List<String > newList = new ArrayList<>();
        arrList.sort(Comparator.naturalOrder());
        arrList.sort(Comparator.comparing(String::length));
        //길이 짧은 것 부터
        /*for(int i=0;i<arrList.size();i++){
            for(int j=0;j<arrList.size();j++) {
                if (arrList.get(j).length() == i)
                    newList.add(arrList.get(j));
            }
        }*/
        //같으면 사전순
        /*
        for(int i=0;i<newList.size();i++){
            for(int j=0;j<newList.size()-1;j++){
                if((newList.get(j).length()==newList.get(j+1).length())
                    && newList.get(j).compareTo(newList.get(j+1))>0){
                    String temp=newList.get(j);
                    newList.set(j,newList.get(j+1));
                    newList.set(j+1,temp);
                }
            }
        }*/
        //중복 제거
        newList= arrList.stream().distinct().collect(Collectors.toList());
        for(int i=0;i<newList.size();i++){
            System.out.println(newList.get(i));
        }

    }
}
