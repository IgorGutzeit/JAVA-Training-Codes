package desafio_05;

import javax.swing.JOptionPane;

public class CaixaEeletronico2 {

	public static void main(String[] args) {
        
		int valorSaque;
		double notas200 = 0, notas100 = 0, notas50 = 0, notas10 = 0, notas2 = 0;
		int resto;
				
		Object [] opcoes = {"Notas de [R$200][R$100][R$50]", "Notas de [R$100][R$50][R$10]", "Notas de [R$50][R$10][R$2]" };
		Object x = null;
		
		valorSaque = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor do saque: "));
		
		//Começo da interação para valores maiores ou iguais a 200
		if(valorSaque >= 200){
			
			x = JOptionPane.showInputDialog(null,"Opções de notas disponíveis:", "Saque", 3, null, opcoes, "");
			
			if(x.equals("Notas de [R$200][R$100][R$50]")) {
			   
			    notas200 = Math.floor(valorSaque/200);
			    resto = valorSaque % 200;
			    notas100 = Math.floor(resto/100);
			    resto = valorSaque % 100;
			    notas50 = Math.floor(resto/50);
			   
			}else if(x.equals("Notas de [R$100][R$50][R$10]")) {
				
				notas100 = Math.floor(valorSaque/100);
				resto = valorSaque % 100;
				notas50 = Math.floor(resto/50);
				resto = valorSaque % 50;
				notas10 = Math.floor(resto/10);
				
			}else if(x.equals("Notas de [R$50][R$10][R$2]")) {
				
				notas50 = Math.floor(valorSaque/50);
				resto = valorSaque % 50;
				notas10 = Math.floor(resto/10);
				resto = valorSaque % 10;
				notas2 = Math.floor(resto/2);
			}// fim da interação para valores maiores ou iguais a 200
						
			//Começo da interação para valores maiores ou iguais a 100 e menores que 200
		}else if(valorSaque%10 == 0 && (valorSaque >= 100 && valorSaque < 200)){
			
			opcoes[0] = null;
			
			x = JOptionPane.showInputDialog(null,"Opções de notas disponíveis:", "Saque", 3, null, opcoes, "Notas de [R$100][R$50][R$10]");
			
			if(x.equals("Notas de [R$100][R$50][R$10]")) {
			    notas100 = Math.floor(valorSaque/100);
			    resto = valorSaque % 100;
			    notas50 = Math.floor(resto/50);
			    resto = valorSaque % 50;
			    notas10 = Math.floor(resto/10);
			
			}else if(x.equals("Notas de [R$50][R$10][R$2]")) {
				
				notas50 = Math.floor(valorSaque/50);
				resto = valorSaque % 50;
				notas10 = Math.floor(resto/10);
				resto = valorSaque % 10;
				notas2 = Math.floor(resto/2);
			}
			//fim da interação para valores maiores ou iguais a 100 e menores que 200
									
		}else if(valorSaque%2 == 0 && (valorSaque >= 50 && valorSaque < 100)){
			
			opcoes[0] = null;
			opcoes[1] = null;
			
			x = JOptionPane.showInputDialog(null,"Única opção disponível:", "Saque", 3, null, opcoes, "Notas de [R$50][R$10][R$2]");
			
		    notas50 = Math.floor(valorSaque/50);
		    resto = valorSaque % 50;
		    notas10 = Math.floor(resto/10);
		    resto = valorSaque % 10;
		    notas2 = Math.floor(resto/2);
		    				
	    }else {			
	    	JOptionPane.showMessageDialog(null, "O valor informado é INVÁLIDO", "alert", JOptionPane.ERROR_MESSAGE);
		}
				
		JOptionPane.showMessageDialog(null,switch(vet(x)) {
		
		case "Notas de [R$200][R$100][R$50]" -> "Numero de notas de 200 = "+notas200+ 
	 	                                        "\n Numero de notas de 100 = "+notas100+
	 	                                        "\n Numero de notas de 50 = "+notas50;
				
		case "Notas de [R$100][R$50][R$10]" -> "Numero de notas de 100 = "+notas100+ 
                                               "\n Numero de notas de 50 = "+notas50+
                                               "\n Numero de notas de 10 = "+notas10;
		
		case "Notas de [R$50][R$10][R$2]" -> "Numero de notas de 50 = "+notas50+ 
                                             "\n Numero de notas de 10 = "+notas10+
                                             "\n Numero de notas de 2 = "+notas2;
		
		default -> "Opção digitada é inválida";
		});
        		
	}// fim - main
		
	public static String vet(Object x) {
		String op = "";
		if(x.equals("Notas de [R$200][R$100][R$50]"))
		     op = "Notas de [R$200][R$100][R$50]";
		
		if(x.equals("Notas de [R$100][R$50][R$10]")) 
			op = "Notas de [R$100][R$50][R$10]";
		
		if(x.equals("Notas de [R$50][R$10][R$2]"))
			op = "Notas de [R$50][R$10][R$2]";
				
		return op;		
	}// fim da função vet();
		
}