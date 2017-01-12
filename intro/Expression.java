package intro;

public interface Expression extends Comparable<Expression> {

  public int evaluate();
  public int compareTo(Expression that);
}
