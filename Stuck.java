public class Stuck{
    public static void main(String []args){
        int[] prices ={5,3,1,6,9,7,8};
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
        min=Math.min(profit,prices[i]);
        profit=Math.max(profit,prices[i]-min);
        }
        System.out.println("profit:"+profit);
    }
}