package problemsoving.string;

import java.util.Locale;
import java.util.Scanner;

public class SameString {
    //회문문자열이란 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
    public String solution(String str) {
        String answer = "YES";
//        str = str.toUpperCase();
//        int len = str.length();
//        for(int i=0; i<len/2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) return "NO";
//        }
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
                return answer;
        }

    public static void main(String[] args){
        SameString SS = new SameString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(SS.solution(str));
    }
}
