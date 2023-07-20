import java.util.Scanner;
public class Main {
    static int Algo_Sort(int[] array , int low , int high){
        int pivot = array[high];
        int spaceMaker = low - 1;
        for (int start = low; start < high; start++){
            if (array[start] < pivot){
                spaceMaker++;
                int temporarySpace = array[spaceMaker];
                array[spaceMaker] = array[start];
                array[start] = temporarySpace;
            }
        }
        spaceMaker++;
        int temporarySpace = array[spaceMaker];
        array[spaceMaker] = pivot;
        array[high] = temporarySpace;
        return spaceMaker;
    }
    static void Quick_Sort_Algo(int[] array , int low , int high){
        if (low < high){
            int pivotIndex = Algo_Sort(array, low, high);
            Quick_Sort_Algo(array, low, pivotIndex - 1);
            Quick_Sort_Algo(array,pivotIndex + 1 , high);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the final result :");
        Quick_Sort_Algo(array , 0 , array.length - 1);
        for (int start = 0; start < array.length; start++){
            System.out.print(" " + array[start]);
        }
    }
}