import java.util.Scanner;

public class PrecisaTirar{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		double primeiraNota;

		System.out.print("\nInforme sua 1ª nota: ");
		primeiraNota = ler.nextDouble();

		double notaFinal = 14.00 - primeiraNota;

		if(notaFinal > 10){
			System.out.printf("\nVocê precisa tirar %.2f na segunda nota. Você já está REPROVADO!", notaFinal);
		} else {
			System.out.printf("\nVocê precisa tirar %.2f na segunda nota.", notaFinal);
		}
	}
}		