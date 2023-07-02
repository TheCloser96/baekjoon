package data_structure;

/**
 * 문제: 9093
 * 제목: 단어 뒤집기
 * 링크: https://www.acmicpc.net/problem/9093
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력 준비
        String inputSentence;   //입력된 문장 저장하는 용도
        String[] reverseSentenceArr;    //반대로되어있는 문장을 해당 배열에 저장하는 용도로 사용됨

        int inputCnt = Integer.parseInt(br.readLine()); //입력할 회수
        reverseSentenceArr = new String[inputCnt];  //배열 크기가 정해졌으므로 선언

        for (int i = 0; i < reverseSentenceArr.length; i++) {
            inputSentence = br.readLine();  //사용자가 입력한 문장
            reverseSentenceArr[i] = reverseSentence(inputSentence);  //사용자가 입력한 문장을 반대로 전환한 이후 해당 문장을 배열에 저장
        }

        //좌우 반전이 완료된 문자열을 StringBuilder에 저장하는 과정
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < reverseSentenceArr.length; i++) {
            if (i < (reverseSentenceArr.length-1)) {
                stb.append(reverseSentenceArr[i]).append("\n");
            } else {
                stb.append(reverseSentenceArr[i]);
            }
        }

        System.out.println(stb);
    }

    private static String reverseSentence(String sentence) {
        StringBuilder stb = new StringBuilder();    //좌우 반전된 단어들이 모여 문장을 이루게되는 변수
        StringTokenizer st = new StringTokenizer(sentence); //사용자가 입력한 단어를 좌우 반전작업에 쓰일 변수

        StringBuilder reverseStr = new StringBuilder(); //좌우 반전된 단어가 저장될 변수

        /**
         * 사용자가 입력한 문장의 공백값을 기준으로 하여 단어를 가져온 이후
         * 좌우 반전한 단어를 계속해서 저장하는 과정
         */
        while (st.hasMoreTokens()) {
            //단어를 가져온 후, 해당 단어의 알파벳배치를 좌우 반전으로 변환하는 작업
            String str = st.nextToken();
            for (int i = (str.length()-1); i >= 0; i--) {
                reverseStr.append(str.charAt(i));
            }

            stb.append(reverseStr).append(" "); //좌우 반전된 단어를 저장
            reverseStr = new StringBuilder();   //초기화
        }

        return stb.toString();  //최종적으로 좌우 반전된 단어들로 이뤄진 문장을 반환
    }
}
