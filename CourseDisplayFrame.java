import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class CourseDisplayFrame extends JFrame{
    private JButton button, button2, button3, button4, button5; 
    private JLabel  rateLabel1, rateLabel2, rateLabel3, rateLabel4;
    private JTextField rateField1,rateField2,rateField3, rateField4;
    private JTextArea result;
    
    // Global Variables
    private ArrayList<Course> list = new ArrayList();
    private JPanel panel = new JPanel();
    // Frame Width and Height
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 450;
    
    //comparators
    public CourseDisplayFrame(){
        JFrame frame = new JFrame(); 
        list = new ArrayList<Course>(); 
        
        // buttons
        button = new JButton("Add Course");
        button2 = new JButton("Sort By Code ");
        button3 = new JButton("Sort By Name ");
        button4 = new JButton("Sort By Grade ");
        button5 = new JButton("reset input");

        // adding the Text fields for input
        rateLabel1 = new JLabel("Course Code ");
        rateField1 = new JTextField(30);
        
        
        rateLabel2 = new JLabel("Course Name ");
        rateField2 = new JTextField(30);

        rateField3 = new JTextField(30);
        rateLabel3 = new JLabel("Course Credit ");

        rateField4 = new JTextField(30);
        rateLabel4 = new JLabel("Course Grade ");
        
        // Text Areas
        result = new JTextArea(10,35);
        result.setText("Code \t Name \t Credit \t Grade \t"); 
    
        
        // set up button and listener
        ActionListener l = new ClickListener();
        button.addActionListener(l);

        ActionListener a = new SortByCodeListener();
        button2.addActionListener(a);

        ActionListener b = new SortByNameListener();
        button3.addActionListener(b);

        ActionListener c = new SortByGradeListener();
        button4.addActionListener(c);

        ActionListener d = new ResetInputListener();
        button5.addActionListener(d);

        
        // adding to panel
        panel= new JPanel(); 
        panel.add(rateLabel1);
        panel.add(rateField1);
        panel.add(rateLabel2);
        panel.add(rateField2);
        panel.add(rateLabel3);
        panel.add(rateField3);
        panel.add(rateLabel4); 
        panel.add(rateField4); 
        panel.add(button); 
        panel.add(button2); 
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(result); 
        
        
        // JScrollPane 
        JScrollPane scrollpane = new JScrollPane(result);
        panel.add(scrollpane);
    
        // Add Panel to frame
        add(panel);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    // Comparators for Grades, Name and Code
    
    class CodeSort implements Comparator<Course> {
        public int compare(Course arg0, Course arg1){
            return  arg0.code.compareTo(arg1.code); 
        }
    }
    class NameSort implements Comparator<Course> {
        public int compare(Course arg0, Course arg1){
            return  arg0.name.compareTo(arg1.name); 
        }
    }
    class GradeSort implements Comparator<Course> {
        public int compare(Course arg0, Course arg1){
            return  arg0.grade.compareTo(arg1.grade); 
        }
    }
    // Button Commands for sorting 
    class ClickListener implements ActionListener{
        public void actionPerformed(ActionEvent event)
        {
            Course mlist = new Course(rateField1.getText(),rateField2.getText(), Integer.parseInt(rateField3.getText()), rateField4.getText());
            list.add(mlist); 
            result.append("\n" + mlist.toString()); 
            
            rateField1.setText(" ");
            rateField2.setText(" ");
            rateField3.setText(" ");
            rateField4.setText(" ");
        }    
    }
    class SortByCodeListener implements ActionListener {
        public void actionPerformed(ActionEvent event)
        {
            result.setText("Code \t Name \t Credit \t Grade \t"); 
            Collections.sort(list, new CodeSort());
            for (Course p : list) {
                result.append("\n" + p.toString());
            } 
        }    
    }
    class SortByNameListener implements ActionListener {
        public void actionPerformed(ActionEvent event)
        {
            result.setText("Code \t Name \t Credit \t Grade \t");
            Collections.sort(list, new NameSort());
            for (Course p : list) {
                result.append("\n" + p.toString());
            } 
        }    
    }
    class SortByGradeListener implements ActionListener {
        public void actionPerformed(ActionEvent event)
        {
            result.setText("Code \t Name \t Credit \t Grade \t");
            Collections.sort(list, new GradeSort());
            for (Course p : list) {
                result.append("\n" + p.toString());
            } 
        }    
    }
    class ResetInputListener implements ActionListener {
        public void actionPerformed(ActionEvent event)
        {
         result.setText("Code \t Name \t Credit \t Grade \t");
         rateField1.setText(" ");
         rateField2.setText(" ");
         rateField3.setText(" ");
         rateField4.setText(" ");
        }    
    }
}