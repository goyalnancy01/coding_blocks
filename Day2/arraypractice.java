import java.util.*;
public class arraypractice{
    public static int linearsearch(int numbers[], int key){//linear search for integers
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            
            }
        }
                return -1;
            
            
        
    }
    public static int linearsearch2(String menu[], String key2){//linear search for string
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key2){
                return i;
            
            }
        }
                return -1;
    }

    public static int getlargest(int numbers[]){//for finding greatest number in array
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if( largest< numbers[i]){
             largest=numbers[i];
        }
    }
    return largest;

    }
    public static int getsmallest(int numbers[]){//for finding smallest number in array
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        
        }
        return smallest;
    }

    public static int Binarysearch(int numbers[], int key){//binary search
        int start=0, end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if( numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
               start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return -1;

    }
    public static void main(String args[]){//Main function
        int numbers[]={2,4,6,78,54,65,23,56,88};
        int key=56;
        System.out.println("Largest number in our array  is:" +(getlargest(numbers)));
        System.out.println("Smallest number in our array  is:" +(getsmallest(numbers)));
        String menu []={"Dosa","chowmin", "Samosa","Chole bhature","burger"};
        String  key2="Samosa";
        int  value =linearsearch2(menu,key2);
        System.out.println("key is at index:" +(Binarysearch(numbers,key)));
        if (value == -1){
            System.out.println("key is not found");
        }
        else{
            System.out.println("key is at index:" +value);
        }
      
        int index=linearsearch(numbers,key);
        if (index==-1){
        System.out.println("key is not found");
    }
    else{
        System.out.println("key is at index:" +index);
    }

  

    int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);
    System.out.println("Marks of 1st sub:");
    marks[0]=sc.nextInt();
    System.out.println("Marks of second sub:");
    marks[1]=sc.nextInt();
    System.out.println("Marks of third sub:");
    marks[2]=sc.nextInt();

    System.out.println("Physics:" +marks[0]);
    System.out.println("Chemistry:" +marks[1]);
    System.out.println("Maths:" +marks[2]);
}
    }






    
    
    
   