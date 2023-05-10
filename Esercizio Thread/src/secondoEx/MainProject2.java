package secondoEx;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainProject2 {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(MainProject2.class);

		int[] numbers = new int[3000];
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(101);
		}
//		for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

		try {
			PrimoCalcolo t1 = new PrimoCalcolo(numbers);
			SecondoCalcolo t2 = new SecondoCalcolo(numbers);
			TerzoCalcolo t3 = new TerzoCalcolo(numbers);

			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		
	}

}
	}
