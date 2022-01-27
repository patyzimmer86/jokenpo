package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		Random any = new Random();
		Scanner leitor;
		int aleatorio,guess,min,max;
		max = 3;
		min = 1;
			
		System.out.println("----------------------------"); 
		System.out.println("      J O K E N P O"); 
		System.out.println("----------------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("----------------------------");
		leitor =  new Scanner(System.in);
		System.out.println("Qual a sua opção entre 1 e 3: ");
		
		
		guess = leitor.nextInt();
		switch(guess) {
		case 1:
			System.out.println("Você escolheu " + "Pedra" );
			break;
		case 2:	
			System.out.println("Você escolheu " + "Papel");
			break;
		case 3:
			System.out.println("Você escolheu " + "Tesoura");
			break;
		default:System.out.println("Opção inválida");	
		}
			
		
		aleatorio = min + any.nextInt (max);
		
		switch(aleatorio) {
		case 1:
			System.out.println("Computador escolheu " + "Pedra" );
			break;
		case 2:	
			System.out.println("Computador " + "Papel");
			break;
		case 3:
			System.out.println("Computador " + "Tesoura");
			break;
		default:System.out.println("Opção inválida");	
		}
			
			// If computer choose 1
			if (aleatorio == 1 && guess == 1) {
				System.out.println("Empatou! " );
			} else if (aleatorio == 1 && guess == 2) {
				System.out.println("Voce Ganhou, Papel enrola a pedra ");
			} else if (aleatorio == 1 && guess == 3){
				System.out.println("Computador ganhou, Pedra quebra tesoura");			
			}
			
			//If computer choose 2
			
			if (aleatorio == 2 && guess == 1) {
				System.out.println("Computador ganhou, Papel enrola a pedra" );
			} else if (aleatorio == 2 && guess == 2) {
				System.out.println("Empatou ");
			} else if (aleatorio == 2 && guess == 3){
				System.out.println("Voce Ganhou! Tesoura corta Papel");			
			}
			
			//If computer choose 3
			
			if (aleatorio == 3 && guess == 1) {
				System.out.println("Voce Ganhou, Pedra quebra tesoura" );
			} else if (aleatorio == 3 && guess == 2) {
				System.out.println("Computador ganhou, Tesoura corta Papel hahaha");
			} else if (aleatorio == 3 && guess == 3){
				System.out.println("Empatou ");			
			}
			leitor.close();
	}
	
}
