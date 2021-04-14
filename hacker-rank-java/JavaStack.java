import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JavaStack {
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> closedLegend = new HashMap<Character, Character>();
        closedLegend.put(')', '(');
        closedLegend.put('}', '{');
        closedLegend.put(']', '[');
                
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(balanced(input, closedLegend));
        }
    }
    
    public static boolean balanced(String str, HashMap<Character, Character> legend){
        Stack<Character> holdPairs = new Stack<Character>();
        if(str.length() % 2 != 0) return false;
        for(int i = 0; i < str.length(); i++){   
            char cur = str.charAt(i);

            if(!legend.containsKey(cur)){
                holdPairs.push(cur);
            } else if (holdPairs.peek() == legend.get(cur)){
                holdPairs.pop();       
            } else {
                return false;
            }
        }
        return holdPairs.isEmpty(); 
    }
}
