import java.util.*;
public class Day07{
    public static int reachcollege(int time,int dist){
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
    }
    public static void main(String args[]){
        System.out.println(reachcollege(3, 100));
        System.out.println(check(34,3,100));
        // reachcollege();
        // check();
   }       
}
   