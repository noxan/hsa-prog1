import java.io.IOException;


public class Aufgabe3b {
	public static void main(String[] args) throws IOException {
		char c1 = (char) System.in.read();
		char c2 = (char) System.in.read();
		char c3 = (char) System.in.read();
		char c4 = (char) System.in.read();
		
		c1 = Character.toUpperCase(c1);
		if(c1!='T' && c1!='F') {
			System.err.println("invalid first operand");
			return;
		}
		boolean b1 = c1=='T';
		boolean b2;
		
		if(c4!='\n') { // cannot be a double operator
			if(c4=='F') {
				b2 = false;
			} else if(c4=='T') {
				b2 = true;
			} else {
				System.err.println("invalid second operand");
				return;
			}
			if(c2=='&' && c2==c3) {
				System.out.println(c1+"&&"+c4+"=="+(b1&&b2));
			} else if(c2=='|' && c2==c3) {
				System.out.println(c1+"||"+c4+"=="+(b1||b2));
			} else {
				System.err.println("invalid double operator");
				return;
			}
		} else {
			if(c3=='F') {
				b2 = false;
			} else if(c3=='T') {
				b2 = true;
			} else {
				System.err.println("invalid second operand");
				return;
			}
			if(c2=='^') {
				System.out.println(c1+"^"+c3+"=="+(b1^b2));
			} else if(c2=='|') {
				System.out.println(c1+"|"+c3+"=="+(b1|b2));
			} else if(c2=='&') {
				System.out.println(c1+"&"+c3+"=="+(b1&b2));
			} else {
				System.err.println("invalid single operator");
			}
		}
	}
}
