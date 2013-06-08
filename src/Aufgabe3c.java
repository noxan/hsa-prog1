import java.io.IOException;


public class Aufgabe3c {
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter a number in the format (\"\\uxxxx\", with x in [0-9a-f]): ");
		
		char cinput1 = (char)System.in.read();
		if(cinput1!='\\') {
			System.err.println("[ERROR] invalid format or no input");
			return;
		}
		char cinput2 = (char)System.in.read();
		if(cinput2!='u') {
			System.err.println("[ERROR] invalid format or input too short");
			return;
		}
		char cinput3 = (char)System.in.read();
		if(!checkCharInput(cinput3)) {
			System.err.println("[ERROR] invalid data at pos 0 or input too short");
			return;
		}
		char cinput4 = (char)System.in.read();
		if(!checkCharInput(cinput4)) {
			System.err.println("[ERROR] invalid data at pos 1 or input too short");
			return;
		}
		char cinput5 = (char)System.in.read();
		if(!checkCharInput(cinput5)) {
			System.err.println("[ERROR] invalid data at pos 2 or input too short");
			return;
		}
		char cinput6 = (char)System.in.read();
		if(!checkCharInput(cinput6)) {
			System.err.println("[ERROR] invalid data at pos 3 or input too short");
			return;
		}
		char cinput7 = (char)System.in.read();
		if(cinput7!='\n') {
			System.err.println("[ERROR] input too long");
			return;
		}
		
		System.out.println("[OK] valid input");
		
		int decPos4 = charToInt(cinput3)*16*16*16;
		int decPos3 = charToInt(cinput4)*16*16;
		int decPos2 = charToInt(cinput5)*16;
		int decPos1 = charToInt(cinput6);
		
		int dec = decPos4+decPos3+decPos2+decPos1;
		
		char c = (char)dec;
		
		System.out.println("hex: "+cinput3+cinput4+cinput5+cinput6+", dec: "+dec+", char: "+c);
	}
	
	public static int charToInt(char c) {
		if(c>='0' && c<='9') {
			return (int)(c-'0');
		}
		return (int)(c-'a')+10;
	}
	
	public static boolean checkCharInput(char c) {
		return c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='a' || c=='b' || c=='c' || c=='d' || c=='e' || c=='f';
	}
}
