public class floor {
    public static void main(String[] args) {
        int[] nums = {3,4,5,7,8,9};
        int n = nums.length;
        int target=78;
        if(target<nums[0]){
            System.out.println(-1);
        }
        else{
        System.out.println("Floor of target is: " + bsearch(nums,target,0,n-1));
        }
    }
    static int bsearch(int[] nums,int target, int s, int e){
            if(s>e) return nums[e];
            int mid = s + (e-s)/2;
            if(nums[mid]==target) return nums[mid];
            if(nums[mid] > target){
                return bsearch(nums,target,0,mid-1);
            }
            else{
                return bsearch(nums,target,mid+1,e);
            }
    }
}
