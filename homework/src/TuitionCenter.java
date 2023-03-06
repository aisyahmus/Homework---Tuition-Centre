import java.util.ArrayList;
public class TuitionCenter
{
    private String address;
    private String headmaster;
    private ArrayList<Teacher> teachers;  // list of tutor in the tuition centre
    private ArrayList<Student> students;  // list of students in the tuition

    public TuitionCenter (String address, String headmaster, ArrayList<Teacher> teachers, ArrayList<Student> students)
    {
        this.address = address;
        this.headmaster = headmaster;
        //teachers = new ArrayList<Teacher>();
        //students = new ArrayList<Student>();
        this.teachers = teachers;
        this.students = students;
    }

    public String getAddress() {
        return address;
    }

    public String getHeadmaster() {
        return headmaster;
    }
    
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    // add tutor to the tuition
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void setALL (String address, String headmaster)
    {
        this.address = address;
        this.headmaster = headmaster;
    }

    //methods to add and remove teachers

    public void removeTeacher (Teacher teacher, Teacher name){
        if(teacher.getName().equals(name)){
            teachers.remove(teacher);
        }
    }
    
//    public void removeTeacher (Teacher teacher)
//    {
//        teachers.remove(teacher);
//    }
}