import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        Integer[] arr = new Integer[numbers.length];
        for(int i=0;i<numbers.length;i++){
            arr[i]=Integer.valueOf(numbers[i]);
        }
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                String s1=o1.toString()+o2.toString();
                String s2=o2.toString()+o1.toString();
                return s2.compareTo(s1);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(Integer n : arr){
            sb.append(n);
        }
        if(sb.charAt(0)=='0') return "0";
        return sb.toString();
    }
}