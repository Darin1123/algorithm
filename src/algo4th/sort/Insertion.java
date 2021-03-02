package algo4th.sort;

public class Insertion extends Sort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i=0; i<N; i++) {
            for (int j = i; j>0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        Comparable<Integer>[] a = new Comparable[] {3, 7, 4, 6, 5, 8, 6, 6, 9};
        show(a);
        sort(a);
        System.out.println("is sorted: "+ isSorted(a));
        show(a);
        int i=0;
        System.out.println(i++);
    }
}
