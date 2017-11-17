import java.util.Scanner;
public class Main {
   private static Scanner aScanner;
   public static void main (String[] args) {
      aScanner = new Scanner(System.in);
      int koreanScore, englishScore, computerScore;
      int aAverage=0, bAverage=0,cAverage=0, dAverage=0,fAverage=0;
      System.out.println("> 세 과목(국어,영어,컴퓨터)의 점수를 차례로 입력하시오: ");
      koreanScore = inputNumber();
      englishScore = inputNumber();
      computerScore = inputNumber();
      while ((koreanScore>=0)&&(englishScore>=0)&&(computerScore>=0)) {
         if (koreanScore>100||englishScore>100||computerScore>100) {
            System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
         }
         else {
            char koreanGrade =score2Grade(koreanScore);
            char englishGrade =score2Grade(englishScore);
            char computerGrade =score2Grade(computerScore);
            double koreanPoint = grade2Point(koreanGrade);
            double englishPoint = grade2Point(englishGrade);
            double computerPoint = grade2Point(computerGrade);
            double gpa = calcGPA(koreanPoint, englishPoint, computerPoint);
            System.out.println(" [국어 점수] : "+koreanScore+"[국어 학점] : "+koreanGrade+"[국어 평점] : "+koreanPoint);
            System.out.println(" [영어 점수] : "+englishScore+"[영어 학점] : "+englishGrade+"[영어 평점] : "+englishPoint);
            System.out.println(" [컴퓨터 점수] : "+computerScore+"[컴퓨터 학점] : "+computerGrade+"[컴퓨터 평점] : "+computerPoint);
            System.out.println("이 학생의 평균 평점은 "+gpa+"입니다.");
            if (4.0<=gpa) {
               aAverage++;
            }
            else if ((3.0<=gpa)&&(gpa<4.0)) {
               bAverage++;
            }
            else if ((2.0<=gpa)&&(gpa<3.0)) {
               cAverage++;
            }
            else if ((1.0<=gpa)&&(gpa<2.0)) {
               dAverage++;
            }
            else {
               fAverage++;
            }
         }
         System.out.println("> 세 과목(국어,영어,컴퓨터)의 점수를 차례로 입력하시오: ");
         koreanScore = inputNumber();
         englishScore = inputNumber();
         computerScore = inputNumber();
      }
      System.out.println("평균 평점 4.0 이상은 "+aAverage+"명 입니다.");
      System.out.println("평균 평점 3.0 이상 4.0 미만은 "+bAverage+"명 입니다.");
      System.out.println("평균 평점 2.0 이상 3.0 미만은 "+cAverage+"명 입니다.");
      System.out.println("평균 평점 1.0 이상 2.0 미만은 "+dAverage+"명 입니다.");
      System.out.println("평균 평점 0.0 이상 1.0 미만은 "+fAverage+"명 입니다.");
      System.out.println("프로그램을 종료합니다.");
   }
   private static int inputNumber() {
      aScanner = new Scanner(System.in);
      int n = aScanner.nextInt();
      return n;
   }
   private static char score2Grade(int aScore) {
      char aGrade;
      if ((90<=aScore)&&(aScore<=100)) {
         aGrade ='A';
      }
      else if ((80<=aScore)&&(aScore<90)) {
         aGrade ='B';
      }
      else if ((70<=aScore)&&(aScore<80)) {
         aGrade ='C';
      }
      else if ((60<=aScore)&&(aScore<70)) {
         aGrade ='D';
      }
      else {
         aGrade ='F';
      }
      return aGrade;
   }
   private static double grade2Point(char grade) {
      double point;
      if (grade == 'A') {
         point = 4.0;
      }
      else if (grade =='B') {
         point = 3.0;
      }
      else if (grade =='C') {
         point = 2.0;
      }
      else if (grade =='D') {
         point = 1.0;
      }
      else {
         point = 0.0;
      }
      return point;
   }
   private static double calcGPA (double koreanPoint, double englishPoint, double computerPoint) {
	   return ((double) koreanPoint + (double) englishPoint + (double) computerPoint)/3;
   }

}