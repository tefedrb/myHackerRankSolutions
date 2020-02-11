import java.util.Scanner;
import java.io.*;
import java.util.*;


class Main {

  public static void main(String[] args) {
    hackerRankSolution();
  }

  static void hackerRankSolution(){
     // Create scanner for user input
    Scanner userInput = new Scanner(System.in);
    // n represents number of lines (Arrays) we want to create
    System.out.println("Add number of lines:");
    int n = userInput.nextInt();
    // Here we will use an ArrayList for our lineWrapper and queryList
    ArrayList<int []> lineWrapper = new ArrayList<int []>();
    ArrayList<int []> queryList = new ArrayList<int []>();

    // Build n number of lines (Arrays) and add them to our ArrayList 
    // For each iteration, d represents # of integers we want in each line
    // We want to add an array in our wrapper arrayList for each line
    //***************************** ***********************************//

    for(int i = 0; i < n; i++){
      System.out.println("How many #'s will line " + (i+1) + " have?");
      // d = number of integers in line 
      int d = userInput.nextInt();
      // A new line represents a new array of user integer inputs
      int[] newLine = new int[d];
      System.out.println("Type in " + d + " space-seperated integers");
      // Calling .nextInt() multiple times will allow us to enter space-seperated integers on one line as a single input.
      // Save each integer into our newLine array
      for(int j = 0; j < d; j++){
        int userIn = userInput.nextInt();
        newLine[j] = userIn;
      }
      // Add our newLine array to our lineWrapper 
      lineWrapper.add(newLine);
    }

    // Build q number of queries (Arrays) and add them to our queryList 
    //***************************** ***********************************//

    System.out.println("Type in the # of Queries you wish to make");
    int q = userInput.nextInt();
    for(int k = 0; k < q; k++){
      System.out.println("Type in two space-seperated integers for Query #" + (k+1) + ":");
      int x = userInput.nextInt();
      int y = userInput.nextInt();
      // Build an array from user inputs and add to queryList
      int[] newQuery = {x, y};
      queryList.add(newQuery);
    }

    // Iterate through our queryList and target our lineWrapper with each query 
    // Print out result of query OR "ERROR!"" if query is out of bounds
    //***************************** ***********************************//

    for(int[] query : queryList){
        try { 
          int target = lineWrapper.get(query[0]-1)[query[1]-1];
          System.out.println(target);
        } catch(ArrayIndexOutOfBoundsException exception) {
          System.out.println("ERROR!");
        }
    }
  }
}