public class Student extends Human{

    private String name;
    private String major;
    private double gpa;
    private int creditHours;


    public Student (String major, double gpa, int creditHours, int height, float weight, int age){
        super (weight,age, height);
        this.gpa = gpa;
        this.creditHours=creditHours;
        this.major=major;

    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public String getYear(){
        String year ="";

        if (creditHours <= 32){

            year = "Freshman";
        }

        else if (creditHours < 64){

            year = "Sophomore";
        }

        else if (creditHours > 64 && creditHours<96){

            year = "Junior";
        }

        else if (creditHours>=96){

            year = "Senior";
        }

        return year;

    }
}
