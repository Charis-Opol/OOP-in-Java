static int binary_search(int array[], int key){
    int right = array.length - 1;
    int left = 0;
    while(left <= right){
        int mid = left + (right - left) / 2;
        if(array[mid] == key)
            return mid;
        else if(array[mid] < key)
            left = mid + 1;
        else
            right = mid - 1;
    }
public class Binary_search {
    public static void main(String[] args){
        int[] my_array = {10, 20, 30, 40, 50};
        int key = 30;
        int result = binary_search(my_array, key);
        if(result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}

