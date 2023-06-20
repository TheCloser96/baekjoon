package greedy;

/**
 * 문제: 2720
 * 제목: 세탁소 사장 동혁
 * 링크: https://www.acmicpc.net/problem/2720
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2720 {
    private final static int[] coinLv = {25, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력 준비
        int cnt = Integer.parseInt(br.readLine());  //입력할 수의 개수

        StringBuilder strb = new StringBuilder();   //출력할 문자열 준비

        //입력할 수의 개수 만큼 반복함
        for (int i = 0; i < cnt; i++) {

            int money = Integer.parseInt(br.readLine());    //입력된 돈을 int로 형 변환

            //coinLv의 배열의 크기 만큼 반복함
            for (int j = 0; j < coinLv.length; j++) {
                int coinCnt = (money / coinLv[j] == 0) ? 0 : money / coinLv[j];
                money -= (coinCnt * coinLv[j]);
                strb.append(coinCnt).append(" ");
            }

            strb.append("\n");
        }

        System.out.print(strb);

        br.close(); //입력 사용이후 제거
    }

}
