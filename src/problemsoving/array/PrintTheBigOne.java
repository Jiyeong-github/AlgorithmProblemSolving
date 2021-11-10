package problemsoving.array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintTheBigOne {
    //N개의 정수 입력 받기 -> 자신의 앞 수보다 큰 수만 출력하는 프로그램
    public ArrayList<Integer> soolution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args){
        PrintTheBigOne PB = new PrintTheBigOne();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x: PB.soolution(n, arr)){
            System.out.println(x + "");
        }
    }
}
