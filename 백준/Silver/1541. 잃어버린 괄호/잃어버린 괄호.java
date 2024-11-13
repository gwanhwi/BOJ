import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        List<String> operatorList = new ArrayList<>();
        List<String> operandList = new ArrayList<>();
        List<String> plusList = new ArrayList<>();
        int index=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+' ||str.charAt(i)=='-'){
                operandList.add(str.substring(index,i));
                operatorList.add(str.substring(i,i+1));
                index=i+1;
            }
        }
        operandList.add(str.substring(index,str.length()));
        System.out.println(calculate(operandList,operatorList));
    }
    public static int calculate(List<String> operandList,List<String> operatorList){
        List<String> list = new ArrayList<>();
        int operandIdx=0;
        for(int i=0;i<operatorList.size();i++){
            if(operatorList.get(i).equals("+")){
                int sum=Integer.parseInt(operandList.get(operandIdx))+Integer.parseInt(operandList.get(operandIdx+1));
                operandList.set(operandIdx,Integer.toString(sum));
                operandList.remove(operandIdx+1);
            }
            else if(operatorList.get(i).equals("-")){
                operandIdx++;
            }
        }
        int sum=Integer.parseInt(operandList.get(0));
        for(int i=1;i<operandList.size();i++){
            sum-= Integer.parseInt(operandList.get(i));
        }
        return sum;
    }
}
