import java.util.Arrays;

public class Task4Pitonova {
    public static void main(String[] args) {
        int[] numbers = {40, 45, 38, 39, 100};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
        }
        System.out.println(min);

        //Task 2
        System.out.println("Task 2");
        int[] numbers1 = new int[37];
        for (int i1 = 0; i1 < numbers1.length; i1++) {
            numbers1[i1] = i1 * 10;
        }
        for (int i1 = 0; i1 < numbers1.length; i1++) {
            double degree = Math.toRadians(numbers1[i1]);
            System.out.println(Math.sin(degree));
        }

        //Task 3
        System.out.println("Task 3");
        int[] numbers3 = {600, 20, 70, 40, 50};
        Arrays.sort(numbers3);
        for (int i3 = 0; i3 < numbers3.length; i3++) {
            System.out.println(numbers3[i3]);
        }

        //Task 4
        System.out.println("Task 4");
        String word = "madam";
        int fl = 0;
        char[] arrayChars = word.toCharArray();
        for (int j=0;j<=word.length()-1 ;j++) {
            if(word.charAt(j)!=word.charAt(word.length()-j-1)){
                fl = 1;
                break;}
        }
        if(fl==1)
            System.out.println("String is not a palindrome");
        else
            System.out.println("String is a palindrome");




        //  else if(arrayChars[i] == arrayChars[(word.length()-1) - i]) {
        //    System.out.println("yes");


        // Task 5
        System.out.println("Task 5");
        String str5 = "Hello";
        String reverse = new StringBuffer(str5).reverse().toString();
        System.out.println(reverse);

        //Task 6
        System.out.println("Task 6");
        int[] numbers6 = {20, 3, 6, 2};
        int y = 0;
        //for (int i = 0; i < numbers6.length; i++) {
        //if (numbers6[i] / 2


        //Task 7
        System.out.println("Task 7");
        int[] numbers7 = {1, 2, 3, 4, 5};
        int size = numbers7.length;
        for (int i7 = 0; i7 < size / 2; i7++) {
            int arr = numbers7[i7];
            numbers7[i7] = numbers7[size - 1 - i7];
            numbers7[size - 1 - i7] = arr;
        }
        System.out.println(Arrays.toString(numbers7));


    }
}














