
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		while ((n>=1)&&(n<=176)) {
			double x = (double)n*(3.141592/180.0);
			int numberOfAsterisks = (int) ((mySine(x)*40.0)+0.5);
			printAsterisks (numberOfAsterisks);
			n = n+5;
		}
	}
	private static void printAsterisks (int n ) {
		int a = 0;
		while (a<n) {
			System.out.print("*");
			a++;
		}
		System.out.println();
	}
	private static double mySine (double x) {
		double xSquare = x*x;
		double currentTerm = x;
		int n = 2;
		double sineValue = currentTerm;
		while (Math.abs(currentTerm)>=0.0000001) {
			currentTerm = -currentTerm*xSquare/(double)(n*(n+1));
			sineValue = sineValue + currentTerm;
			n = n+2;
		}
		return sineValue;
	}

}
