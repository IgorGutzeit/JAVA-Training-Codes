package unidade3;

import javax.swing.JOptionPane;

public class Moeda {

	public static void main(String[] args) {
		
		double valor, valorConvertido;
		int tipoMoeda;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor a ser convertido: "));
		tipoMoeda = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o tipo da moeda: [1 - Libra], [2 - Dolar], [3 - Euro] "));
		/*
		switch(tipoMoeda) {
		   
		case 1:{
			valorConvertido = valor/6.92;
			JOptionPane.showMessageDialog(null, "O valor convertido em libras é de: "+ valorConvertido );
			break;
		}
		case 2:{
			valorConvertido = valor/5.1;
			JOptionPane.showMessageDialog(null, "O valor convertido em dolar é de: "+ valorConvertido );
			break;
		}
		case 3:{
			valorConvertido = valor/5.2;
			JOptionPane.showMessageDialog(null, "O valor convertido em euro é de: "+ valorConvertido );
			break;
		}
		
		default:
			JOptionPane.showMessageDialog(null, "Opção digitada é inválida" );
		
		}// fim do switch
		*/
		
		//Exemplo de switch utilizando lambda
		JOptionPane.showMessageDialog(null,switch(tipoMoeda) {
		case 1 -> valorConvertido = valor/6.92;
		case 2 -> valorConvertido = valor/5.1;
		case 3 -> valorConvertido = valor/5.2;
		default -> "Opção digitada é inválida";
		});
		
		
	}

}
