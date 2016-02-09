/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweng431.lab4.newtonraphson;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YHA5009
 */
public class NewtonsMethod {
    
    private static int a, b, c, d, e, f;
    
    /** Returns the root found using Newton's method
     * @param x
     * @return  
     */
    public static double findRoot(double startingGuess){
        double x = startingGuess;
        double prevX = x;
        x = getNextXroot(x);
        int breakCounter = 0;
        while (Math.abs(prevX - x) > 0.0001) {
            prevX = x;
            x = getNextXroot(x);
            if (breakCounter++ > 5000) throw new Error("No maxima found");
        }
        
        return x;
    }
    
    public static double findMaxima(double startingGuess) {
        double x = startingGuess;
        double prevX = x;
        x = getNextXmaxima(x);
        int breakCounter = 0;
        while (Math.abs(prevX - x) > 0.0001) {
            prevX = x;
            x = getNextXmaxima(x);
            if (breakCounter++ > 5000) throw new Error("No maxima found");
        }
        
        return x;
    }
    
    public static double getNextXroot(double x) {
        // f(x) and f'(x) hard coded formulas
        double f = f(x);
        double _f = _f(x);
        
        // x = x - f(x)/f'(x)
        return ( x - f / _f );
    }
    
    public static double getNextXmaxima(double x) {
        double _f = _f(x);
        double __f = __f(x);
        return ( x - _f / __f );
    }
    
    public static double f(double x) {
        double out = a*Math.pow(x, 9) + b*Math.pow(x, 7) 
                + c*Math.pow(x, 5) + d*Math.pow(x, 3) + e*x + f;
        return out;
    }
    
    public static double _f(double x) {
        double out = 9*a*Math.pow(x, 8)+ 7*b*Math.pow(x, 6) 
                + 5*c*Math.pow(x, 4) + 3*d*Math.pow(x, 2) + e;
        return out;
    }
    
    public static double __f(double x) {
        double out = 72*a*Math.pow(x, 7)+ 42*b*Math.pow(x, 5) 
                + 20*c*Math.pow(x, 3) + 6*d*x;
        return out;
    }
    
    public static void setCoefs(int a,int b,int c,int d,int e,int f) {
        NewtonsMethod.a = a;
        NewtonsMethod.b = b;
        NewtonsMethod.c = c;
        NewtonsMethod.d = d;
        NewtonsMethod.e = e;
        NewtonsMethod.f = f;
    }
}

