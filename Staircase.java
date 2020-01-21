import java.util.Collections;

class Main {
  public static void main(String[] args) {
    // This prints out a staircase 6 stairs (hashes) high, and 6 stairs wide.
    staircase(10);
  }

  static void staircase(int n){
     for(int i = 1; i <= n; i++){
            /*** Build a string that contains spaces and hash elements and print ***/

            /* 
              Creating a variable of spaces:
              using the .join() method from the String class I can define a delimeter
              using the first argument (in this case "") and return a string that is 
              a concatination of the elements passed in the second argument 
              (Collections.nCopies(n-1, "")) that adheres to the given delimeter. 

              Using the method .nCopies from the Collections class, returns a list of the
              element specified in the second argument, multiplied by an integer defined in
              the first argument.
            */

            String spaces = String.join("", Collections.nCopies(n-i, " "));
            String stairs = String.join("", Collections.nCopies(i,"#"));
           
            /* 
                Spaces go first to keep things right-aligned. After each iteration,
                we decrement the number of spaces and add a new stair (hash) 
                (i = number of hash values (stairs), and n - i = number of spaces).
            */
            System.out.println(spaces + stairs);
        }
  }
}