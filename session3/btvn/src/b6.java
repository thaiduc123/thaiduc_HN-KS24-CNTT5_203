public class b6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            int value;
            if (a[i] < b[j]) {
                value = a[i++];
            } else if (a[i] > b[j]) {
                value = b[j++];
            } else {
                value = a[i];
                i++;
                j++;
            }
            if (k == 0 || temp[k - 1] != value) {
                temp[k++] = value;
            }
        }
        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }
        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }
        int[] arrayMerge = new int[k];
        for (int x = 0; x < k; x++) {
            arrayMerge[x] = temp[x];
        }
        return arrayMerge;
    }
    public static void main(String[] args) {
        int[] arr1 = {101, 103, 105, 107};
        int[] arr2 = {102, 103, 105, 108};
        System.out.print("Cũ: ");
        for (int i = 0; i< arr1.length-1; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.print("\nLô mới: ");
        for (int i = 0; i<arr2.length-1; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\nKho tổng: ");
        int[] result = mergeBooks(arr1, arr2);
        for (int i = 0; i< result.length-1; i++){
            System.out.print(result[i] + " ");
        }
    }
}
