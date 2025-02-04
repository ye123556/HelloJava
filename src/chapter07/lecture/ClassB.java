package chapter07.lecture;
//20250204-4
public class ClassB {
    // 같은 패키지에 속해있어 접근 가능
    public void method() {
        ClassA a= new ClassA(); // 접근 가능
        a.field = "value";
        a.method();


    }
}
