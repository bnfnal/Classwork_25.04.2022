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

         // Task 2: Write Number in Expanded Form
        
        System.out.println("Task 2: Write Number in Expanded Form");
        System.out.println("Введите натуральное число n");
        int x = sc.nextInt();
        System.out.println("Число n в развернутой форме:");
        System.out.println(ExpandedForm.expandedForm(x));
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
    
    // Task 2: Write Number in Expanded Form
    
    public static class ExpandedForm
    {
        public static String expandedForm(int num)
        {
            int x = 0;
            String s = "";
            int n = num;
            int k = 0;
            while(n > 0)
            {
                k += 1;
                n = n/10;
            }
            k = k-1;
            n = num;
            while(n > 0)
            {
                x = (int) Math.pow(10, k);
                if (n/x > 0)
                {
                    if (n < num) s += " + ";
                    s += (n/x)*x;
                }
                n = n%x;
                k -= 1;
            }
            return s;
        }
    }
    
}
