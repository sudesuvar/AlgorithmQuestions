public class permutation {

    public static void main(String[] args) {
        permutationNum(5, 3);
        
    }

    public static void permutationNum(int num1, int num2){
        int factorial1= 1;
        int factorial2=1 ;
        for(int i = 1; i<=num1; i++){
            factorial1 = factorial1 * i;
        }
               for(int i = 1; i<=num1-num2; i++){
            factorial2 = factorial2 * i;
        }
        int per = factorial1/factorial2;
        System.out.println(per);
    }
}