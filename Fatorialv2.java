package unidade4;

import javax.swing.JOptionPane;

public class Fatorialv2 {

	public static void main(String[] args) {
		
		int numero, i;
		double fatorial;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		fatorial = 1;
		i = numero;
		
		do {
			fatorial = fatorial * i;
			i--;
		} while(i >= 1);
		
		JOptionPane.showMessageDialog(null,"Fatorial do número inserido: "+fatorial);


	}

}
