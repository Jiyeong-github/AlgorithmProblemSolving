package problemsoving.string;

import java.util.Locale;
import java.util.Scanner;

public class ValidPalindrome {
    //팰린드롬이나 앞이나 뒤나 같은 거
    public String solution(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]","");//A-Z까지 아닌 것들을 ""으로 대체
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args){
        ValidPalindrome VP = new ValidPalindrome();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(VP.solution(str));
    }
}
