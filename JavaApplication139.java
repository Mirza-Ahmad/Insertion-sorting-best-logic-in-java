package javaapplication139;
import java.util.Scanner;
public class JavaApplication139 
{
    public static void main(String[] args) 
    {
      Scanner is =new Scanner(System.in);
      int size;
      System.out.println("Enter the size:");
      size=is.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter the elements of the array:");
      for(int i=0; i<arr.length; i++)
      {
        System.out.println("Enter the elements " + (i+1) + ":");
        arr[i]=is.nextInt();
      }
      /* BEST logic if insertion sort*/
      for(int i=1; i<arr.length; i++)
      {
          int temp=arr[i];
          int j=i-1;
          for(;j>=0 && temp<arr[j];)
          {
           arr[j+1]=arr[j];
           j--;
          }
          arr[j+1]=temp;
      }
      System.out.println("After sorting of the insertion sort is = " );
      for(int i=0; i<arr.length; i++)
      {
          System.out.print(arr[i] + " ");
      }
    }
}