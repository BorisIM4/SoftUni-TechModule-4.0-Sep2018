package L7_Methods_Functions;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P1_Sign_of_Integer_Numbers {
// Tova e koqto e po-zadanie
    static void isItPositive(int n){
        if (n > 0){
            System.out.printf("The number %d is positive." ,n);
        }else if (n == 0){
            System.out.printf("The number %d is zero." ,n);
        }else {
            System.out.printf("The number %d is negative." ,n);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        isItPositive(number);
    }



// Tova e tretata zadacha koqto sam si izmislih. Napravih ForLoop
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    int startnuNumber = Integer.parseInt(scanner.nextLine());
//    int lastNumber = Integer.parseInt(scanner.nextLine());
//
//    forLoop(startnuNumber, lastNumber);
//}
//
//public static void forLoop(int firstIndex, int lastindex){
//    System.out.println(firstIndex);
//    firstIndex++;
//    if (firstIndex != lastindex){
//        forLoop(firstIndex,lastindex);
//    }
//    if (firstIndex == lastindex){
//        System.out.println(firstIndex);
//    }
//}


//    Tova e vtorata zadahch koqto sam si izmislih
//    static int[] transformeStringArraytointArray(String[] textArray){
//        int[] intArray = new int[textArray.length];
//
//        for (int i = 0; i < textArray.length; i++) {
//            intArray[i] = Integer.parseInt(textArray[i]);
//        }
//
//        return intArray;
//    }
//
//    static int[] multiplyIntArrayElementsBySomeNumber(int[] intArray, int number){
//        int[] intArrayMultiplyByNumber = new int[intArray.length];
//
//        for (int i = 0; i < intArray.length; i++) {
//            intArrayMultiplyByNumber[i] = intArray[i] * number;
//        }
//
//        return intArrayMultiplyByNumber;
//    }
//
//    static void printIntArraMultiplyByNumber(int[] printIntArrayMultiplyByNumber){
//        for (int i = 0; i < printIntArrayMultiplyByNumber.length; i++) {
//            System.out.print(printIntArrayMultiplyByNumber[i] + " ");
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter first Array");
//        String[] textArray = scanner.nextLine().split(" ");
//
//        System.out.println("Enter some number");
//        int number = Integer.parseInt(scanner.nextLine());
//        //This transform string array in integer array
//        int[] intArray = transformeStringArraytointArray(textArray);
//        //This line multiply integer array by number inputed by user
//        int[] intArrayMultiplyByNumber = multiplyIntArrayElementsBySomeNumber(intArray, number);
//        // This prints array in console
//        printIntArraMultiplyByNumber(intArrayMultiplyByNumber);
//
//        System.out.println();
//
//        System.out.println("Enter second Array");
//        String[] textArrayTwo = scanner.nextLine().split(" ");
//
//        System.out.println("Enter second number");
//        int numberTwo = Integer.parseInt(scanner.nextLine());
//
//        int[] intArrayTwo = transformeStringArraytointArray(textArrayTwo);
//        int[] intArrayMultiplyByNumberTwo = multiplyIntArrayElementsBySomeNumber(intArrayTwo, numberTwo);
//        printIntArraMultiplyByNumber(intArrayMultiplyByNumberTwo);
//    }


// Tova e pyrvata zadacha koqto sam si izmislih
//    static void printHelloWorld(int n) {
//        System.out.println("-----------");
//        for (int i = 0; i < n; i++) {
//            System.out.println(i + "--->" + "Hello World!");
//            System.out.println("-----------");
//        }
//    }
//
//
//
//
//    public static void main(String[] args) {
//        int numberOfRotation = 5;
//
//        printHelloWorld(numberOfRotation);
//
//        int a = 5;
//        System.out.println("A =" + a++);
//        int b = 5;
//        System.out.println("B = " + ++b);


}
