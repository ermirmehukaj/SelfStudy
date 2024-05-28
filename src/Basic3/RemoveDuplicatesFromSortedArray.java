package Basic3;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int [] numbers ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(numbers));
    }



    public static int removeDuplicates(int [] nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];

            j++;
        }}
        return j;
    }
}
