package chapter07.lecture;
//20250204-3
public class ClassA {
    // protectied 접근 제한자는 같은 패키지인 경우와
    // 다른 패키지에서 상속받아 자식 클래스인 경우만 접근을 허용
    protected String field;

    protected ClassA() {}

    protected void method() {}
}
