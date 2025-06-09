import java.util.Scanner;

public class AlgoritmoNotas{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		int numeroNotas;

		System.out.print("\n (Digite 1 para 1ª nota; Digite 2 para 1ª e 2ª nota)\n Quantas notas você tem? ");
		numeroNotas = ler.nextInt();

		switch(numeroNotas){
			case 1: {
				double primeiraNota;

				System.out.print("\nInforme sua 1ª nota: ");
				primeiraNota = ler.nextDouble();

				double notaFinal = 14.00 - primeiraNota;

				if(notaFinal > 10){
					System.out.printf("\nVocê precisa tirar %.2f na segunda nota. Você já está em RECUPERAÇÃO!", notaFinal);
				} else {
					System.out.printf("\nVocê precisa tirar %.2f na segunda nota.", notaFinal);
				}

				break;
			}
			case 2: {
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

				break;
			}

			default:
				System.out.println("\nTente novamente!");
		}
		ler.close();
	}
}