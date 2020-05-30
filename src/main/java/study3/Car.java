package study3;

public class Car {

	private int position = 0; // 위치
	private static String mov = "-";
	
	public Car() {
		
	}

	public int getPosition() {
		return position;
	}

	public int move(int inNum) {
		if (inNum >= 4) {
			return position += 1;
		}
		return position;
	}
	
	public void outputnumCarResult(Car car) {
		for (int i = 0; i < car.getPosition(); i++) {
			System.out.print(mov);
		}
		System.out.println();
	}
}
