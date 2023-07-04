enum courses
{
    Java, Dotnet, Python, Angular, React
}

class StdCourse
{
    private sname:string;
    private course:courses;
    
    constructor()
    {
        console.log("It is constructor");
        this.sname = "Praveen Kumar";
        this.course = courses.Angular;  // here index number will assigned
    }

    printValues()
    {
        console.log("Student Name : " + this.sname);
        console.log("Student Course : " + courses[this.course]);  // value will be printed
    }
}

var std = new StdCourse();
std.printValues();