import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        String chiave = null; //definizione variabile parola chiave
        System.out.println("Inserisci parola chiave: ");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            chiave = br.readLine(); //lettura parola chiave in input
        } catch (IOException io) { //gestione eccezione i/o
            System.err.println("Errore lettura dati da tastiera");
        }
        //creazione Thread associati alle stanze di vigenere
        Matrice m = new Matrice("TPSIT");
        Vigenere v1 = new Vigenere(0, 12, 0, 12, m);
        Vigenere v2 = new Vigenere(0, 12, 13, 25, m);
        Vigenere v3 = new Vigenere(13, 25, 0, 12, m);
        Vigenere v4 = new Vigenere(13, 25, 13, 25, m);
        
        Thread t1 = new Thread(v1);
        Thread t2 = new Thread(v2);
        Thread t3 = new Thread(v3);
        Thread t4 = new Thread(v4);
        //avvio dei Thread
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try { //attende la terminazione di tutti i Thread
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace(); //gestione eccezione interruption
        }
        //stampa dei risultati ottenuti di ciascuna stanza di vigenere
        v1.stampa();
        v2.stampa();
        v3.stampa();
        v4.stampa();
    }
}
