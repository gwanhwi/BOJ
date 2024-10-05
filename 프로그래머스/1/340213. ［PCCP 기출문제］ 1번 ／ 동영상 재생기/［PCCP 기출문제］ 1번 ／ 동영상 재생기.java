class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer;
        for(int i=0;i<commands.length;i++){
            if(pos.compareTo(op_start)>=0 && pos.compareTo(op_end)<=0){
                pos=op_end;
            }
            int min=Integer.parseInt(pos.substring(0,2));
            int sec=Integer.parseInt(pos.substring(3,5));
            String mm="";
            String ss="";
            if(commands[i].equals("next")){
                sec+=10;
                if(sec>59){
                    min+=1;
                    sec-=60;
                }
                ss=Integer.toString(sec);
                mm=Integer.toString(min);
                if(sec/10 ==0){
                    ss="0"+ss;
                }
                if(min/10==0){
                    mm="0"+mm;
                }
                pos=mm+":"+ss;
                if(pos.compareTo(video_len)>0) pos=video_len;
            }
            else{
                sec-=10;
                if(sec<0){
                    min-=1;
                    sec+=60;
                }
                if(min<0) pos="00:00";
                else{
                    ss=Integer.toString(sec);
                    mm=Integer.toString(min);
                    if(sec/10 ==0){
                        ss="0"+ss;
                    }
                    if(min/10==0){
                        mm="0"+mm;
                    }
                    pos=mm+":"+ss;
                }                
            }
            if(pos.compareTo(op_start)>=0 && pos.compareTo(op_end)<=0){
                pos=op_end;
            }
        }
        return pos;
    }
}