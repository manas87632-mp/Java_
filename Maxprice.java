public class Maxprice{
    public static void main(String args[]){
        int arr[]={1,2,-3,5,6,-4,-5};
        int result=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                result=Math.max(result,sum);
            }
        }
        System.out.println("Maximum subarray is:"+result);
    }
}