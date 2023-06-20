package greedy;

/**
 * 문제: 10162
 * 제목: 전자레인지
 * 링크: https://www.acmicpc.net/problem/10162
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10162 {
    private final static int[] buttonArr = {300, 60, 10}; //버튼 3개를 초단위로 분류

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력 준비
        StringBuilder strb = new StringBuilder();   //출력 준비

        int inputTime = Integer.parseInt(br.readLine());

        if (inputTime%10 != 0) {
            strb.append("-1");
        } else {
            for (int button : buttonArr) {
                int q = inputTime / button;
                inputTime -= (q*button);
                strb.append(q).append(" ");
            }
        }

        System.out.print(strb);

        br.close(); //사용한 자원 닫아주기
    }
}
