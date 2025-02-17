package Test2;

import java.util.Scanner;

/*  경찰이 당신을 과속으로 잡았을 때 내야 할 벌금을 계산하는 코드를 작성해보겠습니다.
    만약 당신의 속도가 60 이하라면 벌금은 없습니다.
    속도가 61에서 80 사이(포함)라면 벌금은 100원입니다.
    속도가 81 이상이라면 벌금은 200원입니다.
    단, 휴일인 경우 속도 한도가 5 더 높아집니다.

    속도가 60 이하라면 벌금은 0원입니다.
    속도가 61 이상이라면 벌금은 100원입니다.
    만약 휴일이라면 속도가 65라도 벌금은 0원입니다.*/
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("속력을 입력하세요");
        int speed = sc.nextInt();

        System.out.println("주말인가요? (true/false)");
        boolean isholiday = sc.nextBoolean();

        System.out.println("벌금은 " + speedRacer(speed, isholiday));
    }

    static String speedRacer(int speed, boolean isHoliday) {
        if (isHoliday) {
            if (speed >= 86) {
                return "200원";
            } else if (speed <= 65) {
                return "벌금없음";
            } else {
                return "100원";
            }
        }
        if (speed >= 81) {
            return "200원";
        } else if (speed <= 60) {
            return "없음";
        } else {
            return "100원";
        }
    }
}
