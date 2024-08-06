// Lawrence Menegus 
// program4 

import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Course
{
    public String code;
    public String name;
    public int credit;
    public String grade;
    public Course()
    {
        code="";
        name="";
        credit=0;
        grade="";
    }

    /**
    Create a course with a given name, credit and grade.
    @param name the name
    @param credit the credit
    @param grade the grade
     */
    public Course(String code, String name, int credit, String grade )
    {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.grade=grade;
    }

    /**
    Get the course code.
    @return the code
     */
    public String getCode()
    {   
        return code;
    }

    /**
    Change the course code.
    @param code the code
     */
    public void setCode(String code)
    {   
        this.code = code;
    }

    /**
    Get the name.
    @return the name
     */
    public String getName()
    {   
        return name;
    }

    /**
    Change the name.
    @param name the name
     */
    public void setName(String name)
    {   
        this.name = name;
    }

    /**
    Get the credit.
    @return the credit
     */
    public int getCredit()
    {   
        return credit;
    }

    /**
    Change the credit.
    @param credit the credit
     */
    public void setCredit(int credit)
    {   
        this.credit=credit;
    }

    /**
    Get the grade.
    @return the grade
     */
    public String getGrade()
    {   
        return grade;
    }

    /**
    Change the grade.
    @param grade the grade
     */
    public void setGrade(String grade)
    {   
        this.grade = grade;
    }

    /**
    Convert course to string form.
     */
    public String toString()
    {
        return "   " + code + "\t" + name + "\t" + credit + "\t" + grade;
    }
}

