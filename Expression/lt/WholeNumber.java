package lt;

// states that WholeNumber class is inherited from Expression
// Note: java may only have direct inheritance only
public class WholeNumber implements Expression {
	// private attribute
	// (without any declaration of visibility -> package level)
	private int value;

	// constructor
	public WholeNumber(int v) {
		value = v;
	}

	public int evaluate() {
		return this.value;
	}


	// this is an annotation
	// this signifies to compiler that it is intended to override a method
	// of some super class
	// extra check for the compiler
	@Override
	public boolean equals(Object ob) {
		// check if null
		if (ob == null) { return false; }

		// test if ob is a WholeNumber
		if (!(ob instanceof WholeNumber)) { return false;}

		// cast Object to WholeNumber type
		WholeNumber that = (WholeNumber) ob;

		return this.value == that.value;
	}

	@Override
	public String toString() {
		// statically convert int value to String type
		return String.valueOf(this.value);
	}

}