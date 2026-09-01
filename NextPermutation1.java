public class NextPermutation1{
    public static void main(String[] args){
        int arr[]={2,4,1,7,5,0};
        int pivot=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        System.out.println("pivot:"+pivot);
    

     for(int i=arr.length-1;i>pivot;i--){
    if(arr[i]>arr[pivot]){
        int temp=arr[i];
        arr[i]=arr[pivot];
        arr[pivot]=temp;
        break;
    }
}
 for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
 }
}
}
