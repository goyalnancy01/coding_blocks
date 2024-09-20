//Binary search ,time complexity=log(n);
//Linear search, time complexity =O(n);
//N^2 seach,time complexity= O(n^2);
import java.util.Arrays;
public  class Day04{
    public static boolean Binarysearch(int[]arr,int n) {
        int low =0,high=arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==n)return true;
            
            else if (arr[mid]<n){
                low=mid+1;
            }else
            high=mid-1;
        }
        return false;

    }
    public static void Display(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
         
        }
        System.out.println();
    }
    //Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

//You must write an algorithm with O(log n) runtime complexity.
    public int searchInsert(int[] nums, int target) {
        int low =0,high=nums.length-1;
        int probable=nums.length-1;
         while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==target)return mid;
            else if (nums[mid]<target){
                low=mid+1;
            }else{
                probable=mid;
                high=mid-1;
            }
           
        }
        return probable;

        
    }
    //lower bound
    static int lowerBound(int[]arr,int num){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==num){
                ans=mid;
                high=mid-1;
            }else if(arr[mid]>num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    //upperbound=last occurence+1;
    static int UpperBound(int[]arr,int num){
        int low=0,high=arr.length-1;
        int  ans =arr.length;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }
        
            else if(arr[mid]<num)
            low=mid +1;
            else{
              ans=mid;
              high=mid-1;
        }
    }
    return ans;
}



    public static void main(String[]args){
      /*   int array[]={2,3,1,5,9,4,7};
        Arrays.sort(arr);
        Display(arr);
        System.out.println( Binarysearch(arr,7));
        searchInsert(nums,5);*/
        int[] arr={1,1,1,3,3,3,3,4};
        System.out.println(lowerBound(arr,4));
        System.out.println(UpperBound(arr,3));
    }

}
