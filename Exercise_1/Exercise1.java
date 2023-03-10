/*  Simple coded by Caroline Eri Sato Ushirobira - IBM Software Developer, March 2023.
    Exercise 01. Java Map

Sample Input:
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Sample Output:
uncle sam=99912222
Not found
harry=12299933

*/
import java.util.Scanner;
import java.util.HashMap;

public class Exercise1{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        HashMap<String,String> phoneBook = new HashMap<String,String>();

        System.out.println("\n------Hello, please provide an input here:------");

        int numberOfEntries = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < numberOfEntries; i++) {
			String name = scan.nextLine();
			String phone = scan.nextLine();

			phoneBook.put(name, phone);
		}

		while (scan.hasNext()) {
			String nameToLookFor = scan.nextLine();

			if (phoneBook.containsKey(nameToLookFor)) {
				System.out.println("\n" + nameToLookFor + "=" + phoneBook.get(nameToLookFor));
			} else {
				System.out.println("Not found");
			}
		}
    }
} 