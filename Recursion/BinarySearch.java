package Recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 6, 7, 54 };
        int target = 54;
        int index = bs(arr, target, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else
            System.out.println("Target not found!");
    }

    public static int bs(int[] arr, int target, int i, int j) {
        if (i > j) {
            return -1;
        }
        int mid = i + (j - i) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            mid = bs(arr, target, mid + 1, j);
            return mid;
        } else {
            mid = bs(arr, target, i, mid - 1);
            return mid;
        }
    }
}
