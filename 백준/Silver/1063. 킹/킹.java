import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] kingPosition = changePositionToArray(st.nextToken());
        int[] rockPosition = changePositionToArray(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            String move = br.readLine();
            int[] nextKingPos=move(move, kingPosition);
            if(Arrays.equals(nextKingPos,rockPosition)){
                int[] nextRockPos=move(move,rockPosition);
                if(!Arrays.equals(nextRockPos,rockPosition)) {
                    kingPosition=nextKingPos;
                    rockPosition=nextRockPos;
                }
            }
            else{
                kingPosition=nextKingPos;
            }
        }
        sb.append(changePositionToString(kingPosition)).append("\n");
        sb.append(changePositionToString(rockPosition));
        System.out.println(sb);
    }
    public static int[] changePositionToArray(String position){
        char r = position.charAt(0);
        char c = position.charAt(1);
        return new int[] {r-'A', c-'1'};
    }
    public static String changePositionToString(int[] position){
        char r = (char)(position[0]+'A');
        char c = (char)(position[1]+'1');
        StringBuilder sb = new StringBuilder();
        sb.append(r).append(c);
        return sb.toString();
    }
    public static int[] move(String move, int[] position){
        int nextRow=position[0];
        int nextCol=position[1];
        if(move.equals("R")){
            nextRow++;
        }
        else if(move.equals("L")){
            nextRow--;
        }
        else if(move.equals("B")){
            nextCol--;
        }
        else if(move.equals("T")){
            nextCol++;
        }
        else if(move.equals("RT")){
            nextRow++;
            nextCol++;
        }
        else if(move.equals("LT")){
            nextRow--;
            nextCol++;
        }
        else if(move.equals("RB")){
            nextRow++;
            nextCol--;
        }
        else if(move.equals("LB")){
            nextRow--;
            nextCol--;
        }
        if(nextRow>=0 && nextRow<8 && nextCol>=0 && nextCol<8){
            return new int[] {nextRow,nextCol};
        }
        return position;
    }
}