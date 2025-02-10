package chapter11.lecture;
// 20250210-오전
public class ByteToStiringExample {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = new String(bytes, 6, 4); // byte의 인덱스 6부터 4개를 넘겨줌
        // java만 출력
        System.out.println(str2);
    }
}
