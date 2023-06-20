package greedy;

/**
 * 문제: 14720
 * 제목: 우유 축제
 * 링크: https://www.acmicpc.net/problem/14720
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N14720 {

    private static int chanceCnt = 0;  //마실수 있는 기회
    private static int[] milkMarketList;   //우유를 파는 가게들 목록

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력 준비

        int milkMarketListCnt = Integer.parseInt(br.readLine());
        milkMarketList = new int[milkMarketListCnt];

        String strMilkMarketList = br.readLine();
        makingList(strMilkMarketList);

        StringBuilder strb = new StringBuilder();
        System.out.print(strb.append(calChanceCnt()));
    }

    private static void makingList(String strMilkMarketList) {
        StringTokenizer st = new StringTokenizer(strMilkMarketList);
        int cnt = 0;

        while (st.hasMoreTokens()) {
            milkMarketList[cnt] = Integer.parseInt(st.nextToken());
            ++cnt;
        }
    }

    private static int calChanceCnt() {
        int startPoint = 0;

        for (int milk : milkMarketList) {
            if (milk == startPoint) {
                chanceCnt++;

                startPoint++;
                startPoint = (startPoint == 3)? 0:startPoint;
            }
        }

        return chanceCnt;
    }
}
