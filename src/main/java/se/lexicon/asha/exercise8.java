package se.lexicon.asha;

import java.util.Arrays;

public class exercise8 {

    public static int[] remove_repeated_numbers(int[] array)
    {
        int number = 1;

        for (int i = 1; i < array.length; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (array[i] == array[j])
                    break;
            if (j == i)
                array[number++] = array[i];
        }

        int[] newArray = new int[number];
        for (int i = 0; i < number; i++)
            newArray[i] = array[i];

        return newArray;
    }

    public static void main(String[] args)
    {   int[] array;
        array = new int[] { 20, 20, 40, 20, 30, 40, 50, 60, 50 };
        array = remove_repeated_numbers(array);
        {
            System.out.println("Array: " + Arrays.toString(array));
            System.out.print("Array without duplicate values: ");
        }

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
