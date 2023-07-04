import { Student } from "./expstudent";

class StudentInfo
{
    stds : Student[] = [
       new Student(1001, "Pavan-1", "Java", 12000.00),
       new Student(1002, "Pavan-2", "Java", 12000.00),
       new Student(1003, "Pavan-3", "Java", 12000.00),
       new Student(1004, "Pavan-4", "Java", 12000.00),
       new Student(1005, "Pavan-5", "Java", 12000.00) 
    ];

    printStudentsInfo()
    {
        for(let i in this.stds)  // everytime index number will be passed
        {
            console.log(this.stds[i].rollno + "  "  + this.stds[i].sname + "  " + this.stds[i].course + "  " + this.stds[i].fees);
        }
    }
}

var st1 = new StudentInfo();
st1.printStudentsInfo();