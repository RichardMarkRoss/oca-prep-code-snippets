package oca;
interface facesYouFace{
    public int x=1;
    int y = 2;
    static int  a = 3;  		// Doesn’t show final or public
    final int b = 4;	 		// Doesn’t show static or public
    public static int c = 5; 	//  Doesn’t show final
    public final int d = 6;		// Doesn’t show static
    static final int e = 7;		// Doesn’t show public
    public static final int f = 8; 	// What you get implicity

    default int m1 (){return 1;}; 	// legal
    public default void m2 (){;} 	// legal
    default void m3 (){;} 	// illegal: default methods can not be
                                // marked static
    default void m4 (){}
}
class givingAccess{
    int[] scores[] = new int[5][];
}
public class JavaBasic implements facesYouFace {
    public static void main(String[] args) {
        System.out.println(x);// all the variables form an interface...public static final
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
