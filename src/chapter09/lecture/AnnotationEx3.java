package chapter09.lecture;
// 20250217
import java.util.ArrayList;

/*class NewClass {
    int newField;

    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated

    public int getOldField() {
        return oldField;
    }*/

public class AnnotationEx3 {
    public static void main(String[] args) {
        NewClass nc = new NewClass(); // AnnotationEx2에서 가져옴

        nc.oldField = 10; // Deprecated가 붙은 대상을 사용
        System.out.println(nc.getNewField()); // Deprecated가 붙은 대상을 사용

        @SuppressWarnings("unchecked") // 지네릭스 관련 경고 억제
        ArrayList list = new ArrayList(); // 타입을 지정하지 않음
    }
}
