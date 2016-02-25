package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		return x.getClass();
	}


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		List<Integer> lista = new ArrayList<Integer>();
		int n0=0;
		int n1=1;
		int i=0;

		while(i<n){
			lista.add(n1);
			int temp=n1;
	        n1+=n0;
	        n0=temp;
	        i++;
		}
		return lista;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		List<Integer> lista = new ArrayList<Integer>();
		int resultado=number-step;
		while(resultado>0){
			lista.add(resultado);
			resultado=resultado-step;
		}
		
		int enteros[]=new int[lista.size()];
		for(int i=0;i<lista.size();i++){
			enteros[i]=lista.get(i);
		}
		
		return enteros;
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		List<Integer> lista = new ArrayList<Integer>();
		int divisor=n;
		if(n>0){
			while(divisor>0){
				if(n%divisor==0){
					lista.add(divisor);
				}divisor--;
			}
		}else if(n<=0){
			return null;
		}
		
		int enteros[]=new int[lista.size()];
		for(int i=0;i<lista.size();i++){
			enteros[i]=lista.get(i);
		}
		return enteros;
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		throw  new NotImplementedException();
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw  new NotImplementedException();
	}
}
