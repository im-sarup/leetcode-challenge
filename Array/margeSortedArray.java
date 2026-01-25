public class margeSortedArray {

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };
        int m = nums1.length;
        int n = nums2.length;

        // Create a new array to hold the merged elements
        int[] mergedArray = new int[m + n];

        // Copy elements from the first array
        for (int i = 0; i < m; i++) {
            mergedArray[i] = nums1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < n; i++) {
            mergedArray[m + i] = nums2[i];
        }

        // Print the merged array
        System.out.println("Marge Array");
        // for (int i = 0; i < m + n; i++) {
        // System.out.print(mergedArray[i] + " ");
        // }
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }

        // Bubble sort algorithm
        // int y = mergedArray.length;
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - 1 - i; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }

        // Print the merged array
        System.out.println("Marge Sorted Array");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }
}
