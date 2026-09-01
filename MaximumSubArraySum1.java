public class MaximumSubArraySum1 {
    public static void main(String[] args) {
        int arr[]={1,2,-3,5,6,-4,7};
        int result=arr[0];
        int maxEndingHere=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEndingHere=Math.max(arr[i],maxEndingHere+arr[i]);
            result=Math.max(result,maxEndingHere);
        }
        System.out.println("Maximum Subarray Sum: "+result);
        
    }
    
}