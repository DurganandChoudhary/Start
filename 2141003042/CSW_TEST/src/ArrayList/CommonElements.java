package ArrayList;

import java.util.Scanner;

public class CommonElements
{
   public static void main(String[] args)
   {
      int i, j, arrOneSize, arrTwoSize, arrCommonSize, k=0, x, check;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Size of First Array: ");
      arrOneSize = s.nextInt();
      int[] arrOne = new int[arrOneSize];
      System.out.print("Enter " +arrOneSize+ " Elements: ");
      for(i=0; i<arrOneSize; i++)
         arrOne[i] = s.nextInt();
      
      System.out.print("\nEnter the Size of Second Array: ");
      arrTwoSize = s.nextInt();
      int[] arrTwo = new int[arrTwoSize];
      System.out.print("Enter " +arrTwoSize+ " Elements: ");
      for(i=0; i<arrTwoSize; i++)
         arrTwo[i] = s.nextInt();
      
      if(arrOneSize<arrTwoSize)
         arrCommonSize = arrOneSize;
      else
         arrCommonSize = arrTwoSize;
      int[] arrCommon = new int[arrCommonSize];
      
      for(i=0; i<arrOneSize; i++)
      {
         for(j=0; j<arrTwoSize; j++)
         {
            if(arrOne[i]==arrTwo[j])
            {
               check = 0;
               for(x=0; x<k; x++)
               {
                  if(arrCommon[x]==arrOne[i])
                  {
                     check = 1;
                     break;
                  }
               }
               if(check==0)
               {
                  arrCommon[k] = arrOne[i];
                  k++;
               }
            }
         }
      }
      
      if(k==0)
         System.out.println("\nNo common element.");
      else if(k==1)
      {
         System.out.println("\nThere is only one common element.");
         System.out.println("And the element is: " +arrCommon[0]);
      }
      else
      {
         System.out.println("\nThere are " +k+ " common elements found.");
         System.out.print("List of Common Elements: ");
         for(i=0; i<k; i++)
            System.out.print(arrCommon[i]+ " ");
      }
   }
}