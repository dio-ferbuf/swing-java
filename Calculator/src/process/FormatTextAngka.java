package process;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatTextAngka {

    public FormatTextAngka() {
    }    
    public String formatText(double doubNumber){
        NumberFormat numFrm = NumberFormat.getNumberInstance(Locale.ENGLISH);
        String a = numFrm.format(doubNumber);
        return a;
    }       
}
