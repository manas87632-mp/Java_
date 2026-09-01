public class NextPermutation2{
    public static void main(String[] args) {
        int arr[] = {2,4,1,7,5,0};
        int pivot=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if (pivot==-1) {
            int start=arr[0];
        int end =arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[end]=arr[start];
            arr[end]=temp;
            start++;
            end--;
            
        }

            
        }
        System.out.println("pivot:"+pivot);
        //find the greater number
        for(int i=arr.length-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
            
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        //reverse
        int start=pivot+1;
        int end =arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[end]=arr[start];
            arr[end]=temp;
            start++;
            end--;
            
        }
        for(int i=0;i<arr.length-2;i++){
            System.out.println(arr[i]);
        }
    }
    
}