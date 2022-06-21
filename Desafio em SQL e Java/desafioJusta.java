import java.util.Scanner;

public class desafioJusta {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, x = 0, y = 0;

		System.out.println("\nInforme a sua Idade ou Digite 99 para Encerrar: ");
		idade = leia.nextInt();

		while (idade != 99) {
			if (idade < 29) {
				x++;
			} else if (idade >= 29) {
				y++;
			}
			System.out.println("\nInforme a sua Idade ou Digite 99 para Encerrar: ");
			idade = leia.nextInt();
		}
		System.out.println("\nTemos um Total de " + x + " Colaboradores com - de 29 Anos!!");
		System.out.println("\nE apenas " + y + " Colaborador(a) com + de 29 Anos!!");
	}

}
