package mx.com.bytebank.test;

public class TestMain {
	
	public static void main(String[] args) {
		
		int edad = 20;
		int edad1 = 15;
		int edad2 = 65;
		
		int [] edades = new int[5];
		
		edades[0] = edad;
		edades[1] = edad1;
		edades[2] = edad2;
		
		System.out.println("ídice 0 = "+ edades [0] +  " " + edades[1] + " " + edades[2]+ " " + edades[3] + " índice 5to = " + edades[4]);
		
		//System.out.println(edades[5]);
		
		int tamanoArray = edades.length;
		System.out.println("tamaño array" + tamanoArray);
		
		for(int i = 0; i < tamanoArray; i++) {
			System.out.println("valor: " + edades[i] + " en el índice: " + i);
		}
		
	}

}
