package unidade5;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo {

	public static void main(String[] args) throws Exception{
		
		String[] nomes ={"Elízio","Breno","Hélio"}; // vetor de nomes
		String[] fones ={"1111-2222","8888-3333","8887-5746"}; // vetor de telefones
		String[] cidades ={"Mossoró","Apodi","Assu"}; // vetor de cidades
		
		FileWriter arq = new FileWriter("contatos.txt");
		PrintWriter gravaarq = new PrintWriter(arq);
		
		gravaarq.println("================================");
		gravaarq.println("Nomes || Telefones || Cidades ");
		for (int i = 0; i < nomes.length; i ++) {
		gravaarq.println("================================");
		gravaarq.print(nomes[i]+" || ");
		gravaarq.print(fones[i]+" || ");
		gravaarq.println(cidades[i]); 
		}
		gravaarq.println("================================");
		arq.close();
		gravaarq.close();
		


	}

}
