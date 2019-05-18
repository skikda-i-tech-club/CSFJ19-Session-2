package checked;

public class Interval {

  // [a, b[ <=> a <= x < b
  protected int a;
  protected int b;

  public Interval(int a, int b)
          throws InvalidIntervalException {
    setAB(a, b);
  }

  public Interval() {
  }

  public int getA() {
    return a;
  }

  // le nouveau a doit être <= à b
  public void setA(int a)
          throws InvalidIntervalException {
    setAB(a, b);
  }

  public int getB() {
    return b;
  }

  // le nouveau b doit être >= à a
  public void setB(int b)
          throws InvalidIntervalException {
    setAB(a, b);
  }

  public void setAB(int a, int b)
          throws InvalidIntervalException {
// mettre ce bloc ici gardera les valeurs valides.
    if (b < a) {
      throw new InvalidIntervalException(a, b);
    }

    this.a = a;
    this.b = b;

// le mettre ici mettera à jour les attributs même si les paramètres sont invalides.
//    if (b < a) {
//      throw new InvalidIntervalException(a, b);
//    }
  }

  @Override
  public String toString() {
    return "[" + a + ", " + b + "[";
  }

  public Interval union(Interval i2) {
    throw new UnsupportedOperationException("Pas encore implémenté.");
  }

  public Interval inter(Interval i2) {
    throw new UnsupportedOperationException("Pas encore implémenté.");
  }

  public boolean isIn(int val) {
    return a <= val && val < b;
  }

  public boolean isEmpty() {
    return a == b;
  }

  public int getLength() {
    return b - a;
  }

}
