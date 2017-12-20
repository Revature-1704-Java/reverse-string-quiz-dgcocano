package quiz;

import java.util.*;

public class ReverseString {
    public String reverse(String input) {
      //Going to swap the characters
      if(input == null) return null;
      char[] workingCharArray = input.toCharArray();

      //Pointers for the current indices to be swapped
      int head = 0;
      int tail = workingCharArray.length -1;

      //Temporary char to hold the inbetween value that would normally get lost during the swap
      char tempStorageChar;

      //Using tail >= head condition to swap stuff up until the halfway point of the string
      while(tail >= head) {

        tempStorageChar = workingCharArray[head];
        workingCharArray[head] = workingCharArray[tail];
        workingCharArray[tail] = tempStorageChar;

        //Moving the indices further
        head++;
        tail--;     
      }
    return new String(workingCharArray);
    }
}
