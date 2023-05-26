import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

public class dollar {
    public static void main(String[] args) {
        NumberFormat n;
        n = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(n.format(500));
        NumberFormat p = NumberFormat.getPercentInstance();
        System.out.println(p.format(30));

    }
}
