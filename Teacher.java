/**
 * Created by Qursan on 29/09/22.
 */
public class Teacher extends Person{
    private String title;

    public Teacher(String fname, String lname, int age, String title) {
        super(fname, lname, age);
        this.title = title;
    }
    public String getTitle()
    {return title;}
    public void displyDetalis()
    {
super.displyDetalis();
        System.out.println(title);
    }
}
