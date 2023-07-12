package myproj_intro;

public class NestedLoop {

	public static void main(String[] args) {
		// 1st loop: from 1 to 9
		for (int i = 1; i <= 9; i++) {
			System.out.println("Multiplication of " + i + ":");
			// 2nd loop: multiply the number of 1st loop, 1 to 9
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}

}
