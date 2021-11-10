package problemsoving.string;

import java.util.Scanner;

public class FlipThatWord {
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 그대로 냅두는 문자열 출력
    public String solution(String str){
        String answer; //뒤집은 문자 리턴하기
        char[] s = str.toCharArray(); //이 String 기반 문자 배열 하나 생성
        int lt = 0, rt = str.length()-1; //0번 인덱스부터니까 -1 해주기
        while(lt < rt){
            if(Character.isAlphabetic(s[lt])) lt++;//캐릭터의 위 함수를 쓰면 알파벳인지 아닌지 확인 가능
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s); //정수를 string으로 변환
        //s문자 배열을 스트링으로 변환해주기
        return answer;
    }
    public static void main(String[] args){
        FlipThatWord FTW = new FlipThatWord();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(FTW.solution(str));
    }
}
