import java.util.*;
public class Day07{
  /*   public static int reachcollege(int time,int dist){
        int ans =0;
        int low=0;
        int high=200;
        while(low<=high){
        int mid=high-(high-low)/2;
        if (check(mid,time,dist)){
            ans=mid;
            high=mid-1;
        }
        else
            low=mid+1;
      }
      return ans;
    }

    public static boolean check(int mid_speed,int time,int dist){
        int t_dist=0;
        t_dist=mid_speed*time;
        return(t_dist>=dist);
    }*/
  
    
    public static int maximum_distance(int position[],int m){
        int low=1;
        int high=(int)Math.pow(10,9);
        int ans=-1;
        while(low<=high){
        int mid=high-(high-low)/2;
        if (check (position,m,mid)){
         ans=mid;
         low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    // public static boolean check(int[]arr, int m, int mid){
        boolean check(int[]position,int m,int mid){
            int count = 1; 
            int lastPosition = position[0];
            for (int i = 1; i < position.length; i++) {
                if (position[i] - lastPosition >= mid) {
                    count++; 
                    lastPosition = position[i]; 
                    if (count == m) {
                        return true; 
                    }
                }
            }
            return false;
        
    }

    public static void main(String args[]){
        int position[]={1,2,3,4,7};
        System.out.println(maximum_distance(position,3));

       // System.out.println(reachcollege(3, 100));
       // System.out.println(check(34,3,100));
        // reachcollege();
        // check();
   }      
}

  /* class Solution {//Monkey problem
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=(int)Math.pow(10,9);
        int ans=-1;
        while(low<=high){
        int mid=high-(high-low)/2;
        if (check(piles,mid,h)){
            ans=mid;
        
            high=mid-1;
        }
        else
            low=mid+1;
      }
      return ans;
    }
     boolean check(int piles[],int eatingspeed,int h){
       int totalHours = 0;
      
            for (int pile : piles) {
            totalHours += pile / eatingspeed; 
              int rem=pile % eatingspeed;
              if(rem!=0)totalHours++;
                
            }
            return( totalHours <= h);

     }
} */

   