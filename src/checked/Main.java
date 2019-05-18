package checked;

public class Main {

  public static void main(String[] args) {

    int x = 20;
    int y = 10;

    Interval interval = new Interval();
    try {
      interval.setAB(x, y);
    } catch (InvalidIntervalException ex) {
//      ex.printStackTrace();
      // ici on est sur que y < x
      try {
        interval.setAB(y, x);
      } catch (InvalidIntervalException ex1) {
        // Bloc inaccessible
      }
    }

    System.out.println(interval);
    try {
// InvalidIntervalException: 20 < 21
//      interval.setA(21);
//      interval.setB(21);

      interval.setAB(21, 21);
    } catch (InvalidIntervalException ex) {
      ex.printStackTrace();
    }
    System.out.println(interval);

    System.out.println(interval.isIn(20));
    System.out.println(interval.isIn(21));
    System.out.println(interval.isIn(22));

    System.out.println(interval.isEmpty());

  }

}
