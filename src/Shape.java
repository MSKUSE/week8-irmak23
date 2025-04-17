public class Shape {
    private String color = "white";

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double area() {
        return 0.0;
    }

    public double perimenter() {
        return 0.0;
    }
    public void describe(){
        System.out.println("this is a shape and color is" + this.color);
    }
    /*public void describe (int sideA,int sideB){
        System.out.println("Side A is " + sideA + "Side B is " +sideB);
    }
    public void describe(int sideA){
        System.out.println("SideA is " + sideA);
    }

    public void describe(double sideA) {
        System.out.println("Radius is " + sideA);
    }*/






}
