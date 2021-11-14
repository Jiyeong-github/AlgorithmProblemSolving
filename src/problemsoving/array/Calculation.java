package problemsoving.array;

import java.util.Scanner;

public class Calculation {
    //총 점수를 계산하는 프로그램
    public int solution(int n, int[] arr){
        int answer = 0, cnt= 0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+= cnt;
            }
            else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args){
        Calculation calc = new Calculation();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(calc.solution(n, arr));
    }
}
