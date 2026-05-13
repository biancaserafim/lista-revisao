// QUESTÃO 20
// Verificar se a fila encadeada está em ordem crescente

class No {
    int dado;
    No prox;

    public No(int dado) {
        this.dado = dado;
    }
}

class FilaEncadeada {
    No inicio, fim;

    public void enqueue(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.prox = novo;
            fim = novo;
        }
    }

    public boolean estaCrescente() {
        No aux = inicio;

        while (aux != null && aux.prox != null) {
            if (aux.dado > aux.prox.dado) {
                return false;
            }

            aux = aux.prox;
        }

        return true;
    }
}