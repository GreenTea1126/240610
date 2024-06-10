package Test3;

import java.util.Scanner;

/**
 * 세 개의 정수 a, b, c가 주어졌을 때,
 * 두 개의 정수를 더해서 세 번째 정수를 만들 수 있으면 true를 반환하는 코드를 작성합니다.
 * 메서드 본문은 단 한 줄의 코드로 작성되어야 합니다.
 * <p>
 * <p>
 * twoSumOne(1, 2, 3)  --->true
 * twoSumOne(3, 1, 2)  --->true
 * twoSumOne(3, 2, 2)  --->false
 */

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int a = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int b = sc.nextInt();
        System.out.println("세번째 숫자를 입력하세요");
        int c = sc.nextInt();
        System.out.println(twoSumOne(a, b, c));
    }

    public static boolean twoSumOne(int a, int b, int c) {
        return (a + b) == c;
    }
}
