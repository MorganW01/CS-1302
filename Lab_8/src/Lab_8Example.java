public class Lab_8Example {

    public static void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n / 2);
            System.out.print(", " + n);
        }
    }

    public static void main (String []args){

        //mystery1(1);
        //mystery1(3);
        mystery1(30);

        //System.out.println(3/2);

    }
}
