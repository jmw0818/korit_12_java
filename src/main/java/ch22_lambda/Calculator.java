package ch22_lambda;

@FunctionalInterface        // 함수형 인터페이스형이라는 것을 나타냄
public interface Calculator {
    int compute(int a, int b);
}
