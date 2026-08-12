class animal4 {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends animal4 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends animal4 {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}