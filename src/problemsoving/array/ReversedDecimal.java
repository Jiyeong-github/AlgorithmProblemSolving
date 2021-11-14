package problemsoving.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversedDecimal {
    //첫 줄에 뒤집은 소수 출력
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        return answer;
    }

    public static void main(String[] args){
        ReversedDecimal RD = new ReversedDecimal();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x: RD.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}
