package chapter03.lecture;

public class IncreaseDecreaseOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("--------------------");
        x++; // ++ 연산 x = x + 1;
        ++x;
        System.out.println("x = " + x);

        System.out.println("--------------------");
        y--; // -- 연산 x = x - 1;
        --y;
        System.out.println("y= " + y);

        System.out.println("--------------------");
        z = x++; // z = 12 + 1;
        //z = x; // 12
        //x = x + 1; // 13
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("--------------------");
        z = ++x;
        //x = x + 1; //  14
        //z = x; // 14
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("--------------------");
        z = ++x + y++; // x = 14, y = 8
        System.out.println("z = " + z); // z = 23
        System.out.println("x = " + x); // x = 15
        System.out.println("y = " + y); // y = 9

    }
}
