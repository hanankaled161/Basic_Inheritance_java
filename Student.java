/**
 * Created by Qursan on 29/09/22.
 */
public class Student extends Person {
    private int id;
     int h;
    public Student(String fname, String lname, int age, int id) {
        super(fname,lname,age);
        this.id = id;
    }
    public int getId()
    {return id;}
    public String getfllname()
    {return fname+" "+lname;}
public void displyDetalis()
{
    super.displyDetalis();
    System.out.println(id);
}

}
