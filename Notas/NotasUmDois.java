import java.util.Scanner;

public class NotasUmDois{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
	
		double primeiraNota, segundaNota;

		System.out.print("\nInforme a 1ª nota: ");
		primeiraNota = ler.nextDouble();
		
		if(primeiraNota < 4.00){
			System.out.println("\nVocê já está em RECUPERAÇÃO!");
		}	

		System.out.print("\nInforme a 2ª nota: ");
		segundaNota = ler.nextDouble();

		double mediaFinal = (primeiraNota + segundaNota) / 2;

		if(mediaFinal >= 7.00){
			System.out.printf("\nSua media final é: %.2f Você está APROVADO!", mediaFinal);

		} else if(mediaFinal >= 4.00 && mediaFinal < 7.00){
				System.out.printf("\nSua media final é: %.2f Você está em RECUPERAÇÃO!", mediaFinal);

		} else {
			System.out.println("\nVocê está REPROVADO!");
		}
	}		
}