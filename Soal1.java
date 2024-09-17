public class Soal1 {
    //Diberikan sebuah array bilangan integer, carilah jumlah dari elemen-elemennya. Sebagai contoh, jika array ar = [1, 2, 3] maka 1 + 2 + 3 = 6

    public static void main(String[] args) {
    int[] ar = {1, 2, 3};

    int jumlah = 0;
    for ( int i = 0; i < ar.length; i++) {
        jumlah += ar[i];
    }
    System.out.println("Jumlah elemen array: " + jumlah);
    }
}
