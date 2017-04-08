/*score and comments:
9 + 2(extra credit)
Great job! Remember do not change the return type
*/
import java.util.ArrayList;
import java.util.Arrays;

public class A4Extra {
	/*1.Given an array containing n distinct numbers taken from 0, 1, 2 …, n, find the one that is missing from the array. 
	 * For example, given nums = {0, 1, 3}, return 2.
	 *public static missingNumber(int[] nums) {       
	}*/
	public static void missingNumber(int[] nums) {                       //do not change the return type
		ArrayList<Integer> missnumber = new ArrayList<Integer>();
		int j = nums[0];
		for (int i = 0; i <= nums.length-1; i++){
		if (j==nums[i]){
			j++;
			continue;
		}
		else{
		    missnumber.add(j);
		    i--;
		    j++;
		}
		}
		System.out.println("the missing number are:");
		System.out.println(missnumber);	
	}
/*Given an array nums, write a function to move all 0's to the end of it while maintaining 
 *the relative order of the non-zero elements. For example, given nums = {0, 1, 0, 3, 12}, 
 *after calling your function, nums should be {1, 3, 12, 0, 0}, 
 *You must do this in-place without making a copy of the array.
 *public static void moveZeroes(int[] nums) {}
 */
	
	public static void moveZeroes(int[] nums) {            //correct
	int j=0;
	for (int i=0; i<= nums.length-1;i++){
	if(nums[i] != 0){
		nums[j] = nums[i];
		j++;
	}
	}
	for (; j<= nums.length-1; j++){
		nums[j]=0;
	}
	System.out.println("After moving zero:");
	System.out.println(Arrays.toString(nums));  
	}
	
/*Given a non-empty array of integers, return the third maximum distinct number in this 
 * array. If it does not exist, return the maximum number. For example, given{3,2,1}, 
 * return 1; given{1,2}, return 2; given{2,2,3,1}, return 1.
 */
	public int thirdMax(int[] nums) {                            //correct
        long tmp[] = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        
        for(int num:nums){
            if(num< tmp[1] && num>tmp[0]){
                tmp[0]=num;
            } 
            else if (num < tmp[2] && num > tmp[1]){
                tmp[0] = tmp[1];
                tmp[1] = num;
            } 
            else if (num > tmp[2]){
                tmp[0] = tmp[1];
                tmp[1] = tmp[2];
                tmp[2] = num;
            }
        }
        if(tmp[0] == Long.MIN_VALUE){
            return (int)tmp[2];
        }
        return (int)tmp[0];


    }


	
	public static void main (String[] args){
	int[] a = {0,1,2,4,7,9};
	int[] b = {0,3,0,0,2,5};
	int[] c = {1,2};
	int[] d = {2,2,3,1};
	int[] e = {3,2,1};
	A4Extra.missingNumber(a);
	A4Extra.moveZeroes(a);
	A4Extra.moveZeroes(b);
	A4Extra test = new A4Extra();
	System.out.println(test.thirdMax(b));
	System.out.println(test.thirdMax(c));
	System.out.println(test.thirdMax(d));
	System.out.println(test.thirdMax(e));
	}

}
