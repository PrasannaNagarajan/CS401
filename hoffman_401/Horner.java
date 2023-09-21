class Horner{
    public static void main(String[] args) {
        System.out.println(horner(args[0]));
    }
    
    static int horner(String s) {
        int sum = 0;
        int sign = 1;

        if (s.startsWith("-")) {
            sign = -1; // Handle negative sign
            s = s.substring(1); 
        }
        

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                sum = (sum * 10) + digit;
            } 
            else {
                // Handle invalid characters
                System.out.println("Invalid character in the input: " + ch);
                return 0;
            }
        }
        return sign * sum;
    }
}