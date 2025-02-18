import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ContaPar par = new ContaPar();
		int[] vetor = {1,2,3,4,5,6,7,8, 9};
		int tamanho = 9;

		JOptionPane.showMessageDialog(null, par.contador(vetor, tamanho));
	}
}
