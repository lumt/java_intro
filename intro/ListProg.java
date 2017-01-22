package intro;

import intro.List;
import intro.Expression;

public class ListProg {

	public static void main(String[] args) {

		List<Expression> myList = new List<>();

		// catching an exception
		try {
			myList.getFirst();
		} catch (Exception e) {
			// if an exception is thrown:
			e.printStackTrace();
		} finally {
			// whether exception is caught or not
			
		}

	}

}