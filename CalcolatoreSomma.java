// Libreria per Input

import java.util.Scanner;

public class CalcolatoreSomma {

    // Metodo Principale

    public static void main(String[] args) {

        // Dichiarazione variabili

        int n1;
        int n2;

        int result;

        // Oggetti Input

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        // Inserimento dati
        
        System.out.println("Inserisci il primo numero: ");
        n1 = num1.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        n2 = num2.nextInt();

        result = n1 + n2;
        System.out.println("\nRisultato: " + result);

    }
}