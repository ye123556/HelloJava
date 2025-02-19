package chapter15.lecture;
// 20250219
@FunctionalInterface
interface MyFunction {
    void run();
}

@FunctionalInterface
interface MyCustomFunction {
    int function(int a);
}
