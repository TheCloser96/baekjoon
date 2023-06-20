package greedy;

/**
 * 문제: 5585
 * 제목: 거스름돈
 * 링크: https://www.acmicpc.net/problem/5585
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5585 {

    private static int[] coinSlot = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력 준비

        int payback = (1000-Integer.parseInt(br.readLine()));   //돌려줘야 되는 거스름돈 가격

        System.out.println(getCnt(payback));   //최종출력

        br.close();
    }

    private static int getCnt(int payback) {
        int currentPayback = payback;
        int cnt = 0;

        for (int coin : coinSlot) {
            if (currentPayback != 0) {  //거스름돈을 줄 수 없는 경우 제외
                if (currentPayback/coin != 0) { //거스름돈 단위가 거슬러야 할 몫보다 큰지 비교

                    //거스름돈 단위별로 거슬러 주고 거슬러 준 동전의 개수를 누적
                    int coins = currentPayback / coin;
                    cnt += coins;

                    currentPayback -= coins*coin;   //거스름돈 단위별로 거슬러 준 금액만큼 차감
                }
            } else {    //거스름돈을 주지 않아도 되는 경우 (0원일 경우)
                break;
            }
        }

        return cnt;
    }
}
