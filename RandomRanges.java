//Arjun Vasudevan?
public class RandomRanges
{
    public static void main(String [] args)
    {
        System.out.println("Random Ranges");
        System.out.println("================");
        int test = 0;
        //while(test!=25)
        //{
         //   test = randomInt(0,25);
            
        //}
        System.out.println("1. Range: 0 to 25 = " + randomInt(0,25));
        System.out.println("2. Range: 50 to 100 = " + randomInt(50,100));
        System.out.println("3. Range: -100 to 100 = " + randomInt(-100,100));
        System.out.print("4. Range: -100 to 100 (real number rounded to 3 decimal places) = " + ((int)(Math.random()*1000)/1)/1000.0);
        //System.out.printf("%.3f", Math.random()); DOESNT WORK BECAUSE WE NEED TO ROUND, NOT TRUNCATE :/
        System.out.println("\n5. Range: A to Z = " + (char)randomInt(65,91));
        System.out.println("6. Range: 1000 to 10000 (rounded to nearest thousand) = " + randomInt(1000,10000)/1000*1000);
       
    }
    
    
    
    static int randomInt(int lower, int upper)
    {
        int range = upper-lower+1;
        
        return (int)(Math.random() * range) + lower;
    }
}

