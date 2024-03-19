package ifsp.aula2;

import java.util.*;

public class CaracteresEmConjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String entrada = scanner.nextLine();

        Set<Character> hashSet = new HashSet<>();
        Set<Character> treeSet = new TreeSet<>();

        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            hashSet.add(caractere);
            treeSet.add(caractere);
        }

        System.out.println("Caracteres presentes no HashSet:");
        for (char c : hashSet) {
            System.out.print(c + " ");
        }
        System.out.println(); 

        System.out.println("Caracteres presentes no TreeSet:");
        for (char c : treeSet) {
            System.out.print(c + " ");
        }
        System.out.println(); 
    }
}

