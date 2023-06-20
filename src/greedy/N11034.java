package greedy;

/**
 * 문제: 11034
 * 제목: 캥거루 세마리2
 * 링크: https://www.acmicpc.net/problem/11034
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11034 {

    private static int S;   //작은 수 저장 변수
    private static int M;   //중간 수 저장 변수
    private static int L;   //큰 수 저장 변수

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력 준비

        String getStr;  //EOF 변수
        while ((getStr = br.readLine()) != null) {  //EOF 관련 루프 시작

            //입력받은 라인의 문자열을 Integer 처리 후 각각 변수에 기입하는 작업
            StringTokenizer st = new StringTokenizer(getStr);
            S = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            int highScore = getJumpPointHighScore(S, M, L);
            System.out.println(highScore);
        }   //EOF 관련 루프 종료

        br.close();
    }

    //두 개의 숫자를 기준으로 사이의 정수값들의 개수를 계산하는 메서드
    private static int getJumpPointHighScore(int sNum, int mNum, int LNum) {
        int distance1 = mNum - sNum -1;
        int distance2 = LNum - mNum -1;

        return Math.max(distance1, distance2);
    }
}
