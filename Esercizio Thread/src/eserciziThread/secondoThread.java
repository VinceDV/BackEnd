package eserciziThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class secondoThread extends Thread{
	private Logger log = LoggerFactory.getLogger(secondoThread.class);
	
	public secondoThread () {
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				log.info("#");
				Thread.sleep(1000);
			} catch (Exception e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}