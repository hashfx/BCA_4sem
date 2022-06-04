class Q16{
	public static void main(String args[]){

		String str = "Hello I'm your String";
		String[] splitStr = str.split("\\s+");

		for(String s: splitStr){
			System.out.println(s);
		}
	}
}

// Output -> 
// Hello
// I'm
// your
// String
