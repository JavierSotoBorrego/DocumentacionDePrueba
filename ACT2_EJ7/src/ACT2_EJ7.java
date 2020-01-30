import java.io.*;
public class ACT2_EJ7 {
	static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
	static String cadenaLeida;
	
	

	public static void main(String[] args) {
		
		//Declaracion de variable
		short shDorsal;
		float fPeso, fAltura;
		
		
		
		shDorsal = pedirDorsal();
		

		fPeso = pedirPeso();
		
		

		fAltura = pedirAltura();
		
		
		
		
		//Imprimiendo
		System.out.println("El dorsal numero "+shDorsal+" mide "+fAltura+" m y pesa "+fPeso+"kg");
		
		
		
	}


	/** 
	 * Función que pide la altura en metros
	 * @param ninguno
	 * @author Soto
	 * @return float
	 * */
	public static float pedirAltura() {
		float fAltura;
		System.out.println("Introduce el altura(1,40...2.10): ");
		try{
		cadenaLeida = lector.readLine();
		} catch(Exception e) {
		cadenaLeida = "";
		}//leo altura
		
		fAltura = Float.parseFloat(cadenaLeida);
		return fAltura;
	}


	/** 
	 * Función que pide el peso en Kg
	 * @param ninguno
	 * @author Soto
	 * @return float
	 * */
	public static float pedirPeso() {
		float fPeso;
		System.out.println("Introduce el peso (40...150): ");
		try{
		cadenaLeida = lector.readLine();
		} catch(Exception e) {
		cadenaLeida = "";
		}
		//Conversion string -->float
		fPeso = Float.parseFloat(cadenaLeida);
		return fPeso;
	}


	/** 
	 * Funcón que pide el numero de dorsal
	 * @param  ninguno
	 * @author Soto
	 * @return short
	 */
	public static short pedirDorsal() {
		short shDorsal;
		System.out.println("Introduce el dorsal (1...9999): ");
		try{
		cadenaLeida = lector.readLine();
		} catch(Exception e) {
		cadenaLeida = "";
		}
		
		//Conversion String --> short
		shDorsal = Short.parseShort(cadenaLeida);
		return shDorsal;
	}

}
