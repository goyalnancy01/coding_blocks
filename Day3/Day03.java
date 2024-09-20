// package Day03;
import java. util.Scanner;
public class Day03 {
    static void display(int[]arr){// DISPLAY FUNCTION
        for (int i=0;i<arr.length;i++){   
            System.out.print(arr[i]+" ");
        }
       /*  System.out.println();
            for (int i:arr){ //FOR EACH USE
                System.out.print(i+" ");
            }
        }
    static int sum(int arr[]){ SUM FUNCTION
        int temp=0;
        for (int i=0;i<arr.length;i++){
            temp+=arr[i];
        }
        return temp;
    }

    static void reverse(int[]arr){// REVERSE FUNCTION
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
    static void temp_reverse(int[]arr){
        int []temp=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            temp[arr.length-1-i]=arr[i];
        }
        // display(temp);//display function is used to display the temp
        
        //DEEP COPY
        for (int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }

        // arr=temp;// SHALLOW COPY 
    }
    static void swap_elements(int arr[],int i,int j)// SWAP THE ARRAY
    {
        int temp =arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
        // display(arr);
    }
       
    //SWAP FUNCTION IN SWAP
    static void swapf_in_reversef(int []arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap_elements(arr, i++, j--);
            // i++;
            // j--;   
            }
            // System.out.println("a");
        }
    
    static void display2(int[] arr , int i, int j){
        for(int x=i;x<arr.length && x<=j; x++)
            System.out.println(arr[x]+"");
            System.out.println();
}
   static int sum2(int arr[],int i , int j){// SUM FUNCTION
    int temp=0;
    for (int x=i;x<=j;x++){
        temp+=arr[i];
        
    }
   
    return temp;
}
 static void reverse2(int[]arr, int i, int j){// REVERSE FUNCTION
     for (int x=j-1;x>=i;x--){
         System.out.print(arr[x]+" ");
    }
}
static void temp_reverse2(int[]arr,int i, int j){
    int []temp=new int[arr.length];
    for (int x=0;x<j;x++){
        temp[arr.length-1-i]=arr[i];
    }
    // display(temp);//display function is used to display the temp
    
    //DEEP COPY
    for (int x=0;x<j;x++){
        arr[i]=temp[i];
    }
}
*/
        

    public static void main(String[] args) {
       /*   int arr[]={1,2,3,4,5};
        display(arr);
        System.out.println(sum(arr));
        reverse(arr);
        System.out.println();
        temp_reverse(arr);
        display(arr);
        int i=4;
        int j=1;
        swap_elements(arr,i,j);
        swapf_in_reversef(arr);*/
        /*int[] nums={8,2,3,5,6,7};
        display2(nums,2,6 );
        System.out.println(sum2(nums,1,4));
        reverse2(nums, 2, 6);
        System.out.println(temp_reverse2(nums,2,4);*/
        /*public class BubbleSort {
            public static void bubbleSort( int[] arr){
                for(int turn= 1;turn<arr.length;turn++){
                    for( int i=0; i<arr.length-turn;i++){
                        if(arr[i]>arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                        }
                    }
                }
            }
            static void display(int[] arr){
                for(int i:arr) System.out.print(i+" ");
                System.out.println();
            }
            public static void main(String[] args) {
                int[] arr= {2,4,5,7,3,1,9,6};
                bubbleSort(arr);
                display(arr);*/
                 display(arr);
            }
        }
    
    


