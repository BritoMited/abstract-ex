package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<Pessoa>();

		System.out.println("Qual o numero de contribuintes? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
			System.out.println("Contribuinte " + i + "# data: ");
			System.out.println("Física ou Jurídica? (F/J)");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if(ch == 'F') {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda anual: ");
				double renda = sc.nextDouble();
				System.out.print("Gasto com saúde: ");
				double saude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, renda, saude));
			}else {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda anual: ");
				double renda = sc.nextDouble();
				System.out.print("Quantidade de funcionários: ");
				int funcionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, renda, funcionarios));
			}
		}
		
		System.out.println();
		System.out.println("CONTRIBUIÇÕES FEITAS: ");
		for(Pessoa p : list) {
			System.out.println(p.getNome() +": $" + p.imposto()); 
			// a conta nao ta errada, mas eu coloquei o calculo do imposto e o resultado
			// do desconto ja na funão e aparentemente nao era pra fazer isso
			
		}

			sc.close();
	}

}
