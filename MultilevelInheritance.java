class animal3{
    void eat(){
        System.out.println("Animal eats food");
    }
}
class Dog extends animal3{
    void barks(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void play(){
        System.out.println("puppy plaYS");
    }
}
public class MultilevelInheritance{
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.eat();
        p.barks();
        p.play();
    }
}