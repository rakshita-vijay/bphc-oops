public class Lab10AExceptions2 {
    public static void main(String [] args){
        int i=4;
        int j=0;
        int[] nums = new int[5];
        String str=null;
        try {
            j=i/j;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            System.out.println(str.length());
            System.out.println(j);
        }
        catch(ArithmeticException e){
            System.out.println("Something is wrong - " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array is accessed outside the limits - ");
        }
        //parent class msut be at the end
        catch(Exception e){
            System.out.println("Someting is wrong");
         }
    }
}
