import java.util.Arrays;

public class SommaArrayRicorsiva {


    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{1,5,3,8}));
        //stackOverflow();
        System.out.println(fibonacci(5));
    }


    public static int fibonacci(int n)
    {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n -2);
    }



    public static int sumArray(int[] array)
    {
        if(array.length == 1)
            return array[0];
        if(array.length == 2)
            return  array[0] + array[1];
        return array[0] + sumArray(Arrays.copyOfRange(array, 1, array.length));
    }

    public static void stackOverflow()
    {
        stackOverflow();
    }
}
