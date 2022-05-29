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
      

## Task 2: Write Number in Expanded Form
 
### Class:
                ExpandedForm
### Function:    
                expandedForm(int num) 
 
### Task: 
 
You will be given a number and you will need to return it as a string in Expanded Form.
 
### Examples: 
 
     Kata.expandedForm(12); # Should return "10 + 2"
     Kata.expandedForm(42); # Should return "40 + 2"
     Kata.expandedForm(70304); # Should return "70000 + 300 + 4" 
 
 
### Favorite solution: 
 
 
      public class Kata
      {
         public static String expandedForm(int n)
         {
            int c = 0; String s = "";
            while (n>0){ s = n%10==0 ? s : n%10*(int)Math.pow(10,c)+" + "+s; n/=10; c++;}
            return s.substring(0,s.length()-3);
         }
      }
 
 
## Task 3: I love you, a little , a lot, passionately ... not at all
 
### Class:
                Sid
### Function:    
                String howMuchILoveYou(int nb_petals)
 
### Task: 
 
Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each of the following phrases each time a petal was torn:

I love you
a little
a lot
passionately
madly
not at all
When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.

Your goal in this kata is to determine which phrase the girls would say for a flower of a given number of petals, where nb_petals > 0.
 
 
### Favorite solution: 
 
 
      public class Sid 
      {
          public static String howMuchILoveYou(int nb_petals) 
          {
              String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
              return arr[nb_petals%6];
          }
      }
