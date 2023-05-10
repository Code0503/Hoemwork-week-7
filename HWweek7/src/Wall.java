public class Wall { //Wall Area

   double height, width;

   public Wall(){} // no arag constructor
    public Wall(double height, double width){ // constructor with argu
       this.height=4;
       this.width=5;

    }
    public void walldetails(){
        System.out.println(height);
        System.out.println(width);
    }
public double getWidth(){
    return width;
}
public double getHeight(){

       return height;
}

    public double  setWidth(double a){
       if(a<0){width=0;}
       return a;
    }
    public double setHeight(double b){
        if(b<0){height=0;}
        return b;
    }
    public double getArea () {
       return height*width;
    }

//wall.walldetails();
    public static void main(String[] args) {
        Wall wall= new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}
