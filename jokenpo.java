package br.com.jokenpo;

import java.util.Scanner;

/**
 * @author Lucas dos Anjos
 *
 */

public class Jokenpo  {
	
	public static void main(String[] args) {
		Scanner mao = new Scanner(System.in);
		
		int computador, jogador;
		
		System.out.println("__________JokenPow__________");
		System.out.println("____________________________");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("");
		System.out.println("Digite um numero: ");
		
		jogador = mao.nextInt();
		
		System.out.println("");
		
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Opção inválida ");
			break;
		}
		
		//Lógica do computador
		computador = (int) (Math.random() * 3 + 1);

		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra ");
			break;
		case 2:
			System.out.println("Computador escolheu Papel ");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura ");
			break;
		}
		//logica para determinar o vencedor 
		
		System.out.println("");
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else if (jogador == 1 && computador == 3 || jogador == 2 && computador == 1
				|| jogador == 3 && computador == 2) {
			System.out.println("Jogador Venceu");
		} else {
			System.out.println("Computador Venceu");
		}
		
		mao.close();
		
	}
}