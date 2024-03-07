import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    double distanceFromStart;
    double speed;

    public Car(double distanceFromStart, double speed) {
        this.distanceFromStart = distanceFromStart;
        this.speed = speed;
    }

    public double calculateDistance(double time) {
        return distanceFromStart + (time * speed / 60); // Calculate distance based on speed and time
    }
}

class Highway {
    List<Double> distanceList;
    List<Integer> speedLimitList;

    public Highway() {
        distanceList = new ArrayList<>();
        speedLimitList = new ArrayList<>();
        // Add 5 speed limits at different distances on the highway
        distanceList.add(10.0); // Distance: 10 km, Speed limit: 80 km/h
        speedLimitList.add(80);
        distanceList.add(30.0); // Distance: 30 km, Speed limit: 100 km/h
        speedLimitList.add(100);
        distanceList.add(50.0); // Distance: 50 km, Speed limit: 120 km/h
        speedLimitList.add(120);
        distanceList.add(70.0); // Distance: 70 km, Speed limit: 90 km/h
        speedLimitList.add(90);
        distanceList.add(90.0); // Distance: 90 km, Speed limit: 110 km/h
        speedLimitList.add(110);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of the Car class
        Car car1 = new Car(5, 90); // Car 1 is 5 km from the start and traveling at 90 km/h
        Car car2 = new Car(20, 70); // Car 2 is 20 km from the start and traveling at 70 km/h
        Car car3 = new Car(45, 100); // Car 3 is 45 km from the start and traveling at 100 km/h
        Car car4 = new Car(80, 80); // Car 4 is 80 km from the start and traveling at 80 km/h
        Car car5 = new Car(10, 60); // Car 5 is 10 km from the start and traveling at 60 km/h

        Highway highway = new Highway();

        System.out.print("Enter the time in minutes: ");
        double time = scanner.nextDouble();

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        // Calculate and print out the distances of all cars after the specified time
        for (Car car : cars) {
            double distance = car.calculateDistance(time);
            System.out.println("Car distance after " + time + " minutes: " + distance + " km");
        }
    }
} //ma tõesti ei tea, juhe jooksis kokku