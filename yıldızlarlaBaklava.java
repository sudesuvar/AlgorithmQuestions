public class yıldızlarlaBaklava {

    public void baklava(int x){
        for (int i = 0; i <x ; i++) {
            for (int j = i; j <x - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = x - 2; i >= 0; i--) {
            for (int j = i; j < x - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        yıldızlarlaBaklava baklava = new yıldızlarlaBaklava();
        baklava.baklava(10);
    }
}
