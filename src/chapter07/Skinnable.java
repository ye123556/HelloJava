package chapter07;
// 20250206
public interface Skinnable {
    final static int BLACK = 0;
    final static int RED = 1;
    final static int GREEN = 2;
    final static int BLUE = 3;
    final static int YELLOW = 4;

    void changeSkin(int skin); // 스킨 변경

}
