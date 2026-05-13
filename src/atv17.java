// QUESTÃO 17
// Mostrar o último elemento da fila

class Fila {
    int[] fila;
    int fim;

    public Fila(int tamanho) {
        fila = new int[tamanho];
        fim = 0;
    }

    public void enqueue(int valor) {
        fila[fim] = valor;
        fim++;
    }

    public int ultimoElemento() {
        return fila[fim - 1];
    }
}