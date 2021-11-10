package problemsoving.array;

import java.util.Scanner;

public class TheStudentShown {
    //학생의 키가 앞에서 순서대로 주어질 때, 맨 앞에 서 있는 학생의 수를 구하는 프로그램 (학생의 키에 따라 보이는 여부가 다름)
    public int solution(int n, int[] arr){
        int answer = 1, max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args){
        TheStudentShown SS = new TheStudentShown();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
            System.out.println(SS.solution(n, arr));

    }
}
