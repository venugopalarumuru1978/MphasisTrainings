class DemoCons
{
    private x : number;
    private y : number;

    constructor(x:number, y:number)
    {
        console.log("It is an Constructor");
        this.x = x;
        this.y = y;
    }

    printval() : number
    {
        console.log("X value : " + this.x);
        console.log("Y value : " + this.y);
        return this.x+this.y;
    }
}

var  d1 = new DemoCons(45,67);
console.log("Addition Value is : " + d1.printval());