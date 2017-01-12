package lt;


// interface = alternative way of defining class (pure abstract class)
// contains a list of unimplemented methods
// similar to virtual functions in C++
public interface Expression {
	// methods that must be provided by subclasses
	public int evaluate();
}