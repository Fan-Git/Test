package webadv.s99201105.p02;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        else {
            String account = "17202110";
            String passwd = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
            
            if (passwd.equals(sha256hex(args[1])) && account.equals(args[0]))
                System.out.println("pass");
            else
                System.out.println("fail");
        }
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}