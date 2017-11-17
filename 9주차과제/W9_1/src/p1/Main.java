package p1;
import java.util.Scanner;
public class Main {
	private static Scanner aScanner = new Scanner (System.in);
	private static final int MAX_SIZE = 100;
	public static void main(String[] args) {
		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents;
		double average;
		numberOfStudents = 0;
		score = inputScore();
		while (score>=0) {
			if (score>100) {
				System.out.println("오류: 100을 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				scores[numberOfStudents] = score;
				numberOfStudents++;
			}
			score = inputScore();
		}
		average = calcAverage(scores, numberOfStudents);
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+"명의 성적이 입력되었습니다.");
		System.out.println("평균은 "+average+"입니다.");
		System.out.println();
		
		int aboveClassAverage=0;
		int count = 0;
		System.out.println("입력된 성적은 다음과 같습니다.");
		while(count<numberOfStudents) {
			if((double)scores[count]>=average) {
				System.out.println("["+count+"] "+scores[count]+" (평균 이상입니다)");
				aboveClassAverage++;
			}
			else {
				System.out.println("["+count+"] "+scores[count]+" (평균 미만입니다)");
			}
			count++;
		}
		System.out.println("평균 이상인 학생의 수는 "+aboveClassAverage+" 명 입니다.");
		System.out.println();
		int max = calcMax(scores, numberOfStudents);
		int min = calcMin(scores, numberOfStudents);
		System.out.println("최고점은 "+max+" 점 입니다.");
		System.out.println("최저점은 "+min+" 점 입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
	private static int inputScore() {
		int n;
		System.out.print(">점수를 입력하시오: ");
		n = aScanner.nextInt();
		return n;
	}
	private static double calcAverage(int[] elements, int aSize) {
		int i;
		int sum;
		double average;
		i = 0;
		sum = 0;
		while(i<aSize) {
			sum = sum + elements[i];
			i++;
		}
		average = (double)sum/(double)aSize;
		return average;
	}
	private static int calcMax(int[]elements, int aSize) {
		int i,max;
		max = elements[0];
		i = 1;
		while(i<aSize) {
			if(max<elements[i]) {
				max = elements[i];
			}
			i++;
		}
		return max;
	}
	private static int calcMin(int[]elements, int aSize) {
		int i,min;
		min = elements[0];
		i = 1;
		while(i<aSize) {
			if(min>elements[i]) {
				min = elements[i];
			}
			i++;
		}
		return min;
	}
}
