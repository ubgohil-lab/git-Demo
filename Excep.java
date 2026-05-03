public class Excep {
    public static void main(String args[]){
        int nums[] = { 1,2,3,4,5};

        try{
            for(int i = 0; i<nums.length+1; i++){
                System.out.println("nums:" + nums[i]);
            }
            
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+ e);
        }

        finally {
            System.out.println("Finally block");
        }


    }
}
