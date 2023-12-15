import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String chiave = "chiave";
  Matrice m = new Matrice("TPSIT");
  Vigenere v1 = new Vigenere(0, 12, 0, 12, m);
  Vigenere v2 = new Vigenere(0, 12, 13, 25, m);
  Vigenere v3 = new Vigenere(13, 25, 0, 12, m);
  Vigenere v4 = new Vigenere(13, 25, 13, 25, m);

  Thread t1 = new Thread(v1);
  Thread t2 = new Thread(v2);
  Thread t3 = new Thread(v3);
  Thread t4 = new Thread(v4);  

  t1.start();
  t2.start();
  t3.start();
  t4.start();

  System.out.println("Inserisci la frase in chiaro da poi: ");
  String frase = scanner.nextline();
  scanner.close();

  String frase = m.()
    }
  }