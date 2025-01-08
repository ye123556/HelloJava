package Chapter04.lecture;

public class WhilePrintFrom1To10Example {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);

            i++; // i++가 없으면 1만 반복
        }
    }
}
