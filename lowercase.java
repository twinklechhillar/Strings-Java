class Main {
    public static void main(String[] args) {
        String s = "heLLo";
        int count =0;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if( ch>='a' && ch<='z'){
                count++;
            }
        }
        
        System.out.println("lower case=" +count);
    }
}
