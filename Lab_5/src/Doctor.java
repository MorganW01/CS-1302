public class Doctor extends Human  {
    private int years;
    private String speciality;

    public Doctor (String speciality, int years, int height, float weight,int age ){
        super(weight,age,height);
        this.speciality=speciality;
        this.years=years;
    }
    public int getYears() {
        return years;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getSalary (){
        int salary =0;

        if (years ==1){

            salary = 40000;
        }

        if (years > 1){
            // raiseFactor is the number of additional years the doctor has worked.
            //it gets multiplied by 5000 and added to the base salary
            int raiseFactor = years - 1;

            salary = (5000*raiseFactor) + 40000;
        }

        return salary;

    }

}
