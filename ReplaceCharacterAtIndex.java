import java.util.Scanner;
public class ReplaceCharacterAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("enter a string:");
  String inputString = sc.nextLine();
  System.out.print("Enter the index to replace: ");
  int index = sc.nextInt();
  System.out.print("Enter the character to replace with: ");
  char replacementChar = sc.next().charAt(0);
  
  String resultString = replaceCharacterAtIndex(inputString, index, replacementChar);
  
  System.out.println("Original String: " + inputString);
  System.out.println("Modified String: " + resultString);

	}
	  public static String replaceCharacterAtIndex(String input, int index, char replacement) {
	        if (index < 0 || index >= input.length()) {
	            System.out.println("Index out of bounds!");
	            return input;
	        }
	        char[] chars = input.toCharArray();
	        chars[index] = replacement;
	        return new String(chars);
	    }

}
