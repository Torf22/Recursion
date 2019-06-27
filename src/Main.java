public class Main {
    public static void main(String[] args) {
        int[] arr = {120, 1, 25, 56, 84, 5, 2, 2, 5, 15, 18, 0};
        int i = 0;
        int number = 0;
        recursion(i, arr);
        increment(number);
    }

    private static void increment(int number) {
        if (number <= 100){
            System.out.println(number);
            number++;
            increment(number);
        }
    }

    static void recursion(int i, int[] arr) {
        if (i < arr.length) {
            System.out.println(arr[i]);
            i++;
            recursion(i,arr);
        }
    }
}

//        1. створити масив, перебрати його не використовуючи цикли
//        2. сторити змінну проінкрементувати її до значення 100 не використовуючи цикли