public class Leap {


    public boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }


    public static void main(String[] args) {

    }

}
