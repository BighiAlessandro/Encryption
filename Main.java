import com.sun.swing.internal.plaf.metal.resources.metal_zh_CN;

class Main {
  public static void main(String[] args) {
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");
  }

  Matrice m = new Matrice("TPSIT");
  Vigenere V = new Vigenere(0, 12, 0, 12, m);

  //commento di prova
}