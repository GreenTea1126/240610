package Test7;

import java.util.Scanner;

//3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
//하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
//기본적으로 중복되지 않는 숫자만 합산합니다.
//
//System.out.println(sumUnique(1, 2, 3)); // 6
//System.out.println(sumUnique(3, 2, 3)); // 2
//System.out.println(sumUnique(3, 3, 3)); // 0
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하시오");
        int a = sc.nextInt();
        System.out.println("두번째 숫자를 입력하시오");
        int b = sc.nextInt();
        System.out.println("세번째 숫자를 입력하시오");
        int c = sc.nextInt();
        System.out.print(sumUnique(a, b, c));
    }

    public static int sumUnique(int a, int b, int c) {
        if (a == b) {
            if (a == c) {
                return 0;
            }
        }
        return 0;

    }
}
