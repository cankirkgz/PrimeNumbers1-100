// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i, k;

        System.out.println("Asal Sayılar (1-100):");
        i = 2;
        while(i < 100){
            k = 2;
            while (k < i){
                if (i % k == 0)
                    break;
                else
                    k++;
            }
            if (k == i)
                System.out.print(i + " ");
            i++;
        }
    }
}