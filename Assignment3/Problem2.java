
public class Problem2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        try {
            int n = 10 / 2;
            try {
                arr[100] = 100;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
