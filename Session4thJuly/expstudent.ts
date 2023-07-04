export class Student
{
    rollno:number=0;
    sname:string = "";
    course:string = "";
    fees:number = 0.0;
    
    constructor(rno:number, sname:string, course:string, fees:number)
    {
        this.rollno = rno;
        this.sname = sname;
        this.course = course;
        this.fees = fees;
    }
}