import java.util.*;
import javax.swing.JFrame;
public class CourseDisplayViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new CourseDisplayFrame();
        frame.setTitle("My Course Display Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}