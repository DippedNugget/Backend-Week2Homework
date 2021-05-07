
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Answer to 5a:");
		
		int i = 0;
		while (i <= 100) {
			System.out.println(i);
			i += 2;
		}

		System.out.println(' ');
		System.out.println("Answer to 5b");
		
		int x = 100;
		while (x >= 0) {
			System.out.println(x);
			x -= 3;
		}
		
		System.out.println(' ');
		System.out.println("Answer to 5c");
		
		for (int b = 1; b <= 100; b += 2) {
			System.out.println(b);
		}
	
		System.out.println(' ');
		System.out.println("Answer to 5d");
		
		for (int w = 0; w <= 100; w++) {
			if (w % 15 == 0) {
				System.out.println("HelloWorld");
			}else if (w % 5 == 0) {
				System.out.println("World");
			}else if (w % 3 == 0) {
				System.out.println("Hello");
			}else {
				System.out.println(w);
			}
		
		}
		
			
	}
	

}
