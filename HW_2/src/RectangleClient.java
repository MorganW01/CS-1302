public class RectangleClient {
    public static void main (String []args){

        Rectangle rectangle = new Rectangle (5,12,4,8);
        System.out.println(rectangle.toString());
        System.out.println("Area is "+ rectangle.area());
        rectangle.changeSize(3,10);
        System.out.println(rectangle.toString());
        System.out.println("Area after the size is changed is "+rectangle.area());












    }



}
