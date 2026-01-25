public class removeElement {

    static int removeVal(int arr[], int val) {
        int newLength = 0;
        // Traverse
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                // move non value elements to the front of the array
                arr[newLength] = arr[i];
                newLength++;
            }
        }
        return newLength;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        int newLength = removeVal(arr, val);
        System.out.println(newLength);
    }
}
