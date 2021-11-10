package problemsoving.array;

import java.util.Scanner;

public class Fibonacci {
    //피보나치 수열이란 앞의 2개의 수를 합해 다음 숫자가 되는 수열
    //입력은 피보나치 수열의 총 항의 수

//    public int[] solution(int n){
//        int[] answer = new int[n];
//        answer[0]=1;
//        answer[1]=1;
//        for(int i=2; i<n; i++){
//            answer[i]=answer[i-2]+answer[i-1];
////        }
//        return answer;
//    }
    public  void solution(int n){//배열 안 쓰는 경우
        int a =1, b=1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Fibonacci FC = new Fibonacci();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        FC.solution(n);
//        for(int x : FC.solution(n)) System.out.print(x+" ");
    }
}
