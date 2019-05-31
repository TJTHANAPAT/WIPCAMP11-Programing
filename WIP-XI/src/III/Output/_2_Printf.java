/*
 * WIP XI Computer Programing 
 */

package III.Output;

/**
 *
 * @author sittiwatlcp
 */
public class _2_Printf {
    public static void main(String[] args) {
        String firstName = "Prayut";
        String lastName = "Chan-o-cha";
        String nickName = "Tu";
        String career = 'Prime Minister'
        double ownWallet = 200.746352;
        double friendWallet = 500.947855;
        
        System.out.printf("สวัสดี เราชื่อ %s %s (%s) เรามีเงิน %f บาท \nและเพิ่อนเรามีเงิน %.3f บาท \n", firstName, lastName, nickName, ownWallet, friendWallet);
    }
}
