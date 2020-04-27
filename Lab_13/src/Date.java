public class Date {
    private int month;
    private int day;
    //constructor
    public Date(int m, int d) {
        this.month = m;
        this.day = d;
    }


    //accessors
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;

    }
    //mutators
    public void setDay(int d){
        this.day= d;

    }
    public void setMonth(int m){
        this.month = m;
    }
    // returns the number of days in the given month
    public int numDays(int m) {
        if (m == 2) {
            return 28;
        } else if (m == 4 ||
                m == 6 ||
                m == 9 ||
                m == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public void addDays(int numberOfDays) {
        // for loop used to add each day amount then check to see if it is necessary to begin a new month or year.
        for (int i=0; i < numberOfDays;i++){
            // increase the day for each numberOfDays the user inputted.
            day ++;
            /*checks to see whether or not to begin a new month by checking if
            the day is greater that the amount of days in the particular month*/
            if (day > numDays(month)){
              day =1;
              month ++;

            }

            //checks if the month is greater than 12; begins a new year from January.
            if (month > 12){
                month = 1;
                day=1;

            }

        }

        System.out.println(month + "/" + day);

    }


}
