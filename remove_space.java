class Main {
    public static void main(String[] args) {
        String s = "i love java";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
               System.out.print(ch + " ");  
            }
        }
        
    }
}
