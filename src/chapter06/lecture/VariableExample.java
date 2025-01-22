package chapter06.lecture;
//20250122
public class VariableExample {
    public static void main(String[] args) {
        System.out.println("클래스 변수 (인스턴스 생성 없이 접근 가능):" + Scope.staticVariable);
        Scope.doStaticMethod();

        // 인슨턴스 생성
        Scope instance = new Scope(); // new 생성해줘야 인스턴스 사용o 아님 사용 불가

        System.out.println("인스턴스 변수 (접근하려면 인스턴스 필요): " + instance.instanceVariable);

        instance.doMethod();
    }
}
