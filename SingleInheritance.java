class animal2{
    void eat(){
        System.out.println("Animal eats food");
    }
}
class Dog extends animal2{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class SingleInheritance{
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}