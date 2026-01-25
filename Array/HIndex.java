public class HIndex {
    public int findIndex(int citations[]) {
        int n = citations.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + citations[i];
        }
        return sum / n;
    }

    public static void main(String[] args) {
        int citations[] = { 3, 0, 6, 1, 5 };

        HIndex solution = new HIndex();
        int h = solution.findIndex(citations);
        System.out.println("h - index is: " + h);

    }

}
