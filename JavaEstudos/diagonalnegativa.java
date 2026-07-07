package JavaEstudos;



import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativa {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         int N,i,J,negativos;

         System.out.print("Qual a ordem da matriz? ");
         N = sc.nextInt();

         while(N > 10 || N <= 0){
            System.out.println("Valor invalido! Digite novamente (max 10): ");
            N = sc.nextInt();
         }

         int[][] mat = new int[N][N];
         negativos = 0;
         
         for(i = 0; i < N; i++){
            for(J = 0; J < N; J++){
                System.out.print("Elemento [" + i + "," + J + "]: ");
                mat[i][J] = sc.nextInt();
                if( mat[i][J] < 0){
                    negativos = negativos + 1 ;
                }
            }
        }
        System.out.println("DIAGONAL PRINCIPAL: ");
        for(i = 0; i < N; i++){
            System.out.print(mat[i][i] + " " );
        }

        System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d%n ",negativos);

        sc.close();
    }   
}
