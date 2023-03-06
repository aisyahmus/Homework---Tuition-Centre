import java.util.*;
public class Student
{
    public String name;
    public String IC;
    public String address;
    public int year;
    public String schoolName;
    //private String[] listScores;

    public Student (String name, String IC, String address, int year, String schoolName) //String[] listScores)
    {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        //listScores = listScores;
    }

    public String getName()
    {
        return name;
    }

    public String getIC()
    {
        return IC;
    }

    public String getAddress()
    {
        return address;
    }

    public int getYear()
    {
        return year;
    }

    public String getSchoolName()
    {
        return schoolName;
    }

    /*public String[] getListScores()
    {
        return listScores;
    }*/

    public void setALL (String name, String IC, String address, int year, String schoolName)//, String[] listScores)
    {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        //listScores = listScores;
    }


//    public String toString(){
//
//    }
}

