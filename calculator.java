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
		
		JOptionPane.showMessageDialog(null, "A soma de "+a+" + "+b+" é: "+soma+
		                              "\nA sobra de "+a+" - "+b+" é: "+sub+
		                              "\nO produto de "+a+" * "+b+" é: "+mult+
		                              "\nO quociente de "+a+" / "+b+" é: "+divi+
		                              "\nO resto de "+a+" / "+b+" é "+resto);
		System.out.println("A soma de "+a+" + "+b+" é: "+soma);
		System.out.println("A sobra de "+a+" - "+b+" é: "+sub);
		System.out.println("O produto de "+a+" * "+b+" é: "+mult);
		System.out.println("O quociente de "+a+" / "+b+" é: "+divi);
		System.out.println("O resto de "+a+" / "+b+" é: "+resto);
		}
	
}
