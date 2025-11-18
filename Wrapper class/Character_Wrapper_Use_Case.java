package Wrapper_Class;

public class Character_Wrapper_Use_Case {
	public static void main(String[] args) {
		String s="qwe123 uio";
		int counti=0;
		int countd=0;
		int counts=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				counti++;
			}
			else if(Character.isDigit(s.charAt(i))) {
				countd++;
			}
			else if(Character.isWhitespace(s.charAt(i))) {
				counts++;
			}
		}
		System.out.println("Total letters: "+counti);
		System.out.println("Total digits: "+countd);
		System.out.println("Total Whitespace: "+counts);
	}
}
