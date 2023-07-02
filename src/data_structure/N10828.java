package data_structure;

/**
 * 문제: 10828
 * 제목: 스택
 * 링크: https://www.acmicpc.net/problem/10828
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N10828 {

    private static Stack<Integer> stack = new Stack<>();    //스택
    private static List<Integer> outputStrList = new ArrayList<>(); //후에 출력될 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력 준비

        int cnt = Integer.parseInt(br.readLine());  //총 입력할 수

        StringTokenizer st; //입력받은 문자열을 분리하는 용도로 사용되는 변수
        String compareStr;  //처음에 입력되는 명령문이 push top 등과 같은 것들을 저장하는 변수

        //입력한 수 만큼 명령어를 받는다
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            compareStr = st.nextToken();

            if (compareStr.equals("push")) {
                Integer input = Integer.valueOf(st.nextToken());
                stack.push(input);
            } else {
                switch (compareStr) {
                    case "pop" -> pop();
                    case "size" -> size();
                    case "empty" -> empty();
                    case "top" -> top();
                }
            }
        }

        //최종적으로 출력해야될 내용이 저장된 배열을 출력하는 작업
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < outputStrList.size(); i++) {
            if (i == (outputStrList.size()-1)) {
                stb.append(outputStrList.get(i));
            } else {
                stb.append(outputStrList.get(i)).append("\n");
            }
        }
        System.out.print(stb);
    }

    private static void pop() {
        try {
            outputStrList.add(stack.pop());
        } catch (EmptyStackException e) {
            outputStrList.add(-1);
        }
    }

    private static void size() {
        outputStrList.add(stack.size());
    }

    private static void empty() {
        outputStrList.add(stack.empty() ? 1 : 0);
    }

    private static void top() {
        try {
            outputStrList.add(stack.peek());
        } catch (EmptyStackException e) {
            outputStrList.add(-1);
        }
    }
}

