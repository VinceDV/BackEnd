package Ex1;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringaPariDispari("ciaol");
		annoBisestile(2004);
	}


	public static void stringaPariDispari(String x) {
		if (x.length()%2 == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		};
		
}
	public static void annoBisestile(int x) {
		if (x%4 == 0) {
			System.out.println(true);
		}
		else if (x%100 == 0) {
			if (x%400 == 0) {
				System.out.println(true);
			}
		}
		else {
			System.out.println(false);
		}
	}
}