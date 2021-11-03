package problemsoving.string;
import java.util.*;

public class FindingString {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //index 접근 방법
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt((i))==t)answer++;
//        }
        //for-each : Stirng이 바로 올 수 없으므로 문자배열 생성
        for(char x: str.toCharArray()){
            if(x==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        FindingString T = new FindingString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        //charAt : String의 0번째 문자를 가져 옴.
        System.out.print(T.solution(str,c));
    }
}
