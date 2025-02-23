public class MyTime {
    int hour, minute;

    public MyTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return  (hour < 10 ? "0":"") + hour + ":" + (minute < 10 ? "0":"") + minute;
    }

    public void incrementHour() {
        incrementHour(1);
    }

    public int incrementHour(int i) {
        int dayDiff = 0;
        if (hour + i < 0)
            dayDiff = -1;
        dayDiff += (hour + i) / 24;
        hour = (hour + i) % 24;
        if(hour < 0){
            hour = hour + 24;
        }
            return dayDiff;
    }

    public int  incrementMunite(int diff) {
        int hourDiff = 0;
        if (minute + diff < 0)
            hourDiff = -1;
        hourDiff += (minute + diff) / 60;
        minute = (minute + diff) % 60;
        if(minute < 0){
            minute = minute + 60;
        }
        return incrementHour(hourDiff);
    }

    public boolean isAfter(MyTime time) {
        return  (hour*60) + minute > (time.hour*60) + time.minute;
    }
    public boolean isBefore(MyTime time) {
        return  (hour*60) + minute < (time.hour*60) + time.minute;
    }


    public int minuteDifference(MyTime anotherTime) {
        int minDiff = 0;
        if (isAfter(anotherTime)){
            return  ((hour*60) + minute) - ((anotherTime.hour*60) + anotherTime.minute);
        }else {
            return  ((anotherTime.hour*60) + anotherTime.minute) - ((hour*60) + minute);
        }
    }
}
