interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void drive();
}

interface MusicSystem {
    void playMusic();
}

class LuxuryCar implements Car, MusicSystem {

    public void start() {
        System.out.println("Car starts");
    }

    public void drive() {
        System.out.println("Car is driving");
    }

    public void playMusic() {
        System.out.println("Music is playing");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        LuxuryCar obj = new LuxuryCar();

        obj.start();
        obj.drive();
        obj.playMusic();
    }
}