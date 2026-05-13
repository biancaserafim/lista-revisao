// QUESTÃO 18
// Mostrar a quantidade de elementos da fila

class FilaQuantidade {
    int[] fila;
    int qtd;

    public FilaQuantidade(int tamanho) {
        fila = new int[tamanho];
        qtd = 0;
    }

    public void enqueue(int valor) {
        fila[qtd] = valor;
        qtd++;
    }

    public int quantidade() {
        return qtd;
    }
}