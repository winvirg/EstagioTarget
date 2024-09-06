import java.util.*;

class sequenciaFibonacci
{
	public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.printf("Digite o numero de parada: \n");
		int numeroParada = scan.nextInt();
		
		int soma1 = 0, soma2 = 1;
		
		while (soma1 <= numeroParada) {
            System.out.print(soma1 + " ");
            int proximoNumero = soma1 + soma2;
            soma1 = soma2;
            soma2 = proximoNumero;
        }
        scan.close();

	}
}
