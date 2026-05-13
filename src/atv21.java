// QUESTÃO 21
// Mostrar o topo da pilha encadeada

class No {
    int dado;
    No prox;

    public No(int dado) {
        this.dado = dado;
    }
}

class PilhaEncadeada {
    No topo;

    public void push(int valor) {
        No novo = new No(valor);

        novo.prox = topo;
        topo = novo;
    }

    public int mostrarTopo() {
        return topo.dado;
    }
}