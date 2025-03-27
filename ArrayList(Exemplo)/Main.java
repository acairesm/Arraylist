import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void println(String p) {
        System.out.println(p);
    }

    public static void print(String p) {
        System.out.print(p);
    }

    public static void main(String[] args) {
        // Criando um ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adicionando elementos
        listaFrutas.add("Maçã");
        listaFrutas.add("Banana");
        listaFrutas.add("Laranja");

        // Acessando um elemento
        println("Fruta na posição 1: " + listaFrutas.get(0)); // Saída: Maçã
        println("Lista Completa: " + listaFrutas);
        println("Digite a fruta que você quer verificar: ");

        String verificar = scanner.nextLine();
        boolean frutaEncontrada = false;

        // Verificando se a fruta está na lista
        for (String fruta : listaFrutas) {
            if (fruta.equalsIgnoreCase(verificar)) {
                println("A fruta " + verificar + " está disponível.");
                frutaEncontrada = true;
                break; // Sai do loop se a fruta for encontrada
            }
        }

        // Se a fruta não foi encontrada, imprime a mensagem
        if (!frutaEncontrada) {
            println("A fruta não está disponível.");
        }

        // Removendo um elemento
        listaFrutas.remove("Maçã");

        // Iterando sobre o ArrayList
        println("Lista de frutas:");
        for (String fruta : listaFrutas) {
            println(fruta);
        }

        // Fechando o scanner
        scanner.close();
    }
}
