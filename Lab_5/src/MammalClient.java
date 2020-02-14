public class MammalClient {


    public static void main (String[]args){
        Student alex = new Student("Computer Science",3.4,54,170,150, 18);

        System.out.println("Alex");
        System.out.println(alex.getMajor());
        System.out.println(alex.getGpa());
        System.out.println(alex.getYear());
        System.out.println(alex.getAge());

        System.out.println();


        Doctor jack = new Doctor("Dermatology", 4,173,179,40);

        System.out.println("Jack");
        System.out.println(jack.getSpeciality());
        System.out.println(jack.getHeight());
        System.out.println(jack.getWeight());
        System.out.println(jack.getSalary());


    }



}
