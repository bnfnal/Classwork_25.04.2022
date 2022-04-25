# Classwork_25.04.2022
 
## Task 1: Cat years, Dog years 
 
### Class:  
                Dinglemouse 
### Function:    
                humanYearsCatYearsDogYears(final int humanYears) 
 
### Task: 

I have a cat and a dog.
I got them at the same time as kitten/puppy. That was humanYears years ago.
Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:
humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
  
### Favorite solution: 
 
 
      public class Dinglemouse 
      {
         public static int[] humanYearsCatYearsDogYears(final int h) 
         {
            return new int[]{h, h==1 ? 15 : h==2 ? 24 : 24+4*(h-2), h==1 ? 15 : h==2 ? 24 : 24+5*(h-2)};
         }
      }
      

 
