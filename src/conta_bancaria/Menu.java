package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Bruno H", 15000.0f, 20000.0f);
		cc1.visualizar();
		cc1.sacar(16000.0f);
		cc1.visualizar();
		cc1.depositar(1000.0f);
		cc1.visualizar();

		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Bruno G", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(12000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_GREEN);
			System.out.println("*****************************************************");
			System.out.println("*                                                   *");
			System.out.println("*                 BANCO DO BRAZIL COM Z             *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println("*                                                   *");
			System.out.println("*            1 - Criar Conta                        *");
			System.out.println("*            2 - Listar todas as Contas             *");
			System.out.println("*            3 - Buscar Conta por Numero            *");
			System.out.println("*            4 - Atualizar Dados da Conta           *");
			System.out.println("*            5 - Apagar Conta                       *");
			System.out.println("*            6 - Sacar                              *");
			System.out.println("*            7 - Depositar                          *");
			System.out.println("*            8 - Transferir valores entre Contas    *");
			System.out.println("*            9 - Sair                               *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada: " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");

				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println("Saque\n\n");

				break;
			case 7:
				System.out.println("Depósito\n\n");

				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Bruno Godoy - brunogodoy29@hotmail.com");
		System.out.println("https://github.com/Brunogodoy2911");
		System.out.println("*********************************************************");
	}

}