package tryCreate;

public class Student {

    String name;
    int roll;
    float marks;

    //Constructor Overloading;
    //polymorphism

    Student()
    {

    }

    Student(String name, int roll, float marks)
    {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

}

class Main
{
    public static void main(String[] args) {
        Student Ansuk = new Student();
        Ansuk.name = "Ansuk Sinha Roy";
        Ansuk.roll = 71;
        Ansuk.marks = 8.4f;

        System.out.println(Ansuk.roll);

        Student Aritra = new Student("Aritra Mukherjee", 82, 9.5f);

        System.out.println(Aritra.roll);
    }
}
