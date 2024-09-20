public class leet {
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
    return ans;
}
    public static boolean check(int[]position,int m,int mid){
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
}
}