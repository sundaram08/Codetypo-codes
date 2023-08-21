public class binary4 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,8,9};
        int n = nums.length-1;
        if(nums[0]<nums[n]) System.out.println("Index of target is: " + bsearchI(nums,9,0,n));
        if(nums[0]>nums[n]) System.out.println("Index of target is: " + bsearchD(nums,9,0,n));

    }
    static int bsearchI(int[] nums,int target, int s, int e){
            if(s>e) return -1;
            int mid = s + (e-s)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid] > target){
                return bsearchI(nums,9,0,mid-1);
            }
            else{
                return bsearchI(nums,9,mid+1,e);
            }
    }
    static int bsearchD(int[] nums,int target, int s, int e){
        if(s>e) return -1;
        int mid = s + (e-s)/2;
        if(nums[mid]==target) return mid;
        if(nums[mid] > target){
            return bsearchD(nums,target,mid+1,e);
        }
        else{
            return bsearchD(nums,target,s,mid-1);
        }
}
    
}

    