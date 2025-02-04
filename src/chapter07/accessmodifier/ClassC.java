package chapter07.accessmodifier;
//20250204-5
import chapter07.lecture.ClassA;

public class ClassC extends ClassA {
    public  ClassC () {
        //상속 받았기 때문에 접근 가능
        super();
        this.field = "value";
        this.method();
    }
}
