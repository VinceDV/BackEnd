package eserciziThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(MainProject.class);

		primoThread t1 = new primoThread();
		secondoThread t2 = new secondoThread();
		
		t1.start();
		t2.start();
	}

}
