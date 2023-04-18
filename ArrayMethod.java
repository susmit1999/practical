public class ArrayMethod {
static int[] get() { // method which return an array 
return new int[] {10,20,30}; // instantiation & initialization
}
public static void main(String args[]) { 
int arr[]= get(); // calling the SAME WHICH RETURN AN AARAY 
for (int i=0;i<arr.length; i++) // PRINT THE VALUE OF AN ARRAY 
System.out.println(arr[i]);
}
}