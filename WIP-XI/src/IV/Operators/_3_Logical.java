/*
 * WIP XI Computer Programing 
 */

package IV.Operators;

/**
 *
 * @author sittiwatlcp
 */
public class _3_Logical {
    public static void main(String[] args) {
        int x = 5; int y = 10; int z = 3;
        
        System.out.println("|| : " + (x < 4 || y > 4));
        
        System.out.println("&& : " + (x > 4 && y > 4 &&  x+y > 11));
        
        System.out.println("Normal : " + (x >= 5));
        
        System.out.println("! : " + !(x >= 5));
    }
}
