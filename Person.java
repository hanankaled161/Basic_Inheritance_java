/**
 * Created by Qursan on 29/09/22.
 */
public class Person {
    protected String fname;
    protected String lname;
    protected int age;
    public Person(String fname, String lname)
    {this.fname = fname;this.lname = lname;age=0;}
    public Person(String fname, String lname, int age)
    {this.fname = fname;this.lname = lname;this.age = age;}
    public int getAge()
    {return age;}
    public void setAge(int age)
    {this.age = age;}
    public void setFmame(String fname ,String lname)
    {this.fname = fname;this.lname= lname;}
    public String getname()
    {return fname+lname;}

    public void displyDetalis()
    {
        System.out.println(fname+" "+lname);
        System.out.println(age);
    }
}
