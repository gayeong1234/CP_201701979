import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score;
		int count = 0;
		int sumOfScores = 0;
		char grade = 0 ;
		int Astudent = 0;
		int Bstudent = 0;
		int Cstudent = 0;
		int Dstudent = 0;
		int Fstudent = 0;

		System.out.print("성적을 입력하시오: ");
		score = scanner.nextInt();
		while (score >= 0) {
			//성적 처리
			if (score > 100) {//잘못된 성적
				System.out.println("오류: 최대점수 100을 넘었습니다. ");
			}
			else { //정상적인 성적
				count = count + 1;
				sumOfScores = sumOfScores + score;
				if (score >= 90 && score <= 100) {
					grade = 'A';
					Astudent = Astudent + 1;
				}
				else if (score >= 80 && score <= 89) {
					Bstudent = Bstudent + 1;
					grade = 'B';
				}
				else if (score >= 70 && score <= 79) {
					Cstudent = Cstudent + 1;
					grade = 'C';
				}
				else if (score >= 60 && score <= 69) {
					Dstudent = Dstudent + 1;
					grade = 'D';
				}
				else if (score >= 0 && score <= 59){
					Fstudent = Fstudent + 1;
					grade = 'F';
				}
				System.out.println("성적: " + score + ", 학점:" + grade);

			}
			System.out.print("성적을 입력하시오: ");
			score = scanner.nextInt();
		}

		System.out.println();
		System.out.println("학생수는 " + count + "명 입니다.");
		System.out.println("A는 " + Astudent + " 명 입니다." );
		System.out.println("B는 " + Bstudent + " 명 입니다." );
		System.out.println("C는 " + Cstudent + " 명 입니다." );
		System.out.println("D는 " + Dstudent + " 명 입니다." );
		System.out.println("F는 " + Fstudent + " 명 입니다." );

		double average = (double) sumOfScores / (double) count ;
		System.out.println("평균은 " + average + "점 입니다."); 
		scanner.close();
	}

}
