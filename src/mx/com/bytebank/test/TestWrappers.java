package mx.com.bytebank.test;

public class TestWrappers {
	
	public static void main(String[] args) {
		
		Double w = 33.0;
		Boolean verdadero = true;
		Double numeroDouble = Double.valueOf(33);
		
		System.out.println(numeroDouble);
		
		String numeroString = "33";
		Double stringToDouble = Double.valueOf(numeroString);
		Integer stringToInteger = Integer.valueOf(numeroString);
		System.out.println(stringToDouble);
		System.out.println(stringToInteger);
		
		
		Number numero = Integer.valueOf(5);
		double numeroDoublePrim = numero.doubleValue();
		System.out.println(numeroDoublePrim);
	}

}
