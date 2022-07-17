#Arquivos-Codigos
//Altere o construtor da classe carro para que ele inicie o tanque com 0.

import java.util.Scanner;

public class main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//carro c1 = new carro();
		//carro c2 = new carro();
		
		//c1.setModelo("Logan");
		//c2.setAno(1980);//objeto diferente
	
		//System.out.println(c1.getModelo());
		//System.out.println(c2.getAno() + " //objeto diferente");//objeto diferente
		
		
		//c1.andar(90);
		float litros, quanto, velocidade;
		String marca, modelo;
		int ano;
		
		System.out.printf("%n---------- MENU DO VEÍCULO-----------%n");
		System.out.printf("Digite a marca do veículo: ");
		marca = input.next();
		System.out.printf("Digite o modelo do veículo: ");
		modelo = input.next();
		System.out.printf("Digite o ano do veículo: ");
		ano = input.nextInt();	
	
		carro c1 = new carro (marca, modelo, ano, 0, 0);
		
		System.out.printf("%nDigite quanto você quer abastecer: ");
		litros = input.nextFloat();
		c1.abastecer(litros);
		
		System.out.printf("%nDigite quanto você deseja andar e sua velocidade: %n");
		System.out.printf("Km - ");
		quanto = input.nextFloat();
		System.out.printf("Velocidade - ");
		velocidade = input.nextFloat();
		System.out.printf("%n");
		c1.andar(quanto, velocidade);
		
		
		c1.status(c1.getMarca(), c1.getModelo(), c1.getAno(), c1.getTanque(), c1.getOdometro());
		
		input.close();
	}

}
