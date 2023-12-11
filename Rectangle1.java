public class Rectangle1{
    private int length;
    private int breadth;
    public int getLength(){
        return length;    
    }
    public void setLength(int length){
        this.length = length;
    }

    public int getbreadth(){
        return length;    
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public int calculatePerimeter(){
        return (2*(length+breadth));
    }

    public static void main(String[] args){
        Rectangle1 r = new Rectangle1();
        r.setLength(5);
        r.setBreadth(3);

        System.out.println("Rectangles Length is " + r.length + " and breadth is " + r.breadth);
        System.out.println("Calculate Perimeter: " + r.calculatePerimeter());
    }

}