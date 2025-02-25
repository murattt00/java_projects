public class MyDate {
    private int day;
    private int month;
    private int year;
    private int[] maxDays = {31,29,31,30,31,30,31,31,30,31,30,31};
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month -1;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void incrementDay() {
        int newDay = day + 1;
        if (newDay > maxDays[month]){
            day = 1;
            incrementMonth();
        } else if ((month == 1) && (newDay == 29) && !isLeapYear()) {
            day = 1;
            incrementMonth();
        }else {
            day = newDay;
        }
    }
    private boolean isLeapYear() {
        boolean leap = false;
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400 then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // if the year is not century
            else
                leap = true;
        }
        else
            leap = false;
        return leap;
    }
    public void incrementYear(int i) {
        year += i;
        if ((month ==1) && (day == 29) && !isLeapYear()){
            day = 28;
        }
    }
    public void decrementDay() {
        int newDay = day -1;
        if (newDay == 0 ){
            decrementMonth();
            day = maxDays[month];
        } else if ((month == 2) && (newDay == 0) && !isLeapYear()) {
            decrementMonth();
            day = 28;
        }else {
            day = newDay;
        }
    }
    public void decrementYear() {
        incrementYear(-1);
    }
    public void decrementMonth() {
        incrementMonth(-1);
    }
    public void incrementDay(int i) {
        while (i > 0){
            incrementDay();
            i--;
        }
    }
    public void decrementMonth(int i) {
        incrementMonth(-i);
    }
    public void decrementDay(int i) {
        while (i > 0){
            decrementDay();
            i--;
        }
    }
    public void incrementMonth(int i) {
        int newMonth = (month + i) % 12;
        int yearChange = 0;
        if (newMonth < 0){
            newMonth += 12;
            yearChange = -1;
        }
        yearChange += (month+i) / 12;
        month = newMonth;
        year += yearChange;
        if (day > maxDays[month]){
            day = maxDays[month];
            if ((month == 1) && !isLeapYear()){
                day = 28;
            }
        }
    }
    public void decrementYear(int i) {
        incrementYear(-i);
    }
    public void incrementMonth() {
        incrementMonth(1);
    }
    public void incrementYear() {
        incrementYear(1);
    }
    public boolean isBefore(MyDate anotherDate) {
        if (anotherDate.getYear() > year ){
            return true;
        } else if (anotherDate.getYear() == year) {
            if (anotherDate.getMonth()> month){
                return true;
            } else if (anotherDate.getMonth() == month) {
                boolean sol = (anotherDate.getDay() > day) ? true:false;
                return sol;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
    public boolean isAfter(MyDate anotherDate) {
        return  !isBefore(anotherDate);
    }
    public int dayDifference(MyDate anotherDate) {
        int dayDiff = 0;
        int cnt = 0;
        if (isBefore(anotherDate)) {
            while (anotherDate.getYear() - year > 1) {
                if (anotherDate.isLeapYear()) {
                    dayDiff += 366;
                } else {
                    dayDiff += 365;
                }
                anotherDate.setYear(anotherDate.getYear() - 1);
                cnt += 1;
            }
            if (anotherDate.getYear() - year == 1) {
                for (int i = month + 1; i < 12; i++) {
                    dayDiff += maxDays[i];
                }
                for (int i = 0; i < anotherDate.getMonth(); i++) {
                    dayDiff += anotherDate.maxDays[i];
                }
                dayDiff += anotherDate.getDay() + (maxDays[month] - day);
                if (!isLeapYear()||!anotherDate.isLeapYear()){
                    if (anotherDate.getMonth() > 1){
                        dayDiff -= 1;
                    }
                    if (month <= 1){
                        dayDiff -= 1;
                    }
                }
            } else {
                if (anotherDate.getMonth() != month) {
                    for (int i = month + 1; month < anotherDate.getMonth(); i++) {
                        dayDiff += maxDays[i];
                    }
                    dayDiff += anotherDate.getDay() + (maxDays[month] - day);
                    if (!isLeapYear()){
                        if (month <= 1){
                        dayDiff -= 1;
                        }
                    }
                }else {
                    dayDiff += anotherDate.getDay() - day;
                }
            }
            anotherDate.setYear(anotherDate.getYear() + cnt);
        } else {
            while (year - anotherDate.getYear() > 1) {
                if (isLeapYear()) {
                    dayDiff += 366;
                } else {
                    dayDiff += 365;
                }
                setYear(year - 1);
                cnt += 1;
            }
            if (year - anotherDate.getYear() == 1) {
                for (int i = anotherDate.getMonth() + 1; i < 12; i++) {
                    dayDiff += anotherDate.maxDays[i];
                }
                for (int i = 0; i < month; i++) {
                    dayDiff += maxDays[i];
                }
                dayDiff += day + (anotherDate.maxDays[anotherDate.getMonth()] - anotherDate.getDay());
                if (!isLeapYear()||!anotherDate.isLeapYear()){
                    if (anotherDate.getMonth() <= 1){
                        dayDiff -= 1;
                    }
                    if (month > 1){
                        dayDiff -= 1;
                    }
                }
            } else {
                if (month != anotherDate.getMonth()) {
                    for (int i = anotherDate.getMonth() + 1; i < month; i++) {
                        dayDiff += anotherDate.maxDays[i];
                    }
                    dayDiff += day + (anotherDate.maxDays[anotherDate.getMonth()] - anotherDate.getDay());
                    if (!isLeapYear()){
                        if (anotherDate.getMonth()<= 1){
                            dayDiff -= 1;
                        }
                    }
                }else {
                    dayDiff = day - anotherDate.getDay();
                }
            }
            setYear(year + cnt);
        }return dayDiff;
    }
    @Override
    public String toString() {
        return year+ "-" +( month+1 < 10 ? "0":"") + (month+1) + "-" + (day < 10 ? "0":"")+ day ;
    }
}