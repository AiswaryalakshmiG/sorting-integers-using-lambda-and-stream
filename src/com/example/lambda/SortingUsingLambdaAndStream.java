package com.example.lambda;
import java.util.*;
import java.util.stream.*;

public class SortingUsingLambdaAndStream {
public static void main(String []args) {
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the size of the array:");
     int size= scanner.nextInt();
     List<Integer> numbers= new ArrayList<>();
     for (int i = 0; i < size; i++) {
         System.out.print("Enter value " + (i + 1) + ": ");
         int value = scanner.nextInt();
         numbers.add(value);
     }

     List<Integer> sortedList = new ArrayList<>(numbers);
     sortedList.sort((a,b)->a-b);
     System.out.println("Sorted List" + sortedList);
     List<Integer> evenNumber= numbers.stream()
    		 .filter(num -> num %2 ==0)
    		 .collect(Collectors.toList());
     System.out.println("Even number:" + evenNumber );
     scanner.close();
}
}
