public class MargeTwostringAlter {
    public String alterTwoString(String fitstName, String lastName) {
        int m = fitstName.length();
        int n = lastName.length();
        StringBuilder twoString = new StringBuilder();
        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < m) {
                twoString.append(fitstName.charAt(i));
            }
            if (i < n) {
                twoString.append(lastName.charAt(i));
            }
        }
        return twoString.toString();
    }

    public static void main(String[] args) {
        String firstName = "Sarup";
        String lastName = "Hossain";

        MargeTwostringAlter solution = new MargeTwostringAlter();
        String ans = solution.alterTwoString(firstName, lastName);
        System.out.println(ans);
    }
}
