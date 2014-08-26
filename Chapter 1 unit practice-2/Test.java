import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imagelocation= new URL("http://en.gtwallpaper.com/fondecran/licornes/licorne_17.jpg");
        JOptionPane.showMessageDialog(null,"Hi Everybody","Title",JOptionPane.PLAIN_MESSAGE,new ImageIcon(
        imagelocation));
    }
}
        