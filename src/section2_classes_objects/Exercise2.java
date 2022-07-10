package section2_classes_objects;
/*
Create an array and initialize it with the days of the week.
# 2.1.Use System.out.println() to print:
## 2.1.1.The number of items in the array
## 2.1.2.The 4th day in the array
*/


public class Exercise2 {


    public static void main(String[] args) {
        String[] daysOfWeek = new String[]{"Monday","Thursday","Wednesday","Thursday", "Friday","Saturday","Sunday"};
        System.out.println("The number of items in the array: " + daysOfWeek.length);
        System.out.println("The 4th day in the array: " + daysOfWeek[3]);
    }
}
