package week1.day1;

public class Car {
	byte mirrors = 2;
	short seats = 4;
	int parts = 500;
	long carNumber = 22077L;
	char seatBelts = '4';
	String carModel = "Nissan Rogue";
	public static void main(String[] args) {
		Car mycar = new Car ();
		System.out.println(mycar.mirrors);
		System.out.println(mycar.seats);
		System.out.println(mycar.parts);
		System.out.println(mycar.carNumber);
		System.out.println(mycar.seatBelts);
		System.out.println(mycar.carModel);
	}

}
