package eserciziThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class primoThread extends Thread {
	private Logger log = LoggerFactory.getLogger(primoThread.class);
	
	public primoThread () {
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				log.info("*");
				Thread.sleep(1000);
			} catch (Exception e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
