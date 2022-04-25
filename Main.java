import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Task 1: Cat years, Dog years
        
        System.out.println("Task 1: Cat years, Dog years");
        System.out.println("Введите натуральное число");
        int y = sc.nextInt();
        int[] years = Dinglemouse.humanYearsCatYearsDogYears(y);
        System.out.println("Массив состоящий из человеческих, кошачьих и собачьих лет:");
        for (int i = 0; i < years.length; i++)
        {
            System.out.print(years[i] + " ");
        }
        System.out.println();
        System.out.println();
        
    }
    
    // Task 1: Cat years, Dog years
    
   public static class Dinglemouse 
   {
      public static int[] humanYearsCatYearsDogYears(final int humanYears) 
      {
        int cat = 0;
        int dog = 0;
        int[] years = new int[3];
        int y = humanYears;
        while (y>0)
        {
          if (cat == 0)
          {
            cat += 15;
            y -= 1;
            continue;
          }
          if (cat == 15)
          {
            cat += 9;
            y -= 1;
            continue;
          }
          if (cat >= 24)
          {
            cat += 4*y;
            y = 0;
          }
        }
        y = humanYears;
        while (y>0)
        {
          if (dog == 0)
          {
            dog += 15;
            y -= 1;
            continue;
          }
          if (dog == 15)
          {
            dog += 9;
            y -= 1;
            continue;
          }
          if (dog >= 24)
          {
            dog += 5*y;
            y = 0;
          }
        }
        return new int[] {humanYears, cat, dog};
      }
    }
    
}
