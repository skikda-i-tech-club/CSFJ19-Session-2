package unchecked;

public class Main {

  public static void main(String[] args) {
    // Les 4 Exceptions suivante sont des "unchecked Exceptions" c'est à dire
    // que le compilateur ne peut pas savoir si il y'a un risque d'Exception
    // ou non. Ils n'apparaissent qu'à l'exécution.
//    System.out.println(1 / 0);
// 
//    String str = (String) new Object();
//
//    int[] tab = new int[1];
//    System.out.println(tab[2]);
//
    // mais on peut capturer l'Exception si on veut ...
    try {
      Object obj = null;
      System.out.println(obj.toString());
//    } catch (Exception e) {
//    } catch (RuntimeException e) {
    } catch (NullPointerException e) {
      // ... et la gérer comme on veut.
      System.out.println("Null Pointer Exception !!!");
    }

    System.out.println("Fin normale du programme.");
  }

}
