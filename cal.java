package com.br;
import java.util.Scanner;
public class cal {
	static Scanner in = new Scanner(System.in);
	public static void main(String [] args){
		int a = 0;
		double bum1 = 0;
		double bum2 = 0;
		double resul = 0;
	do{
			System.out.println("Calculadora em Java");
			System.out.println();
			System.out.println("Digite 1 para somar: ");
			System.out.println("Digite 2 para subtrair: ");
			System.out.println("Digite 3 para multiplicar: ");
			System.out.println("Digite 4 para dividir: ");
			System.out.println("Digite 0 para sair da Calculadora: ");
			System.out.println();
			System.out.println("Digite o código da operação: ");
			a = in.nextInt();
			if(a != 0){
				System.out.println("Digite o primeiro numero: ");
				bum1 = in.nextDouble();
				System.out.println("Digite o segundo numero: ");
				bum2 = in.nextDouble();	
				if(a == 1){
					resul = bum1 + bum2;
				}else{
					if(a == 2){
						resul = bum1 - bum2;
					}else{
						if(a == 3){
							resul = bum1 * bum2;
						}else{
							if(a == 4){
								resul = bum1 / bum2;
							}
						}
					}
				}
				System.out.println("O Resultado foi:  "+resul);
				System.out.println("");
				System.out.println("--------------------");
			}
	}while(a != 0);
	System.out.println("");
	System.out.println("Fim do Programa:  ");
}
}			



