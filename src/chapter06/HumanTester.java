package chapter06;
//20250124 - 6
public class HumanTester {
    public static void main(String[] args) {
        Human gildong = new Human("홍길동", 170, 60);
        Human chulsu = new Human("김철수", 166, 72);

        gildong.gainWeight(3); // 홍길동이 3kg 쪘다. gainWeight에 파라미터 전달
        chulsu.reduceWeight(5); // 김철수가 5kg 빠쪘다. reduceWeight에 파라미터 전달
        /*gildong.name = "홍길동";
        gildong.height = 170;
        gildong.weight = 60;

        chulsu.name = "김철수";
        chulsu.height = 166;
        chulsu.weight = 72;*/

        System.out.println("이름" + gildong.getName());
        System.out.println("신장:" + gildong.getHeight() + "cm");
        System.out.println("체중:" + gildong.getWeight() + "kg");
        System.out.println();
        System.out.println("이름" + chulsu.getName());
        System.out.println("신장:" + chulsu.getHeight() + "cm");
        System.out.println("체중:" + chulsu.getWeight() + "kg");
    }
}
