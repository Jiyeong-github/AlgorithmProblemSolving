package problemsoving.string;

import java.util.Scanner;
public class PrintNumber {
    public String solution(String s){
//        int answer = 0;
        String answer = "";
//        for (char x: s.toCharArray()) {
//            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
//        }
        for(char x: s.toCharArray()) {
            if (Character.isDigit(x)) answer+=x; // isDigit는 숫자냐고 묻는 거
        }
        return answer;
    }

    public static void main(String[] args){
        PrintNumber PN = new PrintNumber();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(PN.solution(str));
    }
}
