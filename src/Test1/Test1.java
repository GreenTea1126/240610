package Test1;
//for while 재귀함수 언제 사용할지?
//상관은 없지만은...! 각각의 장점을 따져보면
//for나 while 은 반복의 횟수가 명확할때 많이 사용하고 직관적이다
//재귀함수(스스로를 안에서 사용) 코드가 간결한데 구조파악이 어렵다...?


//// 문자열 데이터를 전달 받으면 각각의 문자열 사이에 @ 표시를 집어 넣는 함수를 만들어 봅니다.
//// 단, 재귀 함수를 이용하여 풀어보세요.
//System.out.println(printAt("hello")); // "h@e@l@l@o"
//

//재귀함수의 기본형잡고
// 첫번째 문자 다음에 @ 넣는 방법 일단 해보기
//str이라는 인자를 통해 받는다
//첫문자에 접근하려면?
public class Test1 {
    public static void main(String[] args) {
        System.out.println(printAt("helloworld")); // "h@e@l@l@o"


    }

    static String printAt(String str) {
        if (str.length() == 0) {
            return str;
        }
        return str.charAt(0) + "@" + printAt(str.substring(1));
    }
}


//아래는 와일문