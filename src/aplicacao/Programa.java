package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Conta> list = new ArrayList<>();
		System.out.print("Quantos Contas ser�o registrados? ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
            System.out.println();
			System.out.println("Conta #" + i + ": ");
			System.out.print("Numero da Conta: ");
			int numero = sc.nextInt();
			System.out.print("Nome do Titular: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Saldo Atual: ");
			double saldo = sc.nextDouble();
			list.add(new Conta(numero, nome, saldo));

		}
		/*System.out.println();
		System.out.print("Digite o numero da conta que ter� o saldo aumentado: ");
		int numero = sc.nextInt();
		Conta cont = list.stream().filter(x -> x.getNumero() == numero).findFirst().orElse(null);
		if (cont == null) {
			System.out.println("Este ID n�o existe!");
		}else {
			System.out.print("Digite a Porcentagem: ");
			double porcentagem = sc.nextDouble();
			cont.aumentaSaldo(porcentagem);
*/
		System.out.println();

		System.out.println("Lista de Contas:");

		for (Conta obj : list) {

			System.out.println(obj);

		}
		

		
		
		
		sc.close();
	}

}