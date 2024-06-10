package Test5;

import java.util.Scanner;

///*
//어떤 숫자가 11의 배수이거나 11의 배수보다 1 큰 숫자라면, 그 숫자를 "cool"하다고 하겠습니다.
//주어진 0 이상의 숫자가 cool하다면 true를 반환하세요.
//
//System.out.println(isCool(22)); // true (11의 배수)
//System.out.println(isCool(23)); // true (11의 배수보다 1 큼)
//System.out.println(isCool(24)); // false (11의 배수도 아니고, 11의 배수보다 1 크지도 않음)
//*/
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int a = sc.nextInt();
        System.out.println(isCool(a));

    }

    static String isCool(int a) {
        if (a > 0) {
            if (a % 11 == 0 || a % 11 == 1) {
                System.out.println("True");
            } else {
                System.out.println("not cool");
            }
        }
        return "";
    }
}

