package ifsp.aula2;

import java.util.*;

public class PalavrasNaoRepetidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        Set<String> palavrasNaoRepetidas = new HashSet<>();

        for (String palavra : palavras) {
            palavra = palavra.trim().toLowerCase();
            palavrasNaoRepetidas.add(palavra);
        }

        int numPalavrasNaoRepetidas = palavrasNaoRepetidas.size();

        System.out.println("Número de palavras não repetidas na frase: " + numPalavrasNaoRepetidas);
    }
}