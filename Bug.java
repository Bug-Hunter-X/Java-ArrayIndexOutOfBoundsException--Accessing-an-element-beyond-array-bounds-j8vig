public class UncommonBug {

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
    }
}