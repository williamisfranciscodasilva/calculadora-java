package calculadora;

import javax.swing.JOptionPane;

public class calculator {
	
	public void operators() {		
		int a, b, soma, sub, mult, divi, resto;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para A: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para B: "));
		
		soma = a+b;
		sub = a-b;
		mult = a*b;
		divi = a/b;
		resto = a%b;
		
		JOptionPane.showMessageDialog(null, "A soma de "+a+" + "+b+" �: "+soma+
		                              "\nA sobra de "+a+" - "+b+" �: "+sub+
		                              "\nO produto de "+a+" * "+b+" �: "+mult+
		                              "\nO quociente de "+a+" / "+b+" �: "+divi+
		                              "\nO resto de "+a+" / "+b+" � "+resto);
		System.out.println("A soma de "+a+" + "+b+" �: "+soma);
		System.out.println("A sobra de "+a+" - "+b+" �: "+sub);
		System.out.println("O produto de "+a+" * "+b+" �: "+mult);
		System.out.println("O quociente de "+a+" / "+b+" �: "+divi);
		System.out.println("O resto de "+a+" / "+b+" �: "+resto);
		}
	
}
