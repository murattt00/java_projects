public class MyDateTime {
    MyDate date;
    MyTime time;

    public MyDateTime(MyDate date, MyTime time) {
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return date.toString() + " " + time.toString();
    }

    public void incrementDay() {
        date.incrementDay();
    }

    public void incrementHour() {
        time.incrementHour();
    }

    public void incrementHour(int diff) {
        int dayDiff = time.incrementHour(diff);
        if (dayDiff > 0)
            date.incrementDay(dayDiff);
        else
            date.decrementDay(-dayDiff);
    }

    public void decrementHour(int diff) {
        incrementHour(-diff);
    }

    public void incrementMinute(int diff) {
        int dayDiff = time.incrementMunite(diff);
        if (dayDiff > 0)
            date.incrementDay(dayDiff);
        else
            date.decrementDay(-dayDiff);
    }

    public void decrementMinute(int diff) {
        incrementMinute(-diff);
    }

    public void incrementYear(int i) {
        date.incrementYear(i);
    }

    public void decrementDay() {
        date.decrementDay();
    }

    public void decrementYear() {
        date.decrementYear();
    }

    public void decrementMonth() {
        date.decrementMonth();
    }

    public void incrementDay(int i) {
        date.incrementDay(i);
    }

    public void decrementMonth(int i) {
        date.decrementMonth(i);
    }

    public void decrementDay(int i) {
        date.decrementDay(i);
    }

    public void incrementMonth(int i) {
        date.incrementMonth(i);
    }

    public void decrementYear(int i) {
        date.decrementYear(i);
    }

    public void incrementMonth() {
        date.incrementMonth();
    }

    public void incrementYear() {
        date.incrementYear();
    }

    public boolean isBefore(MyDateTime anotherDateTime) {
        if (date.isBefore(anotherDateTime.date)) {
            return true;
        } else if (date.isAfter(anotherDateTime.date)) {
            return false;
        }
        if (time.isAfter(anotherDateTime.time)) {
            return false;
        }return true;
    }

    public boolean isAfter(MyDateTime anotherDateTime) {
        return !isBefore(anotherDateTime);
    }

    public String dayTimeDifference(MyDateTime anotherDateTime) {
        int dayDiff = date.dayDifference(anotherDateTime.date);
        int minuteDiff = time.minuteDifference(anotherDateTime.time) % 60;
        int hourDiff = time.minuteDifference(anotherDateTime.time) / 60;
        if (dayDiff != 0) {
            dayDiff -= 1;
            minuteDiff = (24*60 - time.minuteDifference(anotherDateTime.time)) % 60;
            hourDiff = (24*60 - time.minuteDifference(anotherDateTime.time)) / 60;
        }

        return  ((dayDiff == 0) ? "" : dayDiff + " day(s) ") +
                ((hourDiff == 0) ? "" : hourDiff + " hour(s) ") +
                ((minuteDiff == 0) ? "" : minuteDiff + " minute(s)");
    }
}