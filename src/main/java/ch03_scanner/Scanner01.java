package ch03_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
//        String name = "정명원";
//        System.out.println(name);
//
        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        name = scanner.nextLine();                  // scanner.next(); 와 차이점?
//        System.out.println(name);
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

            3. next (Int / Double / Boolean, ... etc) vs. nextLine
                - nextLine()은 띄어쓰기를 허용. enter키 기준으로 데이터가 변수에 저장됨.
                -> 그래서 scanner.nextLine()으로 사용했을 떄 kim il이 모두 저장가능했음.
                - 나머지 (next)는 허용이 안돼서 kim 2를 입력했을 때, kim만 저장이 됨.
                - nextLine()이 엔터키 기준으로 입력되는 것은 어떤 부분에서 애매한 경우도 있다.
         */
//        System.out.println("올해는 몇 년도 인가요? >>> ");
//        int year = scanner.nextInt();
//        System.out.println("당신의 이름은 무엇인가요? >>> ");
//        String name2 = scanner.nextLine();
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name2);

        /*
            이상의 코드의 문제점은 47번 라인이 실행됐을 떄 테이터를 입력 받지 않고
            넘어가서 이후의 라인이 실행되는데,
            이유는 nextInt()에서 값을 입력하고 Enter를 치게 되어
            그 다음인 nextLine()에서도 Enter를 받아들여서 빈 값인 상태로 실행됨.
         */
        System.out.print("올해는 몇 년도 인가요? >>> ");
        int year = scanner.nextInt();
        // 해결방법 : enter키를 받아주는 nextLine()을 하나 더 써줌.
        scanner.nextLine();     // 데이터를 사용할 필요가 없기 때문에 변수를 생성하지 않아도 됨.
        System.out.print("당신의 이름은 무엇인가요? >>> ");
        String name2 = scanner.nextLine();
        System.out.println("연도 : " + year);
        System.out.println("이름 : " + name2);






        scanner.close();
    }
}
