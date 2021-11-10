package problemsoving.string;

import java.util.Scanner;

public class PressString {
    public String solution(String s){
        String answer = "";
        s = s + "";
        int cnt = 1;//cnt는 1로 초기화, i하고 i+1이 같은 지 봄
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else{//안 같으면 문자열에 i+1을 붙여버림
                answer+= s.charAt(i);
                if(cnt>1) answer+= String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        PressString PS = new PressString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(PS.solution(str));
    }
}
