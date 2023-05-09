package ex2;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.test.log.MainProject;
public class MainProject2 {

	static Logger log = LoggerFactory.getLogger(MainProject.class);

	public static void main(String[] args) {
		primaFunzione(4);
	}
	
	public static void primaFunzione(int n) {
	        
			List<Integer> l = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
			Random rand = new Random();
	        int randomNumber = rand.nextInt(101);
	        l.add(randomNumber);
			};
			log.info("Prima lista: " + l.toString());
			secondaFunzione(l);
			terzaFunzione(l, false);
	}
	public static void secondaFunzione(List<Integer> x) {
		
		List<Integer> l2 = new ArrayList<Integer>(x);
		List<Integer> l3 = l2;
		
		for (int i = l2.size() - 1; i > -1; i--) {
			l3.add(l2.get(i));
		};
		
		//l3 = Collections.reverse(l2);
		log.info("Seconda lista: " + l3.toString());
	}
	public static void terzaFunzione(List<Integer> x, boolean y) {
		System.out.print("Terza Funzione ");
		if (y) {
			for (int i = 0; i < x.size(); i++) {
				i++;
				System.out.print(x.get(i) + " ");
			}
			} else {
				for (int i = 1; i < x.size(); i++) {
					System.out.print(x.get(i) + " ");
				}
			};
	}
}