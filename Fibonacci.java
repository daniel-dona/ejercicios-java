import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		ArrayList<Double> seq = new ArrayList<Double>();
	
		Scanner TC = new Scanner(System.in);
		
		System.out.print("Número de la secuencia?: ");
		
		int s = TC.nextInt();
		
		seq = fib(s);

		System.out.println(seq.get(seq.size()-1));
		
		System.out.print("Ver pasos? (y/n): ");
		
		String r = TC.next();
		
		if(r.equals("y")) {
			
			for(int i = 0; i < seq.size(); i++) {
				
				System.out.println(seq.get(i));
				
				
			}
			
			
		}
		
		TC.close();

	}
	
	public static ArrayList<Double> fib(int s) {
		
		double n1 = 1;
		double n2 = 1;
		double n3 = 0;
		
		ArrayList<Double> seq = new ArrayList<Double>();
		
		for(int i = -2; i < s; i++) {
			
			n3 = n1 + n2; // Sumas los dos términos
			
			n1 = n2; // Desplazas los resultados previos
			n2 = n3;
			
			seq.add(n3);
			
		}
		
		return seq;
		
	}

}
