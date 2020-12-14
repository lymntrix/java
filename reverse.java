import java.util.*;


public class reverse
{
   
}
   
/*
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println("original array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("reverse :");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");   
             }
System.out.println();
*/ 
/* 
    

     Scanner sc =new Scanner(System.in);
     System.out.println("enter the size of an array");
     int n=sc.nextInt();
     //declare an array
     System.out.println("enter the array value");
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
         
     }
     int temp;
     int start=0;
     int end=n-1;
     while(start<end){
         temp=arr[start];
        arr[start]=arr[end];
         arr[end]=temp;
        start++;
        end--;
    }
    System.out.println("reverse");
    for(int j=0;j<n;j++){
        System.out.println(arr[j]);
    }

int temp;
int start=0;
int end=n-1;
while(start<end){
    temp=arr[start];
   arr[start]=arr[end];
    arr[end]=temp;
   start++;
   end--;
}
System.out.println("reverse");
for(int j=0;j<n;j++){
   System.out.println(arr[j]);
}
*/
/*
 public static void reverse(int arr[],int start,int end){
        //termination recursion
        if(start>=end)
        return;
        //logic to reverse an array
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        //recursion call
        reverse(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        System.out.println("enter the array value");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(arr, 0, n-1);
        System.out.println("reverse");
        for(int j=0;j<n;j++)
        {
            System.out.println(arr[j]);
        }
*/
/*
 public static void reverse(int arr[],int n)
    {
        int b[]=new int[n];
        int j=n;
        for(int i=0;i<n;i++){
            b[j-1]=arr[i];
            j=j-1;
        }
        System.out.println("reverse");
        for(int k=0;k<n;k++)
        {
        System.out.println(b[k]);
    }
}
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        reverse(arr, arr.length);

    }
}

*/
/*
 public static void reverse(Integer a[]){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4};
        reverse(arr);
    }
*/