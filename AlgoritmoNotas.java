import java.util.Scanner;

public class AlgoritmoNotas{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		System.out.print("\n (Digite 1 para 1ª nota; Digite 2 para 1ª e 2ª nota)\n Quantas notas você tem? ");
		int numeroNotas = ler.nextInt();

		switch(numeroNotas){
			case 1: {
				System.out.print("\nInforme sua 1ª nota: ");
				double primeiraNota = ler.nextDouble();

				double mediaParcial = 14.00 - primeiraNota;

				if(mediaParcial > 10){
					System.out.printf("\nVocê precisa tirar %.2f na segunda nota. Você já está em RECUPERAÇÃO!\n", mediaParcial);
				} else {
					System.out.printf("\nVocê precisa tirar %.2f na segunda nota.\n", mediaParcial);
				}

				break;
			}
			case 2: {
				System.out.print("\nInforme a 1ª nota: ");
				double primeiraNota = ler.nextDouble();
				
				if(primeiraNota < 4.00){
					System.out.println("\nVocê já está em RECUPERAÇÃO!\n");
				}	

				System.out.print("\nInforme a 2ª nota: ");
				double segundaNota = ler.nextDouble();

				double mediaParcial = (primeiraNota + segundaNota) / 2;

				if(mediaParcial >= 7.00){
					System.out.printf("\nSua media parcial é: %.2f Você está APROVADO!\n", mediaParcial);

				} else if(mediaParcial >= 4.00 && mediaParcial < 7.00){
						System.out.printf("\nSua media parcial é: %.2f Você está em RECUPERAÇÃO!\n", mediaParcial);

				} else {
					System.out.println("\nVocê está REPROVADO!\n");
				}

				double precisaTirar = 10.00 - mediaParcial;
				System.out.printf("\nVocê precisa tirar %.2f na prova final.\n", precisaTirar);

				System.out.print("\nInforme a nota da prova final: \n");
				double notaFinal = ler.nextDouble();
				
				double mediaFinal = (mediaParcial + notaFinal) / 2;
				
				if(mediaFinal >= 5.00){
					System.out.printf("\nVocê está APROVADO! sua media final é: %.2f\n", mediaFinal);
				} else {
					System.out.printf("\nVocê está REPROVADO! sua media final é: %.2f\n", mediaFinal);
				}

				break;
			}

			default:
				System.out.println("\nTente novamente!\n");
		}
		ler.close();
	}
}