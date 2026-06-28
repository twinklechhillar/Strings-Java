class Main {
    public static void main(String[] args) {
        String s = "mississippi";
        char target ='s';
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch== target){
                count++;
            }
        }

        System.out.println("target=" +count);
    }
}
