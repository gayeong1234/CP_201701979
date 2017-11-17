package p3;
import java.util.Scanner;
public class Main {
	private static Scanner aScanner = new Scanner(System.in);
	private static final int MAX_SIZE = 100;
	public static void main(String[] args) {
		int scoreKorean;
		int scoreComputer;
		int[] scoresKorean = new int[MAX_SIZE];
		int[] scoresComputer = new int[MAX_SIZE];
		int numberOfStudents = 0;
		double[] average = new double[MAX_SIZE];
		double totalAverage = 0;
		System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오: ");
		scoreKorean = inputScore();
		scoreComputer = inputScore();
		while ((scoreKorean>=0)&&(scoreComputer>=0)) {
			if ((scoreKorean>100)||(scoreComputer>100)) {
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				scoresKorean[numberOfStudents] = scoreKorean;
				scoresComputer[numberOfStudents] = scoreComputer;
				average[numberOfStudents] = (double)(scoreKorean+scoreComputer)/2;
				numberOfStudents++;
			}
			System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오: ");
			scoreKorean = inputScore();
			scoreComputer = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+" 명의 성적이 입력되었습니다.");
		System.out.println();
		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		int count = 0;
		while (count<numberOfStudents) {
			System.out.println("["+count+"] "+scoresKorean[count]+" "+scoresComputer[count]+" (평균  "+average[count]+")");
			totalAverage+=average[count];
			count++;
		}
		totalAverage = totalAverage/numberOfStudents;
		count = 0;
		int i = 0;
		while(i<numberOfStudents) {
			if (totalAverage<=average[i]) {
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println("학급 평균은 "+totalAverage+" 입니다.");
		System.out.println("평균 이상인 학생의 수는 "+count+" 명 입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
	private static int inputScore() {
		int n;
		n = aScanner.nextInt();
		return n;
	}
}