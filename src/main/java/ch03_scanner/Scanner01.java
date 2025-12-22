package ch03_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        String name = "정명원";
        System.out.println(name);

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        name = scanner.nextLine();
        System.out.println(name);
        /*
            1. println vs print
                ln  : line의 의미로 실행하고 마지막에 개행
                print로 작성하면 동일 라인에 그대로 연결됨
            2. nextLine vs next 등 다른 차이도 있음 -> 내일 수업

            Scanner scanner = new Scanner(System.in);이 객체 생성을 했고
            scanner.nextLine();은 메서드 호출을 한것임.

            class Solution {
            public int solution(int n, int m, int[] section) {
            int answer = 0;
            int num = 0;
            for (int loc = 1; loc <= n; loc++){
                if (section[num] == loc) {
                    loc += m-1;
                    answer++;
                    num++;
                }
            }
            return answer;
            }
        }
         */
    }
}
