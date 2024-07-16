//.  Write a Java program to find the length of the longest substring without repeating characters in a given string. The program should have the following features:
//.  1. The program should take a string as input from the user.
//.  2. The program should find the length of the longest substring without repeating characters in the given string.
//.  3. The program should print the length of the longest substring without repeating characters as output.
//.  Example
//.  Input abcabcbb
//.  Output 3


import java.util.*; 
class R_Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Input");
       String s = sc.next();
       int n = s.length();
       int res = 0;
       char[] chars = s.toCharArray(); // Splitting string into individual characters

       Set<Character> set = new HashSet<>();

    for(char c:chars)
    {  
         if(set.contains(chars))
         {
            break;
         }
         else
         {
        set.add(c);
         }
       
    }
        System.out.println("Output");
        System.out.println(set.size());
    }
}