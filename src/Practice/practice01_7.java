package Practice;

import java.util.Scanner;

public class practice01_7 {
    public static void main(String[] args) {
        boolean needRun = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(needRun) {

            System.out.println("__________________");
            System.out.println("1.예금 | 출금 | 3.잔고 | 4.종료");
            System.out.println("__________________");
            System.out.print("선택> ");

            int cmd = scanner.nextInt();

            switch(cmd) {
                case 1: // 예금
                    System.out.print("예금액> ");
                    int deposit = scanner.nextInt();

                    balance += deposit;
                    break;
                case 2: // 출금
                    System.out.print("출금액> ");
                    int withdrawal = scanner.nextInt();

                    if(balance >= withdrawal) {
                        balance -= withdrawal;
                    } else {
                        System.out.println("잔고가 부족합니다.");
                    }
                    break;
                case 3: // 잔고
                    System.out.println("잔고> ");
                    System.out.println(balance);
                case 4:
                    needRun = false;
                    // 종료
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }


         System.out.println("프로그램 종료");
            }








            // String str1 = scanner.nextLine();
           // System.out.print("잔고> ");
           // String str2 = scanner.nextLine();
        }
       //System.out.println("프로그램 종료");

