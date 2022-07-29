package section8_more_oop.exercises;

import java.io.UnsupportedEncodingException;

public class test {
    public static void main(String[] args) throws UnsupportedEncodingException {

        final String Str_mit_25_Zeichen_NOK = "+%$/=asdSFC341Csva2q345df";

        System.out.println(Str_mit_25_Zeichen_NOK.length());

        final byte[] utf8Bytes = Str_mit_25_Zeichen_NOK.getBytes("UTF-8");
        System.out.println(utf8Bytes.length);
    }

}
