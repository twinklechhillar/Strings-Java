class Main {
    public static void main(String[] args) {
        String s ="world";
        boolean palindrome = true;
        int i =0;
        int j = s.length()-1;
        
        while(i<j){
            if( s.charAt(i) != s.charAt(j)){
               palindrome  = false; 
            }
            i++;
            j--;
            
        }
        if(palindrome){
         System.out.println("palindrome");    
        } else{
             System.out.println("not palindrome");
        }
        
       
    }
}
