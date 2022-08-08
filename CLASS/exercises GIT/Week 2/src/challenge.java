import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Challenge
{
    public static String reverse(String str)
    {
        if (str == null || str.equals("")) {
            return str;
        }

        int n = str.length();

        char[] temp = new char[n];

        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }

        return String.copyValueOf(temp);
    }

    public static void main(String[] args)
    {
        String str = "Subaru  Honda Toyota  Lexus  Ford  BMW  Jeep  Mercedes  Volkswagen  Infiniti";

        str = reverse(str);

        System.out.println("The reversed string is " + str);
    }
}