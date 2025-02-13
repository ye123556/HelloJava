package chapter13.lecture;
// 20250211-11
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();

        set1.add("Java");
        set1.add("JDBC");
        set1.add("Servlet/JSP");
        set1.add("Java"); // 중복데이터
        set1.add("iBATIS");

        int size = set1.size();
        System.out.println("총 객체 수: " + size);

        /*System.out.println(set1);*/

        Iterator<String> itreator = set1.iterator();

        while(itreator.hasNext()) {
            String element = itreator.next();
            System.out.println("\t" + element);
        }

        set1.remove("JDBC");
        set1.remove("iBATIS");

        System.out.println();

        for (String element : set1) {
            System.out.println("\t" + element);
        }

        set1.clear();
        System.out.println(set1);

        if(set1.isEmpty()) {
            System.out.println("비어있음");
        }

        Set<Member> set2 = new HashSet<Member>();

        set2.add(new Member("홍길동", 30));
        set2.add(new Member("홍길동", 30));
        // 인스턴스는 다르지만 내부 데이터가 동등하다고 판단하려면
        // HashSet의 경우 hashcode()와 equals를 구현해주어야 함;

        System.out.println(set2);
        System.out.println("총 객체 수 : " + set2.size());  // 1개
    }
}

class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override // 이게 없으면 해시함수가 나옴
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) { // 보류
        if(this == o) return true;
        if (!(o instanceof Member)) return false;
        return (age == ((Member)o).age) && Objects.equals(name, ((Member)o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
