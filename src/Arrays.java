public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        int b = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                a[b] = i;
                b++;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[4]);
        }
    }

}
