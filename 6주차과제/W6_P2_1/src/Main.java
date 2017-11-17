

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		while ((n >= 1)&&(n<=176)) {
			double x = (double)n*(3.141592/180.0);
			int numberOfAsterisks = (int) ((Math.sin(x)*40.0)+0.5);
			printAsterisks(numberOfAsterisks);
			n = n+5;
		}
	}

	private static void printAsterisks (int n) {
		int a = 0;
		while (a<n) {
			System.out.print("*");
			a++;
		}
		System.out.println();
	}

}
