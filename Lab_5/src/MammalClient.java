public class MammalClient {
    public static void main (String[]args){
        Student alex = new Student("Computer Science",3.4,54,170,150, 18);

        System.out.println("Alex");
        System.out.println(alex.getMajor() + " major");
        System.out.println("GPA: "+alex.getGpa());
        System.out.println("Year: "+alex.getYear());
        System.out.println(alex.getAge()+" years old");

        System.out.println();


        Doctor jack = new Doctor("Dermatology", 4,173,179,40);

        System.out.println("Jack");
        System.out.println("Speciality: "+jack.getSpeciality());
        System.out.println("Height: "+jack.getHeight());
        System.out.println("Weight: "+jack.getWeight());
        System.out.println("Salary: "+jack.getSalary());
    }
    
}
