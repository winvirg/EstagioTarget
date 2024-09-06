import java.util.*;

class ContadorLetraA
{
	public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Escreva sua frase: ");
	    
	    String frase = scan.nextLine();
	    
	    int contadorDeLetraA = 0;
	    
	    for(int indice=0; indice < frase.length(); indice++){
	        char letraComparada = frase.charAt(indice);
	        if(letraComparada == 'a' || letraComparada == 'A' || letraComparada == 'ã' || letraComparada == 'á' || letraComparada == 'à' || letraComparada == 'â' || letraComparada == 'Ã' || letraComparada == 'Á' || letraComparada == 'À' || letraComparada == 'Â'){
	            contadorDeLetraA++;
	        }
	    }
	    
	    if(contadorDeLetraA > 0){
	        System.out.printf("Letra A apareceu "+ contadorDeLetraA + " vezes!");
	    } else{
	        System.out.printf("Letra A não apareceu na frase!");
	    }
	    
	    
        scan.close();

	}
}
