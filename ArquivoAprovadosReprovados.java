package desafio_04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArquivoAprovadosReprovados {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String nomes[] = new String[5];
		double notas[] = new double[5];

		boolean aprov [] = new boolean[5];
		double total = 0, media, freq=0;
		
		FileWriter arq = new FileWriter("Aprovados.txt");
		PrintWriter gravaarq = new PrintWriter(arq);
		
		FileWriter arq2 = new FileWriter("Reprovados.txt");
		PrintWriter gravaarq2 = new PrintWriter(arq2);
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o nome do aluno: ");
			nomes[i] = sc.next();
			
			for (int j = 0; j < 4; j++) {
				
				System.out.println("Informe a nota " +(j+1)+ ":");
				notas[j] = sc.nextInt();
				total = total + notas[j];
				
				
			}
			System.out.println("Informe a frequência: ");
			freq = sc.nextDouble();
			media = total/4;
			
			if (media >= 7 && freq >= 75) {
				aprov[i] = true;
			} else {
				aprov[i] = false;
			}
			total = 0;
			
		}
		for(int i = 0; i < 5; i++) {
			
			if (aprov[i]) {
				System.out.println("Aluno " +(i+1)+ ": " + nomes[i] + " -> APROVADO");
				gravaarq.println("Aluno " +(i+1)+ ": " + nomes[i] + " -> APROVADO");
			} else {
				System.out.println("Aluno" +(i+1)+ ": " + nomes[i] + " -> REPROVADO");
				gravaarq2.println("Aluno" +(i+1)+ ": " + nomes[i] + " -> REPROVADO");
			}
		}
		arq.close();
		gravaarq.close();
		arq2.close();
		gravaarq2.close();
		
	}

}
