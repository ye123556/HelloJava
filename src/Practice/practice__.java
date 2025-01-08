package Practice;

public class practice__ {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j > 4-i? "*" : " ");
            }
            System.out.println();
        }
    }
}
