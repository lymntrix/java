
class recursion{
    static  int stepcount=0;

    static int sum(int a,int b)
    {
        stepcount++;
        if(b==0){
            return 1;
        }
        
    return a * sum (a,b-1); 
    }
    static int fastpow(int a,int b)
    {
        System.out.println(b);
        stepcount++;
        if(b==0){
            return 1;

        }
        if(b%2==0){
            return fastpow(a*a, b/2);
        }
        return a* fastpow(a, b-1);
    }
    static int path (int n,int m){
        if(n==1 || m==1)
        {
            return 1;
        }
        return path(n, m-1)+path(n-1, m);
        
    }
    
    public static void main(String[] args) {
        /*System.out.println("first "+sum(2,3));
        System.out.println( "stepcount"+stepcount);
        stepcount=0;
        System.out.println("secound "+fastpow(2, 10));
        System.out.println( "stepcount"+stepcount);
        */
        System.out.println(path(3, 3));

    }
}