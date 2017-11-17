import java.util.Scanner;
public class Main {
   private static Scanner aScanner;
   public static void main (String[] args) {
      aScanner = new Scanner(System.in);
      int koreanScore, englishScore, computerScore;
      int aAverage=0, bAverage=0,cAverage=0, dAverage=0,fAverage=0;
      System.out.println("> �� ����(����,����,��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
      koreanScore = inputNumber();
      englishScore = inputNumber();
      computerScore = inputNumber();
      while ((koreanScore>=0)&&(englishScore>=0)&&(computerScore>=0)) {
         if (koreanScore>100||englishScore>100||computerScore>100) {
            System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
         }
         else {
            char koreanGrade =score2Grade(koreanScore);
            char englishGrade =score2Grade(englishScore);
            char computerGrade =score2Grade(computerScore);
            double koreanPoint = grade2Point(koreanGrade);
            double englishPoint = grade2Point(englishGrade);
            double computerPoint = grade2Point(computerGrade);
            double gpa = calcGPA(koreanPoint, englishPoint, computerPoint);
            System.out.println(" [���� ����] : "+koreanScore+"[���� ����] : "+koreanGrade+"[���� ����] : "+koreanPoint);
            System.out.println(" [���� ����] : "+englishScore+"[���� ����] : "+englishGrade+"[���� ����] : "+englishPoint);
            System.out.println(" [��ǻ�� ����] : "+computerScore+"[��ǻ�� ����] : "+computerGrade+"[��ǻ�� ����] : "+computerPoint);
            System.out.println("�� �л��� ��� ������ "+gpa+"�Դϴ�.");
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
         System.out.println("> �� ����(����,����,��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
         koreanScore = inputNumber();
         englishScore = inputNumber();
         computerScore = inputNumber();
      }
      System.out.println("��� ���� 4.0 �̻��� "+aAverage+"�� �Դϴ�.");
      System.out.println("��� ���� 3.0 �̻� 4.0 �̸��� "+bAverage+"�� �Դϴ�.");
      System.out.println("��� ���� 2.0 �̻� 3.0 �̸��� "+cAverage+"�� �Դϴ�.");
      System.out.println("��� ���� 1.0 �̻� 2.0 �̸��� "+dAverage+"�� �Դϴ�.");
      System.out.println("��� ���� 0.0 �̻� 1.0 �̸��� "+fAverage+"�� �Դϴ�.");
      System.out.println("���α׷��� �����մϴ�.");
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