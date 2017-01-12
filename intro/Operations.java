package intro;

public abstract class Operations implements Expression {

  public int compareTo(Expression that) {
    if (this.evaluate() > that.evaluate()) {
      return 1;
    } else if (this.evaluate() < that.evaluate()) {
      return -1;
    }
    return 0;
  }
}
