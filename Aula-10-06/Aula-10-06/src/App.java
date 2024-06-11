import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do triângulo:");
        int tamanho = scanner.nextInt();
        char matriz [][] = new char[tamanho][tamanho];
        
        // Imprime o triângulo retângulo
        System.out.println("Triângulo retângulo:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = '0';
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
       
        
        // Imprime o triângulo retângulo invertido
        System.out.println("\nTriângulo retângulo invertido:");
        for (int i = tamanho - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = '0';
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
        // Imprime o triângulo retângulo invertido horizontalmente
        System.out.println("\nTriângulo retângulo invertido horizontalmente:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = tamanho - 1; j >= 0; j--) {
                if (j <= i) {
                    matriz[i][j] = '0';
                } else {
                    matriz[i][j]= ' ';
                }
                System.out.print(matriz[i][j]); // Imprime os caracteres
            }
            System.out.println(); // Nova linha após cada linha do triângulo
        }

        //Imprime o tringulo retangulo invertido horizontamente e verticalmente
        System.out.println("\nTriângulo retângulo invertido horizontalmente e verticalmente:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (j >= i) {
                    matriz[i][j] = '0';
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
 
            }
      
        }
