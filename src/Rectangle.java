public class Rectangle extends Shape {
    private int sideA = 0, sideB=0;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public void describe(){
        super.describe();
        System.out.println("Side A is " +
                this.sideA + " Side B is "+ this.sideB);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj;
        if(this.sideA==r.sideA &&this.sideB==r.sideB&&this.getColor().equals(r.getColor())){
            return true;
        }
        else {
            return false;
        }
    }


    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
