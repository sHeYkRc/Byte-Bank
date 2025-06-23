package mx.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestTest {
	
	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Super Mario");
		nombres.add("Yoshi"); 
		nombres.add("Donkey Kong"); 

		Collections.sort(nombres,(String s1, String s2) -> {
		        return s1.length() - s2.length();
		    }
		);

		System.out.println(nombres);
		
		
		Set<String> nombre = new HashSet<>();
		nombre.add("Super Mario");
		nombre.add("Yoshi"); 
		nombre.add("Donkey Kong"); 

		Iterator<String> it = nombre.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
	}

	//nombres.sort((s1, s2) ->  s1.length() - s2.length());
}
