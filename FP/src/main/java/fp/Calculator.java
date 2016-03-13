package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.*;

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
		String numero = numeroAletra(n);
		return numero.substring(0, 1).toUpperCase() + numero.substring(1);
	}

	public static String numeroAletra(int n) {

		String[] unicos = {"cero", "uno", "dos", "tres", "cuatro",
				"cinco", "seis", "siete", "ocho", "nueve", "diez", "once",
				"doce",	"trece", "catorce", "quince", "diecis�is"};
		String[] decenas = {"dieci", "veinti", "veinte", "treinta", "cuarenta",
				"cincuenta", "sesenta", "setenta", "ochenta", "noventa"};

		if (n < 17)
			return unicos[n];

		if ((n % 10) == 0)
			return decenas[(n / 10)];

		if (n < 30)
			return decenas[(n / 10) - 1] + unicos[n % 10];

		if (n > 99)
			return "No necesario para pasar el test";

		return decenas[(n / 10)] + " y " + unicos[n % 10];
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String date) {
		int[] dateNum = dateToNumbers(date);
		if (dateNum == null) return false;
		return isLeapYear(dateNum[2]);
	}

	
	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw  new NotImplementedException();
	}
	 public static int daysInMonth(int month, int year) {
	     switch (month) {
	     case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	       return 31;
	     case 2: 
	       if (isLeapYear(year)) 
		 return 29;
	       else
	         return 28;
	     default:
	       return 30;
	     }
	  }
	 public static boolean isLeapYear(int year) {
	     if ((year % 400)==0)
	       return true;
	     if ((year % 100)==0)
	       return false;
	     if ((year % 4)==0)
	       return true;
	     return false;
	  }
	 public static boolean isValidDate(int month, int day, int year) {
		    if ((month < 0) || (month > 12))
		      return false;
		    if (year == 0) 
		      return false;
		    if ((day < 0) || (day > daysInMonth(month,year)))
		      return false;
		    return true;
		  }
	 
	 public static int[] dateToNumbers(String date) {
			int day, month, year;
			try {
				day = Integer.parseInt(date.substring(0, 2));
				month = Integer.parseInt(date.substring(3, 5));
				year = Integer.parseInt(date.substring(6));
			} catch(NumberFormatException e){
				return null;
			}catch(StringIndexOutOfBoundsException e){
				return null;
			}
			if (date.charAt(2) == date.charAt(5) && "/.- ".indexOf(date.charAt(2)) != -1) {
				 return new int[] {day, month, year}; 
			}
			return null;
		}
		
		
}

