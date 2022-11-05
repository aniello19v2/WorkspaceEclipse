package prova;

public class Tabella2 {

	public static void main(String[] args) {

		int contatore = 1;
		
		System.out.printf("N\t10*N\t100*N\t1000*N\n\n");
		
		while(contatore < 6) {
			
			System.out.printf("%d\t%d\t%d\t%d\n", contatore, contatore * 10, contatore * 100, contatore * 1000);
			
			contatore++;
		}
		

	}

}
