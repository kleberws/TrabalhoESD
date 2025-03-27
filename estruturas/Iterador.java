package estruturas;

public class Iterador {

    Lista lista;
    No atual;

    public Iterador(Lista lista, No atual) {
        this.lista = lista;
        this.atual = atual;
    }

    public Boolean haProximo() {
        return this.atual.proximo != null;
    }

    public Boolean haAnterior() {
        return this.atual.anterior != null;
    }

    public void proximo() {
        this.atual = atual.proximo;
    }

    public int getDadoAnterior() {
        return this.atual.anterior.dado;
    }

    public int getDadoProximo() {
        return this.atual.proximo.dado;
    }

    public int getDado() {
        return this.atual.dado;
    }

    public No getAtual() {
        return this.atual;
    }

    public void resetar() {
        this.atual = this.lista.inicio;
    }

    public void display() {
        if (this.haAnterior()) {
            System.out.print("Anterior -> " + this.getDadoAnterior() + " | ");
        }

        System.out.print("No " + this.getDado());

        if (this.haProximo()) {
            System.out.println(" | Proximo -> " + this.getDadoProximo());
        }
        System.out.println("");
        this.proximo();
    }

    public void inserirAposAtual(int novoValor) {
        No novoNo = new No(novoValor);
        if (this.atual.proximo != null) {
            novoNo.proximo = this.atual.proximo;
            this.atual.proximo.anterior = novoNo;
        }
        this.atual.proximo = novoNo;
        novoNo.anterior = this.atual;
        this.lista.tamanho++; // Atualiza o tamanho
    }

    public void removerAposAtual() {
        if (this.atual.proximo != null) {
            No noRemover = this.atual.proximo;
            this.atual.proximo = noRemover.proximo;
            if (noRemover.proximo != null) {
                noRemover.proximo.anterior = this.atual;
            }
            noRemover = null; // Removendo a referência
            this.lista.tamanho--; // Atualiza o tamanho
        }
    }

}
