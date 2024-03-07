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
    }
}



