package chapter03.lecture;

// 논리연산자(&&, ||, ^, !)
public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        // 대문자 구분
        if(charCode >= 65 & charCode <= 90) {
            System.out.println("대문자군요.");
            // 조건식이 true라면 실행되는 실행문을 작성
        }

        //소문자 구분
        if(charCode >= 97 && charCode <= 122) {
            System.out.println("소문자군요.");
        }

        // 0 ~ 9
        if(!(charCode >= 48) && !(charCode <= 57)) { //48보다 크고 57보다 작다(!빼면) // 48보다 크거나 같고 57보다 작거나 같다, 48보다 작지 않고 57보다 크지 않다
            System.out.println("0 ~ 9숫자군요");
        }

        int value = 6;

        if((value % 2 == 0 | value % 3 == 0)) { // 짝수(2의 배수) 또는 3배수
            System.out.println("2 또는 3의 배수군요");
        }
        if((value % 2 == 0 || value % 3 == 0)) {
            System.out.println("2 또는 3의 배수군요.");
        }
    }

}
