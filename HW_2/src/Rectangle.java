public class Rectangle {
    // DO NOT FORGET THE .CLASS FILES BC APPARENTLY THAT MATTERS FOR SOME REASON!

    private int x;
    private int y;
    private int width;
    private int height;

    //Constructor that creates a new rectangle with the given x, y, width, height
    public Rectangle(int x, int y, int w, int h){
        this.x=x;
        this.y=y;
        this.width=w;
        this.height=h;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int area (){
        return width*height;
    }

    public void changeSize (int newWidth, int newHeight){
        this.width=newWidth;
        this.height= newHeight;
    }

    //returns a string such as Coordinate is (5,12) and dimension is 4x8 where 4 is width and 8 is height.

    public String toString(){
        return "Coordinate is ("+x+","+y+") and dimension is "+ width+"x"+height+"\n" +
                "Area is "+ area();

    }


}
