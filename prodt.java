// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/?envType=daily-question&envId=2023-12-18

public class prodt {
    public int maxProductDifference(int[] arr) {
        // insertion sort
        int n=arr.length;
        for(int i=0;i<n-1;i++){
             for(int j=i+1;j>0;j--){
                 if(arr[j]<arr[j-1]){
                     swap(arr,j,j-1);
                 }else{
                     break;
                 }
              }
          }
          int product=(arr[n-1]*arr[n-2])-(arr[0]*arr[1]);
          return product;    
      }
      void swap(int[] arr,int i,int j){
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
      }
}
    
