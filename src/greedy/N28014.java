package greedy;

/**
 * 문제: 28014
 * 제목: 첨탑 밀어서 부수기
 * 링크: https://www.acmicpc.net/problem/28014
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N28014 {

    private static int cnt;
    private static int[] towerLength;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력 준비

        cnt = Integer.parseInt(br.readLine());  //리스트에 넣을 수
        towerLength = new int[cnt]; //첨탑이 저장될 공간 초기화
        

        br.close(); //입력 자원 닫기
    }

    //입력받는 그대로 정수화 하여 해당 배열에 넣는 함수 제작예정
}
