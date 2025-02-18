
public class ContaPar {
	int contador(int[] vetor, int tamanho) {
		if(tamanho == 0) {
			return 0;
		} 
		if(vetor[tamanho - 1] % 2 == 0) {
			return contador(vetor, tamanho - 1) + 1;
		} else {
			return contador(vetor, tamanho - 1);
		}
	} 
}
