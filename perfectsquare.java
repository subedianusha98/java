public class perfectsquare {
    public static void main(String[] args) 
    {
     System.out.println(perfectsquare(16));   
    }
    public static  int perfectsquare(int n)
    {
        
       
        for(int i=1;i*i<=n;i++)
        {
            if(i*i==n)
            return 1;
        }
        return 0;
    }
    

}
