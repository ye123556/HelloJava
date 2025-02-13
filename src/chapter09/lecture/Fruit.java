package chapter09.lecture;

interface Eatable { }

class Fruit implements Eatable {
    @Override
    public String toString() { return "Fruit"; }
}

class Apple extends Fruit {
    public String toString() { return "Apple"; }
}

class Grape extends Fruit {
    public String toString() { return "Grape"; }
}

class Toy {
    public String toString() { return  "Toy"; }
}