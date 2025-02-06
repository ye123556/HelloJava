package chapter07;
// 20250206-5
public class Dog extends Animal {
    private String species; // 견종

    public Dog(String name, String species) {
        super(name);
        this.species = species;
    }

    @Override
    public void bark() {
        System.out.println("멍멍!");
    }
    @Override
    public String toStr() {
        return species + "종인" + getName();
    }
}
