package Basico;

public class InteresseString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG		";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato-apple-lemon-banana-orange";
		String[] vect = s.split("-");
		
		
		System.out.println("- " + original + " -");
		System.out.println("- " +  s01 + " -");
		System.out.println("- " +  s02 + " -");
		System.out.println("- " +  s03 + " -");
		System.out.println("- "+ s04 + " -");
		System.out.println("- "+ s05 + " -");
		System.out.println("- "+ s06 + " -");
		System.out.println("- "+ s07 + " -");
		
		System.out.println("index: " + i);
		System.out.println("last: " + j);
		
		for(int ix = 0; ix < vect.length; ix++) {
			System.out.println(vect[ix]);
		}

	}

}
