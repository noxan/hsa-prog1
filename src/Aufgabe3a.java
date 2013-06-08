
public class Aufgabe3a {
	public static void main(String[] args) {
		boolean op1 = false;
		boolean op2 = false;
		
		// table with || (OR)
		System.out.println(" ||   | " + op2 + " | " + !op2);
		System.out.println("------|-------|------");
		System.out.println(op1 + " | " + (op1 || op2) + " | " + (op1 || !op2));
		op1 = !op1;
		System.out.println(op1 + "  | " + (op1 || op2) + "  | " + (op1 || !op2));
		// end table
		op1 = !op1;
		System.out.println();
		
		// table with | (bitwise OR)
		System.out.println(" |    | " + op2 + " | " + !op2);
		System.out.println("------|-------|------");
		System.out.println(op1 + " | " + (op1 | op2) + " | " + (op1 | !op2));
		op1 = !op1;
		System.out.println(op1 + "  | " + (op1 | op2) + "  | " + (op1 | !op2));
		// end table
		op1 = !op1;
		System.out.println();

		// table with & (bitwise AND)
		System.out.println(" &    | " + op2 + " | " + !op2);
		System.out.println("------|-------|------");
		System.out.println(op1 + " | " + (op1 & op2) + " | " + (op1 & !op2));
		op1 = !op1;
		System.out.println(op1 + "  | " + (op1 & op2) + " | " + (op1 & !op2));
		// end table
		op1 = !op1;
		System.out.println();

		// table with ^ (bitwise XOR)
		System.out.println(" ^    | " + op2 + " | " + !op2);
		System.out.println("------|-------|------");
		System.out.println(op1 + " | " + (op1 ^ op2) + " | " + (op1 ^ !op2));
		op1 = !op1;
		System.out.println(op1 + "  | " + (op1 ^ op2) + "  | " + (op1 ^ !op2));
		// end table
	}
}
