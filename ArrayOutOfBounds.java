public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; // Define an array with 5 elements

        // Loop through elements of the array
        for(int i=0; i<= arr.length; i++){
            try{
                System.out.println("Element at Index " + i +": "+ arr[i]);
            } catch(ArrayIndexOutOfBoundsException ae){ //Catch the exception if an attempt is made to access an element beyond the array's bounds
                System.out.println("Error: Array out of Bounds");
            }
        }
    }
}

