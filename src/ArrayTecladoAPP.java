import javax.swing.JOptionPane;

public class ArrayTecladoAPP {

	public static void main(String[] args) {
		
		int num[] = new int[10];
		
		rellenarValores(num);
		
		mostrarValores(num);

	}
	
	public static void rellenarValores(int lista[]) {
		
		for(int i = 0; i < lista.length; i++) {
			String numTexto = JOptionPane.showInputDialog("Introduce un numero");
			lista[i] = Integer.parseInt(numTexto);
		}
	}

	public static void mostrarValores(int lista[]) {
	
		for(int i = 0; i < lista.length; i++) {
			System.out.println("En el indice " + i + " el valor es " + lista[i]);		
		}
	}
}
