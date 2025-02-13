package chapter11.lecture;
// 20250210-4
class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    // toString() 재정의
    @Override
    public String toString() {
        return company + ", " + os + " 스마트폰"; } // ※ 작성부분
}

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        // 재정의 된 toString()을 호출
        String strObj = myPhone.toString();

        System.out.println(strObj);

        // 재정의 된 toString()을 호출하고 return 값을 받아 호출
        System.out.println(myPhone);
    }
}
