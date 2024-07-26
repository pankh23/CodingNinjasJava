public class BinarySearch {
    
        public static int search(int []nums, int target) {
            // Write your code here.
            int h=nums.length-1;
            int l=0;
            return binary(nums, target, h, l);
        }
        public static int binary(int nums[],int target,int h,int l){
            int mid=l+(h-l)/2;
            if(l<=h){
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target){
                    return binary(nums, target, mid-1, l);
                }
                else{
                    return binary(nums, target, h, mid+1);
                }
            }
            return -1;
        }
    }

