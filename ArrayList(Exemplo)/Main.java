import java.util.ArrayList;

public class Main {

    public static void println(String p){

        System.out.println(p);
    }
    public static void print(String p){

        System.out.print(p);
    }

    public static void main(String[] args) {
        // Criando um ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>();

        // Adicionando elementos
        listaFrutas.add("Maçã");
        listaFrutas.add("Banana");
        listaFrutas.add("Laranja");

        // Acessando um elemento
        println("Fruta na posição 1: " + listaFrutas.get(0)); // Saída: Banana
        println("Lista Completa: " + listaFrutas);

        // Removendo um elemento
        listaFrutas.remove("Maçã");

        // Iterando sobre o ArrayList
        System.out.println("Lista de frutas:");
        for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }
    }
}