
import java.util.Scanner;

public class PalindromeTester {
	
	
	public PalindromeTester() {
	
	ArrayStack aStack = new ArrayStack();//Create the arrayStack
	ArrayQueue aQueue = new ArrayQueue();//Create the arrayQueue
	boolean palindrome = false;
	String str2 = "";//String to print at end
	
	
	System.out.println("Enter String: ");
	Scanner s = new Scanner(System.in);//take in input
    String str = s.nextLine();//put input into string
	
	char[] c = new char[str.length()];//Create character array
	c = str.toCharArray();//make an array out of the string and put into char array previously created
	
	
	for(int i = 0; i < str.length(); i++) {//loop through char array
		if(Character.isLetterOrDigit(c[i])) {//ignore anything that isn't alphanumeric
		char f = Character.toUpperCase(c[i]); // convert everything to uppercase so the test isn't case sensitive
		 str2 = str2 + f;//making string to be printed out at end
		aStack.push(f);
		aQueue.enqueue(f);}
	}
	
	while(!aStack.isEmpty()) {
		
		if(!aStack.pop().equals(aQueue.dequeue())) { //compare the value of what is popped from stack and dequeued from queue
			palindrome = false;//set palindrome to false when they don't equal
			break;}//break out of loop when it's not a palindrome
		else palindrome = true;
		
	}
	
	if(palindrome == true) {//print out if it is a palindrome or not
	System.out.println(str2 + " is a palindrome.");}
	else {
		System.out.println(str2 + " is not a palindrome.");
	}
	
	
	
	
	
	}
	public static void main(String[] args) {
		
		PalindromeTester p = new PalindromeTester();
		
	}

}
