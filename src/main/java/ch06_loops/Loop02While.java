package ch06_loops;
/*
    1부터 100까지 출력하시오.
    실행 예
    1
    2
    3
    ...
    100
 */

public class Loop02While {
    public static void main(String[] args) {
        int i = 1;
//        while (i < 101) {
//            System.out.println(i);
//            i++;
//        }
        /*
            2번 문제
            1 2 3 4 5 6 ... 10
            11 12 13 ... 20
            ...
            91 92 ... 100
            으로 출력하시오.
         */

        while (i < 101){
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
            i++;
        }
        System.out.println("-------------------");
        i = 0;
        while (i < 10) {
            System.out.println((1+10*i) + " " + (2+10*i) + " " + (3+10*i) + " "+ (4+10*i) + " "+ (5+10*i) + " "+ (6+10*i) + " "
                    + (7+10*i) + " "+ (8+10*i) + " "+ (9+10*i) + " " + (10+10*i));
            i++;
        }
        System.out.println("-------------------");
        i=1;
        while (i < 101){
            System.out.println(i + " " + (i+1) + " " + (i+2)+ " " + (i+3)+ " " + (i+4)+ " " + (i+5)+ " " + (i+6)
                    + " " + (i+7)+ " " + (i+8)+ " " + (i+9));
            if (i % 10 == 0) {
                System.out.println();
            }
            i += 10;
        }


    }
}
