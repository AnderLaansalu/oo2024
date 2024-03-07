class Car {
    int distanceFromStart;
    int speed;

    public Car(int distanceFromStart, int speed) {
        this.distanceFromStart = distanceFromStart;
        this.speed = speed;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car(50, 60); // Auto 1 on 50 km stardist ja sõidab 60 kmh
        Car car2 = new Car(30, 70); // Auto 2 on 30 km stardist ja sõidab 70 kmh

        System.out.println("Auto 1 distants tee algusest: " + car1.distanceFromStart + "km");
        System.out.println("Auto 1 kiirus: " + car1.speed + "km/h");

        System.out.println("Auto 2 distants tee algusest: " + car2.distanceFromStart + "km");
        System.out.println("Auto 2 kiirus: " + car2.speed + "km/h");
    }
}