/*
Input Format ::
Read some unknown n lines of input from stdin(System.in) until you reach EOF; 
each line of input contains a non-empty String.

Output Format ::
For each line, print the line number, followed by a single space, 
and then the line content received as input.

Sample Input ::
				Hello world
				I am a file
				Read me until end-of-file.

Sample Output ::
				1 Hello world
				2 I am a file
				3 Read me until end-of-file.
*/

import java.util.*;

class HackerRank9
{
	public static void main(String []args){
		
		Scanner scanner=new Scanner(System.in);
		
		int lineNumber = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
		scanner.close();
	}
}