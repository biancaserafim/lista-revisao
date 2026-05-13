// QUESTÃO 16
// Retornar a posição de um valor na fila linear dinâmica

class No {
    int dado;
    No prox;

    public No(int dado) {
        this.dado = dado;
    }
}

class FilaDinamica {
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

    public int buscarPosicao(int valor) {
        No aux = inicio;
        int pos = 0;

        while (aux != null) {
            if (aux.dado == valor) {
                return pos;
            }

            aux = aux.prox;
            pos++;
        }

        return -1;
    }
}