public class BubbleSort {
        public static int binarySearchClosest(int []nums, int left, int right, int target) {
            //Your code goes here
            while(left+1<right){
                int mid=(left+right)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target){
                    right=mid;
                }
                else{
                    left=mid;
                }
            }
            if(nums[right]-target<target-nums[left]){
                return right;
            }
            return left;
         
        }
    
    }

