public class romanToInteger {
    // roma sayı sisteminden girilen sayıyı 10'luk sisteme döndüren fonksiyon.
    /* Roma sayı sistemi -->
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
     */

    public int RomanAndInteger(String romaNum){
        int ans = 0, num = 0;
        for (int i = romaNum.length()-1; i >= 0; i--) {
            switch(romaNum.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;        
    }
    public static void main(String[] args) {
        int num =0;
        romanToInteger roman = new romanToInteger();
        num = roman.RomanAndInteger("MCCLV");
        System.out.println(num);
    }
}




