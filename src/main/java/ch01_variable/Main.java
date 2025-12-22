package ch01_variable;
/*
    주석(comment) '/*' + Enter
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println(1);
        System.out.println('1');
        System.out.println("1");
        /*
            데이터를 직접 사용하는 방식 '하드 코딩'
            하드 코딩 : 명령문에 데이터(변수에 대입되지 않은 데이터 : 리터럴(literal))를
                바로 넣는 것.
            변수(variable)
         */
        int scoreEnglish = 100;     // 변수 선언 및 초기화
        System.out.println(scoreEnglish);
        int scoreKorean;            // 변수 선언
        scoreKorean = 99;           // 초기화
        System.out.println(scoreKorean);

        String introduction = "안녕하세요, 저는 이번 국비 과정을 수강하게 된 정명원입니다.";
        System.out.println(introduction + " 앞으로 잘 부탁드립니다.");
        /*
            변수 명명 규칙 :
                1. 카멜 표기법(camel case)
                    첫 문자는 소문자로 / 복수의 단어는 두 번째 단어의 시작만 대문자
                    ex) 한 단어 : result / 복수 단어 : myTestResult
                2. 특수문자 지양

                cf) python의 경우 스네이크 표기법(snake case)
                    ex) my_test_result
         */
        System.out.println("국어 점수(변경전) : " + scoreKorean);
        scoreKorean = 100;
        System.out.println("국어 점수(변경후) : " + scoreKorean);

        char name1 = '안';
        char name2 = '근';
        char name3 = '수';

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);  // print의 경우 변수의 자료형을 따라감.

        System.out.println(name1 + name2 + name3);  // 결과값 : 144732
        // 하지만 변수의 자료형이 char이기 때문에 결과값이의도한 대로 나오지 않음.
        System.out.println("" + name1 + name2 + name3); // 결과값 : 안근수
        System.out.print(name1);
        System.out.print(name2);
        System.out.print(name3);
        System.out.println();
        /*
            '문자' 와 '문자열'의 구분
            ""를 사용하여 문자열로 인식하게 해서 원하는 결과값을 만든다.

            작은따옴포('')는 '문자'를 표시하기 위함
            큰따옴표("")는 "문자열"을 표시하기 위함

            강사님 깃허브 아이디 : maybeags

         */
        name1 = '정';
        name2 = '명';
        name3 = '원';
        String fullName = "" + name1 + name2 + name3;
        System.out.println(fullName);
        System.out.println("안녕하세요 제 이름은 " + fullName + "입니다.");

        // Integer 자료형 (추후 학습)
        // ch02_operator 패키지, Operator01 자바 파일(클래스) 생성
    }
}
