package chapter07.lecture;
// 20250206 - 1
import java.util.ArrayList;
import java.util.List;

// 그릴 수 있는 객체를 나타내는 인터페이스
interface Drawable{
    void draw();
}

// 인터페이스를 상속하는 추상 클래스
abstract class Shape implements Drawable {

    // Drawable 인터페이스의 메서드 구현
    // draw를 강제하지 않고 기본 메서드를 구현
    // 필요하면 오버라이딩 하시오. (interface의 default 메서드로 대체 가능)
    public void draw() {
        System.out.println("도형을 그립니다.");
    }

    // 추상 메서드 : 구현체 클래스에서 반드시 구현되어야 함
    public abstract double caculateArea();
}

class Circle extends Shape {
    // 반지름
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double caculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("원 ");
        super.draw();
    }
}

class Rectangle extends Shape {
    // 가로, 세로 길이
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double caculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("사각형 ");
        super.draw();
    }
}

// 그림판 예제 : 도형을 관리하는 클래스
public class PaintBoard {
    private List<Drawable> drawableList = new ArrayList<>();

    // 도형을 추가하는 메서드
    public void addShape(Drawable shape) {
        drawableList.add(shape);
    }

    // 모든 도형을 그리는 메서드
    public void drawAllShape() {
        for (Drawable drawable : drawableList) {
            drawable.draw();
        }
    }

    // 각 도형의 넓이를 계산하여 출력하는 메서드
    public void printAllArea() {
        for (Drawable drawable : drawableList) {
            if (drawable instanceof Shape) { // ClassCastException 방지용
                double area = ((Shape) drawable).caculateArea(); // 다운캐스팅수행 -> ((Shape) drawable)

                System.out.println("도형의 넓이:" + area);
            }
        }
    }
}
