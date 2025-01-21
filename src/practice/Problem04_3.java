package practice;

// 두 주사위 누의 합이 5이면 실행을 멈춤
public class Problem04_3 {
    public static void main(String[] args) {
        while(true) {

            // 두 주사위의 합이 5이면 탈출(break)
            int num1 = (int) ((Math.random() * 6)+1);
            int num2 = (int) ((Math.random() * 6)+1);
            System.out.println("(" + num1 + ", " + num2 + ")");
                if(num1+num2 == 5)
                    break;

                }
        }

    }
