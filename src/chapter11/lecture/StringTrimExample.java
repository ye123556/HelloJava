package chapter11.lecture;
// 20250210 - 오후
// trim() 메서드는 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고 리턴
// 앞뒤의 공백을 제거할 뿐 중간의 공백은 제거하지 않음
public class StringTrimExample {
    public static void main(String[] args) {
        String tel1 = "   02";
        String tel2 = "1            23   ";
        String tel3 = "   1234   ";

        String tel = tel1.trim() + "-" + tel2.replace(" ", "") + "-" + tel3.trim(); // tel2.trim().replace(" ", "")도 가능하다.
        System.out.println(tel);
    }
}
