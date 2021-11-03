package problemsoving.string;

import java.util.Scanner;

public class AWordInSentence {
    public String solution(String str){
        String answer = "";
//        int m = Integer.MIN_VALUE; //가장 작은 값으로 시작
//        String[] s = str.split("  ");
//        for(String x:s){
//            int len = x.length();
//            if(len > m){
//                m = len;
//                answer = x;
//            }
//        }
        int m = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' '))!= -1){
            //indexOf : 띄어쓰기 값 반환
            String tmp = str.substring(0, pos);
            //substring 0부터 pos까지 반환
            int len = tmp.length();
            if(len > m){ //>= 이렇게 해버리면 더 큰 단어로 바꿔버림
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
            //pos 공백 뒤부터 잘라냄
        }if(str.length()>m) answer=str; //마지막 단어 길이가 m보다 크면 str 처리 해주기
        return answer;
    }
    public static void main(String[] args){
        ChangeLetter cl = new ChangeLetter();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(cl.solution(str));
    }
}
