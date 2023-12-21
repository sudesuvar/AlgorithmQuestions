public class polindrome {
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        int reverse = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x /= 10;
        }
        if(originalNumber == reverse){
        return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
    int x = -121; // Kontrol etmek istediğiniz sayı
    polindrome solution1 = new polindrome();
    boolean control = solution1.isPalindrome(x);
   if (control) {
            System.out.println(x + " bir palindrom sayıdır.");
        } else {
            System.out.println(x + " bir palindrom sayı değildir.");
        }


    }
}
