package practice;

//1~100까지의 정수 중에 3의 배수의 총합은?
public class Problem04_2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=3; i <= 100; i+=3) {
            sum += i;
            //System.out.println(i); //sum += i;
        }

        System.out.println("3의 배수의 총합은?");
        System.out.println(sum + "입니다.");
    }
}

