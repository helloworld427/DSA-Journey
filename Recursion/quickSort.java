import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,6,3,7,1,2};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }
        int low = s; 
        int high = e;
        int mid =  low + (high-low)/2;
        int pivot = arr[mid];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        sort(arr, s, high);
        sort(arr, low, e);
    }
    
}
