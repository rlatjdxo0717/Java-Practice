package �迭����;

import java.util.Random;

public class �����Ѱ�ã�� {

   public static void main(String[] args) {
      int[] num = new int[1000];
      Random r = new Random(42);
      for (int i = 0; i < num.length; i++) {
         num[i] = r.nextInt(1000);
      }
      for (int x : num) {
         System.out.print(x + " ");
      }
      System.out.println();
      int count = 0;
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      for (int x : num) {
         if (x >= 600) {
            count++;
         } else if (x >= 500) {
            count1++;
         } else if (x >= 400) {
            count2++;
         } else {
            count3++;
         }

      }
      System.out.println("600�� �̻��� ������" + count + "��");
      System.out.println("500�� �̻��� ������" + count1 + "��");
      System.out.println("400�� �̻��� ������" + count2 + "��");
      System.out.println("300�� �̻��� ������" + count3 + "��");
   }
}