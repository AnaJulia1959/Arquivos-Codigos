# Exerc-cio_4
 Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
package lista1;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite seu ano de nascimento: ");
	    ano = input.nextInt();
	    
	    if (ano > 2006){
	    	System.out.printf("Você não poderá votar esse ano.");
	    }else {
	    	System.out.printf("Você poderá votar esse ano!");
	    }
		input.close();
	}
}
