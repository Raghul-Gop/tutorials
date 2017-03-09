package programs;

public class test {

	public static void main(String [] args) 
    {
        int x= 0;
        int y= 0;
        for (int z = 0; z < 5; z++) 
        {
        	System.out.println(" X after pre increment is  : "+x+" ||| Y after pre increment : "+y);
            if (( ++x > 2 ) && (++y > 2)) 
            {
            	System.out.println("X is now : "+x+" Y is now : "+y);
                x++;
                System.out.println("X after post increment is : "+x);
            }
        }
        System.out.println(x + " " + y);
    }
}