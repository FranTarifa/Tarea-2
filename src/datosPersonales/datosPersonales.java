package datosPersonales;

import javax.swing.JOptionPane;

public class datosPersonales {

	public static void main (String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
		String apellido = JOptionPane.showInputDialog(null, "Ingrese su Apellido:");;
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad:"));
		String lugarDeResidencia = JOptionPane.showInputDialog(null, "Ingrese su lugar de residencia: ");;
		JOptionPane.showMessageDialog(null,"Su nombre es: "+ nombre +"\nSu apellido es: "+ apellido +"\nSu edad es: "+ edad +"\nSu lugar de residencia es: " + lugarDeResidencia); 
		System.out.println(nombre + "\n" + apellido + "\n" + edad + "\n" + lugarDeResidencia);
	}
}
