
public class Day01 {
    public static void main(String[] args) {
    
    for (int i=1;i<=5;i++){
               for(int k=0;k<=5-i;k++){
     System.out.print(" ");
      }
       
    for(int j=1;j<=i;j++){
     System.out.print("*");
    }
    System.out.println();
   
}
    

   for ( int i = 1;i<=5;i++){
         for( int j =1;j<=i;j++){
            System.out.print("*");
        }
       System.out.println();
   }


   for( int i =7;i>=1;i--){
         for(int j =1;j<=i;j++){
         System.out.print("*");
     }
         System.out.println();
}

    
    for(int i=1;i<=5;i++){
        for(int j=1; j<=5;j++){
            if(i==1||i==5||j==1||j==5){
                System.out.print("*");

           
            }
            else {
                System.out.print(" ");
            }
            
        }
            System.out.println();
    }



    for(int i=1;i<=5;i++){
        for(int j=1; j<=5; j++){
            if(i==j||i+j==5+1){
                System.out.print("*");

            }
            else {
                System.out.print(" ");

            }
        }
        System.out.println();
    }

    for(int i=1; i<=5;i++){
        for(int k=0;k<=5-i;k++){  
            System.out.print(" ");
    }
    
        for(int j=1;j<=i;j++){  
            System.out.print("*");
}
        for( int j =2
        ;j<=i;j++){
            System.out.print("*");

        }
        System.out.println();
        

    }

    int arr[]=new int[11];

     for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] = 7*i);
     }
     for (int i=0;i<arr.length;i++){
        if(arr[i]==56){
            System.out.println(i);
        }
        else {
            System.out.println ("not exists");
        }
     }
    }

       




    


