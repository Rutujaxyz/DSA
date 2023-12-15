public class linearserc
{
public static void main(String[] args) {
    int[] num={12,44,6,79,90};
    int target=44;
    int ans=linearSearch(num, target);
    System.out.println(ans);
    
}
static int linearSearch(int[] arr, int  target){
    if(arr.length==0){
        return -1;
    }
    for(int i=0;i<arr.length;i++)
    {
        int element=arr[i];
        if(element==target){
            return i;
        }
    }
    return -1;
}
}