public class Palindrome {
    
    public static void main(String[] args) {
        
        for (int n = 0; n < args.length; n++) {
            String s = args[n];  
            
            if (isPalindrome(s)) {
                System.out.println(s + " - это палиндром");
            } else {
                System.out.println(s + " - это не палиндром");
            }
        }
    }
    
  
    public static String reverseString(String s) {
        String reversed = "";  
        
        for (int n = s.length() - 1; n >= 0; n--) {
            reversed = reversed + s.charAt(n);  
        }
        
        return reversed;  
    }
    
    public static boolean isPalindrome(String s) {
       
        String reversed = reverseString(s);
        
        return s.equals(reversed);
    }
}
