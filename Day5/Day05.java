
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class Day05{
    //Brute force approach for solving MAXSUBBARAY SUM:
    public static int findmaxsubarray(int nums[]){
    int MAXSUM=0;
    for(int i=0;i<nums.length;i++){
       
        for(int j=i;j<nums.length;j++){
            int sum=0;
       

         
        for ( int k=i;k<=j;k++){
            sum+=nums[k];
       
            MAXSUM=Math.max(sum,MAXSUM);
        }
        }
    }
    return MAXSUM;
}
//BY using two loops
public static int findmaxsubarray02(int nums[]){
    int MAXSUM=0;
    for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i;j<nums.length;j++){
        
           sum+=nums[j];
       
            MAXSUM=Math.max(sum,MAXSUM);
        }
        }
    
    return MAXSUM;

}
public static int kadaneAlgorithm( int nums[]){
    
    int maxsum=1;
    for(int i=0;i<nums.length;i++){
      
        int sum=1;
        sum+=nums[i];
        if(sum>maxsum){
            maxsum=sum;
        }
        if(sum<0){
            sum = 0;
        }
        }
    
    return maxsum;

}
//nger
    static void display (int nums[]){
        for(int i:nums){
        System.out.print(i+ " ");
    
        }
    }
        static int[] createNGER(int[] nums){
            int [] NGER= new int[nums.length];
            int maxElement= -1;
            for(int i=nums.length-1; i>=0;i--){
                NGER[i]= maxElement;
                if(nums[i]>maxElement)
                    maxElement=nums[i];
            }
            return NGER;
    
    }
//ngel
static void display02(int nums[]){
    for(int i:nums){
    System.out.println(i+ " ");
    System.out.println();
    }
}
static int[] createNGEl(int[] nums){
    int[] NGEl= new int[nums.length];
    int maxElement= -1;
    for(int i=0; i<=nums.length;i++){
        NGEl[i]= maxElement;
        if(nums[i]>maxElement)
            maxElement=nums[i];
    }
    return NGEl;

}

    public static void main(String args[]){
        int nums[]={6,2,4,8,7,9,1,4};
       // System.out.println(findmaxsubarray(nums));
       // System.out.println(findmaxsubaarray02(nums));
        //System.out.println(kadaneAlgorithm( nums));
        int[] NGER= createNGER(nums);
        display(NGER);
        int[]NGEl=createNGEl(nums);
        display02(NGEl);
    }
}


