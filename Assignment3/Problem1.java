class Problem1 {
    public static void main(String[] args) {
        try {
            int n = 10 / 0;
            String s = null;
            s.length();
            int arr[] = { 0, 1, 2, 3, 4 };
            System.out.println(arr[10]);
            String s1 = "abc";
            int n1 = Integer.parseInt(s1);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("A Exception occured");
        } finally {
            System.out.println("Welcome to finally block");
        }
    }
}