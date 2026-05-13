// QUESTÃO 15
// Verificar se um elemento existe em uma fila circular estática

class FilaCircular {
    int[] fila;
    int inicio, fim, qtd;

    public FilaCircular(int tamanho) {
        fila = new int[tamanho];
        inicio = 0;
        fim = 0;
        qtd = 0;
    }

    public void enqueue(int valor) {
        if (qtd < fila.length) {
            fila[fim] = valor;
            fim = (fim + 1) % fila.length;
            qtd++;
        }
    }

    public boolean existe(int valor) {
        int i = inicio;

        for (int c = 0; c < qtd; c++) {
            if (fila[i] == valor) {
                return true;
            }
            i = (i + 1) % fila.length;
        }

        return false;
    }
}