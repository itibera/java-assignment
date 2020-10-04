// Write a program that takes a String from the user on the command-line and print it in reverse.

class StringReverse 
{ 
	public static void main(String[] args) {
		for(int i=args.length-1; i>=0; i--) {
			System.out.print(args[i] + " ");
		}
		 
	} 
} 

