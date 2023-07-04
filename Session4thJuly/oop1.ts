class Employee
{
    private empno:number;
    private ename:string;
    private job:string;
    private sal:number;

    getEmpinfo(eno:number, ename:string, job:string, sal:number)
    {
       this.empno = eno;
       this.ename = ename;
       this.job = job;
       this.sal = sal; 
    }
    printEmpInfo()
    {
        console.log("Employee Number : " + this.empno);
        console.log("Employee Name : " + this.ename);
        console.log("Employee Job : " + this.job);
        console.log("Employee Salary : " + this.sal);
    }
}

var emp1 = new Employee();
emp1.getEmpinfo(1001, "Praveen", "Manager", 12000.00);
emp1.printEmpInfo();