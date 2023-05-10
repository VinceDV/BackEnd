package secondoEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimoCalcolo extends Thread {

	private Logger log = LoggerFactory.getLogger(PrimoCalcolo.class);
	public int[] arr;
	public PrimoCalcolo (int[] arr) {
		this.arr = arr;
	}
@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 999; i++) {
			sum += arr[i];
		}
		log.info("La somma dei primi 1000 numeri e' " + sum);
	}

}
