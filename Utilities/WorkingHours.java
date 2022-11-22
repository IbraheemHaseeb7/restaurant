package src.Restaurant.Utilities;

public class WorkingHours {

    private int hours, minutes;

  public WorkingHours(int hours, int minutes) {
      this.hours = hours;
      this.minutes = minutes;
  }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return String.format("%2d:%2d", hours, minutes);
    }
}