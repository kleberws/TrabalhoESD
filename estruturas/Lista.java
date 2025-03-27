package estruturas;

public class Lista {

    public No inicio;

    public int tamanho = 0;

    public Lista() {
        this.inicio = null;
    }

    public void adicionarAoInicio(int valor) {
        No no = new No(valor);

        if (this.inicio == null) {
            this.inicio = no;
            return;
        }

        this.inicio.anterior = no;
        no.proximo = this.inicio;
        this.inicio = no;
    }

    public void mostrarNos() {
        Iterador iterador = this.getIterador();

        while (iterador.getAtual() != null) {
            iterador.display();
            iterador.proximo();
        }
    }

    public void remover(int valor) {
        No noAux = this.inicio;

        while (noAux != null && noAux.dado != valor) {
            noAux = noAux.proximo;
        }

        if (noAux == null) {
            System.out.println("Valor não encontrado");
            return;
        }

        // se for o único nó na lista
        if (noAux == this.inicio && noAux.proximo == null) {
            this.inicio = null;
            return;
        }

        // se o nó a ser removido está no início da lista
        if (noAux == this.inicio) {
            this.inicio = noAux.proximo;
            this.inicio.anterior = null;
            return;
        }

        // se o nó a ser removido está no final da lista
        if (noAux.proximo == null) {
            noAux.anterior.proximo = null;
            return;
        }

        // se o nó a ser removido está no meio da lista
        noAux.anterior.proximo = noAux.proximo;
        noAux.proximo.anterior = noAux.anterior;
    }

    public Iterador getIterador() {
        return new Iterador(this, this.inicio);
    }

    public void adicionarAoFinal(int valor) {
        No novoNo = new No(valor);

        // se a lista estiver vazia
        if (this.inicio == null) {
            this.inicio = novoNo;
            return;
        }

        // percorre até o final da lista
        No noAux = this.inicio;
        while (noAux.proximo != null) {
            noAux = noAux.proximo;
        }

        // insere o novo nó no final
        noAux.proximo = novoNo;
        novoNo.anterior = noAux;
    }

    public void mostrarElementos() {
        No noAux = this.inicio;
        while (noAux != null) {
            System.out.print(noAux.dado + " ");
            noAux = noAux.proximo;
        }
        System.out.println();
    }

    public int numeroDeNos() {
        int count = 0;
        No noAux = this.inicio;
        while (noAux != null) {
            count++;
            noAux = noAux.proximo;
        }
        return count;
    }

    public void inserirAposValor(int valor, int novoValor) {
        No noAux = this.inicio;
        while (noAux != null && noAux.dado != valor) {
            noAux = noAux.proximo;
        }
        if (noAux == null) {
            System.out.println("Valor não encontrado");
            return;
        }
        No novoNo = new No(novoValor);
        novoNo.proximo = noAux.proximo;
        novoNo.anterior = noAux;
        if (noAux.proximo != null) {
            noAux.proximo.anterior = novoNo;
        }
        noAux.proximo = novoNo;
        this.tamanho++; // Atualiza o tamanho
    }

}
