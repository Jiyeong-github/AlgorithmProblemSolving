package problemsoving.string;

import java.util.Scanner;

public class EliminateTheDuplicatedWord {
    //소문자로 된 한 개의 문자열이 입력되면 중복된 문자를 제거하고 출력하기.
    //중복이 제거된 문자열의 각 문자는 원래 문자열의 순서 유지.
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+""+i+""+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args){
        EliminateTheDuplicatedWord ETDW = new EliminateTheDuplicatedWord();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(ETDW.solution(str));
    }
}
