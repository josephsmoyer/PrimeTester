package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        if(n==0|| n==1 || n==4  )
        {return false;}
        else if(n==2 )
        {return true;}
        else {
            for(int i = 2; 2*i<n; i++)
            {
                if(n%i==0)
                    return false;
            }
        }
        return true;

        // for now, return a random result
        //return Math.random() > 0.5;
    }
}
