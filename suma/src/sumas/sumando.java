package sumas;

import javax.swing.JOptionPane;

public class sumando {
	public static void main(String[] args) {
		int x=0, y=0, z=0;
		
		x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		z=x+y;
		JOptionPane.showMessageDialog(null,"la suma es una :\n"+ z); 
		JOptionPane.showMessageDialog(null,"jonatan es idiota"); 
	}
	
}
