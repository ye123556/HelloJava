package chapter15.lecture;
// 20250219
public class LambdaEx1 {
    public static void main(String[] args) {
        // 람다식으로 MyFuction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyfuction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }

    private static MyFunction getMyfuction() { // 반환 타입이 MyFunction
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    static void execute(MyFunction f) {
        f.run();
    }
}

