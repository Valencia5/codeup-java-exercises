public class practice {
    //add sum method
    public static void main(String[] args){


    }

    public static int sumAll(){
        //create a new array of Ints
        int[] nums= {1,2,3,4,5,};
        //create holdign vairibale
        int sum= 0;
        //iterate through the array
        //enhanced for loop
        for (int number: nums){
            System.out.println((number));
            sum = sum + number;
        }
        return sum;
    }
}
