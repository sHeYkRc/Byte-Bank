package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Conexion;

public class TestConexion {
	
	public static void main(String[] args) throws Exception {
		
		try(Conexion cn = new Conexion()){
			cn.leerDatos();
		}catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		System.out.println("otro programa en ejecucion ");
		/*Conexion cn = null;
		try {
			cn = new Conexion();
			cn.leerDatos();
			
		}catch(IllegalStateException ex){
			ex.printStackTrace();
		}finally {
			
			if (cn != null) {
				cn.cerrar();
			}
			
			System.out.println("ejecutando conexión ");
		}*/
		
		
		
	}
	
}
