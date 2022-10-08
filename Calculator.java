import java.util.Arrays;
import java.util.Scanner;
public class Calculator {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
String awnser="";
    do{
 
    int [] myArray = new int[5];
    
    System.out.print("Enter five numbers: ");
    for (int i = 0; i < myArray.length; i++){
        myArray[i] = in.nextInt();
    }
 
    System.out.print("Enter an operation (Squareroot, Power, DivBy5and6): ");
    String operation = in.next();
    
    switch (operation){
        case "Squareroot":  System.out.println("The squareroot for an array is "+ Arrays.toString(Squareroot(myArray)));break;
             case "Power":  System.out.println("The Power for an array is "+ Arrays.toString(Power(myArray)));break;
                  case "DivBy5and6":  DivBy5and6(myArray);break;
    }
    
    System.out.println("Want to rerun the program again? ");
    awnser=in.next();
            }while(awnser.equalsIgnoreCase("y"));
    
}

public static int[] Squareroot(int[] array){
    int[] squareroot = new int[array.length];
                
    for (int i = 0; i<squareroot.length; i++){
    squareroot[i] = (int) Math.sqrt(array[i]); 
}
    return squareroot;
}

public static int[] Power(int[] array){
    int[] Power = new int[array.length];
                
    for (int i = 0; i<Power.length; i++){
    Power[i] = (int) Math.pow(array[i],2); 
}
    return Power;
}

public static void DivBy5and6(int[] array){
                
    for (int i = 0; i<array.length; i++){
    if (array[i] % 5 != 0 && array[i] % 6 != 0)continue;
    System.out.print(array[i] + "  ");
}
    System.out.println("");
}
   
}
