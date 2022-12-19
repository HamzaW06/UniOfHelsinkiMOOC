import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);


    }
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int x: array){
            if (x<smallest){
                smallest = x;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = smallest(array);
        int correctIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == smallest){
                correctIndex = i;
            }
        }
        return correctIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++){
            if (table[i] < smallest){
                smallest = table[i];
            }
        }

        int correctIndex = 0;
        for (int i = startIndex; i < table.length; i++){
            if (table[i] == smallest){
                correctIndex = i;
            }
        }
        return correctIndex;
    }
    public static void swap(int[] array, int index1, int index2){
        int num1 = array[index1];
        int num2 = array[index2];
        array[index2] = num1;
        array[index1] = num2;

    }

    public static void sort(int[]array){
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            int indexOf = indexOfSmallestFrom(array,i);
            swap(array,i,indexOf);

        }


    }

}
