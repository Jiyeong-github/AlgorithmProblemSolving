package problemsoving.string;

import java.util.Scanner;

public class TheShortestWay {
    //가장 짧은 문자거리
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) { //10번 인덱스부터 움직이기 때문
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i],p); //다시 도니까..
            }
        }
        return answer;
    }

    public static void main(String[] args){
        TheShortestWay TSW = new TheShortestWay();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : TSW.solution(str, c)){ //문자열과 문자를 넘김
            System.out.println(x + "");
        }
    }
}
