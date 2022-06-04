public class Q15{
	public void reverseWordInMyString(String str){
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++){
			String word = words[i]; 
			String reverseWord = "";
			for (int j = word.length()-1; j >= 0; j--) {
					reverseWord = reverseWord + word.charAt(j);
				}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}
	public static void main(String[] args){
		Q15 obj = new Q15();
		obj.reverseWordInMyString("Welcome to Indore");
		obj.reverseWordInMyString("This is an easy Java Program");
   }
}

// Output ->
// Welcome to Indore
// emocleW ot erodnI 
// This is an easy Java Program
// sihT si na ysae avaJ margorP 
