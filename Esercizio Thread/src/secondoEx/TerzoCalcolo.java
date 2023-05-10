package secondoEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TerzoCalcolo extends Thread {

	private Logger log = LoggerFactory.getLogger(TerzoCalcolo.class);
	public int[] arr;
	public TerzoCalcolo (int[] arr) {
		this.arr = arr;
	}
@Override
	public void run() {
		int sum = 0;
		for (int i = 2000; i < 3000; i++) {
			sum += arr[i];
		}
		log.info("La somma degli ultimi 1000 numeri e' " + sum);
	}

}
