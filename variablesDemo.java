public class variablesDemo {
    int instanceVar = 10;
    static String staticVar = "Iam static";

    public void showVariables() {
        int localVar = 5;
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        variablesDemo obj1 = new variablesDemo();
        obj1.showVariables();
        System.out.println("Accessing static variable via class: " + variablesDemo.staticVar);
    }
}
