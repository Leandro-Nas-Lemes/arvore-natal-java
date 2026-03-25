import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();


            for (int estrelas = 1; estrelas <= N; estrelas += 2) {

                int espacos = (N - estrelas) / 2;

                for (int i = 0; i < espacos; i++) {
                    System.out.print(" ");
                }

                for (int i = 0; i < estrelas; i++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            int espacos = (N - 1) / 2;
            for (int i = 0; i < espacos; i++) {
                System.out.print(" ");
            }
            System.out.println("*");

            espacos = (N - 3) / 2;
            for (int i = 0; i < espacos; i++) {
                System.out.print(" ");
            }
            System.out.println("***");

            System.out.println();
        }
    }
}


// Programa: Árvore de Natal
// Linguagem: Java
// Autor: Leandro
