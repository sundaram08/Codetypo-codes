public class LS {
    public static void main(String[] args) {
        int[] arr ={1,3,2,5,78,12,9};
        for (int i : arr) {
            if(arr[i]==12){
                System.out.println(i);;
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
