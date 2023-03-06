import java.util.*;
public class Teacher
{
    public String name;
    public String IC;
    public String address;
    public String qualification;
    public int experience;
    public String startDate;

    public Teacher (String name, String IC, String address, String qualification, int experience, String startDate)
    {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.experience = experience;
        this.startDate = startDate;
    }

    public String getName ()
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

    public String getQualification()
    {
        return qualification;
    }

    public int getExperience()
    {
        return experience;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setALL (String name, String IC, String address, String qualification, int experience, String startDate)
    {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.experience = experience;
        this.startDate = startDate;
    }
}
