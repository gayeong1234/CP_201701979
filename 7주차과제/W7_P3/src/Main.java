import java.util.Scanner;
public class Main {
   private static Scanner aScanner;
   public static void main(String[] args) {
      aScanner = new Scanner(System.in);
      int koreanScore;
      int englishScore;
      int computerScore;
      
      System.out.println("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�: ");
      System.out.print("-������ �Է��Ͻÿ�: ");
      koreanScore = inputNumber();
      System.out.print("-������ �Է��Ͻÿ�: ");
      englishScore = inputNumber();
      System.out.print("-������ �Է��Ͻÿ�: ");
      computerScore = inputNumber();
      while ((koreanScore>=0)&&(englishScore>=0)&&(computerScore>=0)) {
         if (koreanScore>100||englishScore>100||computerScore>100) {
            System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
         }
         else {
            char koreanGrade = score2Grade(koreanScore);
            char englishGrade = score2Grade(englishScore);
            char computerGrade = score2Grade(computerScore);
            double koreanPoint = grade2Point(koreanGrade);
            double englishPoint = grade2Point(englishGrade);
            double computerPoint = grade2Point(computerGrade);
            System.out.println("[����] ���� : "+ koreanScore+", ���� : "+ koreanGrade+", ���� : "+koreanPoint);
            System.out.println("[����] ���� : "+ englishScore+", ���� : "+ englishGrade+", ���� : "+englishPoint);
            System.out.println("[��ǻ��] ���� : "+ computerScore+", ���� : "+ computerGrade+", ���� : "+computerPoint);
            
         }
         System.out.println("> �� ���� (����, ���� ��ǻ��)�� ������ ���ʷ� �Է��մϴ�: ");
         System.out.print("-������ �Է��Ͻÿ�: ");
         koreanScore = inputNumber();
         System.out.print("-������ �Է��Ͻÿ�: ");
         englishScore = inputNumber();
         System.out.print("-������ �Է��Ͻÿ�: ");
         computerScore = inputNumber();
      }
      System.out.println("���� ������ �ԷµǾ� ���α׷��� �����մϴ�.");
      System.out.println();
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
         aGrade = 'A';
      }
      else if ((80<=aScore)&&(aScore<90)) {
         aGrade = 'B';
      }
      else if ((70<=aScore)&&(aScore<80)) {
         aGrade = 'C';
      }
      else if ((60<=aScore)&&(aScore<70)) {
         aGrade = 'D';
      }
      else {
         aGrade = 'F';
      }
      return aGrade;
   }
   private static double grade2Point(int aGrade) {
      double point;
      if (aGrade == 'A') {
         point = 4.0;
      }
      else if (aGrade =='B') {
         point = 3.0;
      }
      else if (aGrade =='C') {
         point = 2.0;
      }
      else if (aGrade =='D') {
         point = 1.0;
      }
      else {
         point = 0.0;
      }
      return point;
   }

}