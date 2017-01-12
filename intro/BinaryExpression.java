package intro;

public abstract class BinaryExpression extends Operations {

  protected Expression left, right;

  public BinaryExpression (Expression l, Expression r) {
    left = l;
    right = r;
  }
}
