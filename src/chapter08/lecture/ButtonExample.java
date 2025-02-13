package chapter08.lecture;
// 20250213 -7
import org.w3c.dom.ls.LSOutput;

class Button {
    OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    /*@FunctionalInterface // 람다식으로 대체 가능, 메서드 단하나만 있어야함*/
    static interface OnClickListener {
        void onClick();
    }
}

class CallListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}

class MessageListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setListener(new CallListener());
        btn.touch();

        btn.setListener(new MessageListener());
        btn.touch();

        // 익명 구현 객체
        // 익명 구현 객체는 별도의 클래스를 정의하지 않고, 한 번만 사용할 객체를 즉성에서 생성 가능
        // 불필요한 클래스 파일 생성을 방지해서 유지보수성을 높임
        btn.setListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("익명 구현 객체");
            }
        });
        btn.touch();

        // 람다식 (new button.OnClickListener()이 생략되고
        // onClick() 메서드의 시그나처만 맞춰준다
        // 단, 람다식을 사용하려면 interface의 메서드가 유추가 되야하므로
        // 하나의 추상메서드를 가진 함수형 인터페이스여야 한다.
        btn.setListener(() -> {
            System.out.println("람다식");
        });
    }
}
