package problemsoving.twopointers;

import java.util.*;

public class twopointers {
    //두 집합의 공통원소를 오름차순으로 정렬
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a); // 자동으로 a가 오름차순으로 정렬됨
        Arrays.sort(b);
        int p1 = 0, p2 =0;
        while(p1<n && p2<m){
            if(a[p1]==b[p2]){
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1]<b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args){
        twopointers t = new twopointers();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        for(int x : t.solution(n, m, a, b)) System.out.println(x+" ");
    }
}
