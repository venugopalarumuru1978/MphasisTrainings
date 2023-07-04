var student = {
    rollno:1001,
    sname:"satyam",
    avg:67.78,

    testfun:function()
    {
        console.log("Roll Number : " + this.rollno);
        console.log("Student Name : " + this.sname);
        console.log("Average : " + this.avg);
    }
};

student.testfun();
