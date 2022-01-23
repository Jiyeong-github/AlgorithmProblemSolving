package problemsoving.array;


import java.util.Scanner;

public class Peak {
    //지도 정보가 n*n 격자판. 그 격자에는 그 지역의 높이가 쓰여짐.
    //각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역.
    //봉우리 지역은 몇 개인가?

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        //꼭 static으로 안 잡아도 된다.
        public int solution(int n, int[][] arr) {
            int answer = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    boolean flag = true;
                    for(int k=0; k<4; k++){
                        int nx = i+dx[k];
                        int ny= j+dy[k];
                        if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag) answer++;
                }
            }
            return answer;
        }


        public static void main(String[] args) {
            Peak p = new Peak();
            Scanner kb = new Scanner(System.in);
            int n = kb.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = kb.nextInt();
                }
            }
            System.out.print(p.solution(n, arr));
        }
    }
