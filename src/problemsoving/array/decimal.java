package problemsoving.array;

import java.util.Scanner;

public class decimal {
    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i){//j는 i으 배수만큼 돌아야 하기 때문에
                    ch[j]=1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        decimal DC = new decimal();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(DC.solution(n));
    }
}
