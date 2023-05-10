package secondoEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondoCalcolo extends Thread {

	private Logger log = LoggerFactory.getLogger(SecondoCalcolo.class);
	public int[] arr;
	public SecondoCalcolo (int[] arr) {
		this.arr = arr;
	}
@Override
	public void run() {
		int sum = 0;
		for (int i = 1000; i < 1999; i++) {
			sum += arr[i];
		}
		log.info("La somma dei 1000 numeri successivi e' " + sum);
	}

}
