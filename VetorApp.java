import estruturas.Vetor;
import estruturas.Lista;

public class VetorApp {

    public static void main(String[] args) {
        // Criação do vetor
        Vetor vetor = new Vetor();

        // Adicionando elementos ao final da lista
        vetor.adicionarElemento(2);
        vetor.adicionarElemento(7);
        vetor.adicionarElemento(9);
        vetor.adicionarElemento(12);
        vetor.adicionarElemento(16);
        vetor.adicionarElemento(21);
        vetor.adicionarElemento(27);
        vetor.adicionarElemento(33);
        vetor.adicionarElemento(42);
        vetor.adicionarElemento(54);

        System.out.println("Mostrar elementos:");
        vetor.mostrarElementos();

        System.out.println("-----");

        System.out.println("Mostrar nós:");
        vetor.lista.mostrarNos();
    }
}
