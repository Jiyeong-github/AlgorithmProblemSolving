package problemsoving.string;
import java.util.*;

public class ChangeLetter {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
//            else answer+=Character.toLowerCase(x);
            //아스키 넘버 방법 : 대문자 65 / 소문자 97~ (차이 : 32)
            if(x>=97 && x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args){
        ChangeLetter cl = new ChangeLetter();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(cl.solution(str));
    }
}
