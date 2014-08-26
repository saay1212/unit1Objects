import javax.swing.JOptionPane;
public class DialogViewer
{
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog("Enter your name for a surprise");
        System.out.println(name);
    }
}