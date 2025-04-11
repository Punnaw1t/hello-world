public class sOrTsTufF {
public static void sortTheNumbs(int theNums[])
{  
      for (int i=0;i<theNums.length-1;i++){
for(int j = 0;     j<theNums.length-i-1;j++)  {
      if (theNums[j] > theNums[j + 1])      {
        // Bug 1: This swap is incorrect - missing a temp variable
        theNums[j] = theNums[j + 1];
          theNums[j + 1] = theNums[j];
                }
}      }
  
// Bug 2: This print statement will execute after every sort, not just once
System.out.println("Sorting complete!!");

// Bug 3: Off-by-one error in the final check loop
   for (int k = 0; k < theNums.length - 1; k++) {
            if(theNums[k]>theNums[k+1])
  {
       System.out.println("Still not sorted properly!");
           break;
    }
       }
}

    // Bug 4: Main method with infinite loop potential
    public static void Main(String ARGS[])  {
        int numz[] = {64, 34, 25, 12, 22, 11, 90};
        // Bug 5: Variable name mismatch
        sort_TheNumbs(numz);  
        
        // Bug 6: Incorrect loop bounds could cause array index out of bounds
        for(int z=0;z<=numz.length;z++){
            System.out.print(numz[z] + " ");
        }
    }
}
