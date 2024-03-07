import java.util.ArrayList;
import java.util.List;

class Car {
    double distanceFromStart;
    double speed;

    public Car(double distanceFromStart, double speed) {
        this.distanceFromStart = distanceFromStart;
        this.speed = speed;
    }
	
	public double calculateDistance(double time) {
		return (speed * (time/3600));
	}
}

class Highway {
    List<Double> distanceList;
    List<Integer> speedLimitList;

    public Highway() {
        distanceList = new ArrayList<>();
        speedLimitList = new ArrayList<>();
        
        distanceList.add(10.0); // Distants: 10 km, Piirang: 80 km/h
        speedLimitList.add(80);
        distanceList.add(30.0); // Distants: 30 km, Piirang: 100 km/h
        speedLimitList.add(100);
        distanceList.add(50.0); // Distants: 50 km, Piirang: 30 km/h
        speedLimitList.add(30);
        distanceList.add(70.0); // Distants: 70 km, Piirang: 40 km/h
        speedLimitList.add(40);
        distanceList.add(90.0); // Distants: 90 km, Piirang: 110 km/h
        speedLimitList.add(110);
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
		
		double distanceCar1_3sec = car1.calculateDistance(3);
		double distanceCar1_5Min = car1.calculateDistance(300);
		double distanceCar1_2Hrs = car1.calculateDistance(7200);
		
		double distanceCar2_3sec = car2.calculateDistance(3);
		double distanceCar2_5Min = car2.calculateDistance(300);
		double distanceCar2_2Hrs = car2.calculateDistance(7200);
		
		System.out.println("Kui auto 1 liiguks samal kiirusel stardist 3 sekundit, jõuaks ta " + distanceCar1_3sec + "km kaugusele stardist.");
		System.out.println("Kui auto 1 liiguks samal kiirusel stardist 5 minutit, jõuaks ta " + distanceCar1_5Min + "km kaugusele stardist.");
		System.out.println("Kui auto 1 liiguks samal kiirusel stardist 2 tundi, jõuaks ta " + distanceCar1_2Hrs + "km kaugusele stardist.");
		
		System.out.println("Kui auto 2 liiguks samal kiirusel stardist 3 sekundit, jõuaks ta " + distanceCar2_3sec + "km kaugusele stardist.");
		System.out.println("Kui auto 2 liiguks samal kiirusel stardist 5 minutit, jõuaks ta " + distanceCar2_5Min + "km kaugusele stardist.");
		System.out.println("Kui auto 2 liiguks samal kiirusel stardist 2 tundi, jõuaks ta " + distanceCar2_2Hrs + "km kaugusele stardist.");
    
        Car car3 = new Car(5, 150); // Auto 3 on 5 km stardist ja sõidab 150 kmh
        Car car4 = new Car(60, 80); // Auto 4 on 60 km stardist ja sõidab 80 kmh
        Car car5 = new Car(40, 70); // Auto 5 on 40 km stardist ja sõidab 70 kmh

        Highway highway = new Highway();

        for (int i = 0; i < highway.distanceList.size(); i++) {
            System.out.println(highway.distanceList.get(i) + " kilomeetril on kiiruse piirang: " + highway.speedLimitList.get(i) + "km/h");
        }

        List<Car> cars = new ArrayList<>();
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sisesta aeg(minutites) kui kaua autod sõidavad: ");
		double time = scanner.nextDouble();

        for (Car car : cars) {
            for (int i = 0; i < highway.distanceList.size(); i++) {
                if (car.distanceFromStart <= highway.distanceList.get(i)) {
                    car.speed = Math.min(car.speed, highway.speedLimitList.get(i));
                    break; 
                }
            }
			double distance = car.calculateDistance(time);
            System.out.println("Auto " + (i + 1) +  " läbis " + time + " minuti jooksul " + distance + "km");
        }
        
		
    }
}


