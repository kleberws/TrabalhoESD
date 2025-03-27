import estruturas.Lista;

public class VetorApp {

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.adicionarAoInicio(28);
        lista.adicionarAoInicio(27);
        lista.adicionarAoInicio(24);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(32);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(2);

        // mostrar elementos antes de qualquer operação
        lista.mostrarElementos();

        System.out.println("-----");

        // caso queira adicionar qq numero no inicio do vetor: inserirNoInicio()

    }
}