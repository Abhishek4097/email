import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
    public static void main(String[] args) {
        String str = "abhishek@yahoo.com";
        Pattern p = Pattern.compile("[a-zA-Z0-9._]+[@](gmail|yahoo|rediff)[.]com");
        Matcher m = p.matcher(str);
        int a = 0;
        while(m.find())
        {
            System.out.println(m.start()+ "-"+m.end()+ "-"+m.group());
            a++;
        }
        System.out.println(a);

    }

}
