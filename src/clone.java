public class clone {

    public static void main(String[] args ) {
        int[] a = {3,7,9,11,13};

        int[] b =  new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
