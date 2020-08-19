package process;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SetImageIcon {

    public SetImageIcon() {
    }
    
    public static ImageIcon setIcon(String path){
        java.net.URL imgURL = Calc.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        }else{
            JOptionPane.showMessageDialog(null, "Coldn't find file: "+path, "Alert", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}



