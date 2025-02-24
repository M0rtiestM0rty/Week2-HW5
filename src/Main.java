import java.util.Arrays;

public class Main
{
    public static void quickSort(char[] arr, int low, int high)
    {
        if (low < high)
        {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }// if statement
    }//end quickSort Method


    public static int partition(char[] arr, int low, int high)
    {
        char pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                swap(arr, i, j);
            }// end if
        }// end for loop

        swap(arr, i + 1, high);
        return i + 1;
    }// end partition


    public static void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }// end swap


    public static void main(String[] args)
    {
        char[] letters = {'Q', 'U', 'I', 'C', 'K', 'S', 'O', 'R', 'T'};

        System.out.println("Before Sorting: " + Arrays.toString(letters));

        quickSort(letters, 0, letters.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(letters));
    }// end main
}// end main class
