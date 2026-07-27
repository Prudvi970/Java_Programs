class Palindrome{
    public static void main(String[] args){
        int original = 121

        int res = 0;

        if( original < 0){
            return false;
        }

        while(original > 0){
            int digit = original % 10;
            res = res * 10 + digit;
            original = original / 10;
        }
        return original == res;
    }
}