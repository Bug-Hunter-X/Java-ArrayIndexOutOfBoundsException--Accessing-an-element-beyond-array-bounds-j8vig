public class BugSolution {

    public static void main(String[] args) {
        int[] arr = new int[10];
        if (arr.length > 0) {
            System.out.println(arr[arr.length -1]); //Access the last valid element
        } else {
            System.out.println("Array is empty");
        }
    }
}