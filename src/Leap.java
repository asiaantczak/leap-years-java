public class Leap {


    public boolean isLeap(int year) {
        if(year % 400 == 0) {
            return true;
        } else if(year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return false;
    }



    public static void main(String[] args) {

    }

}
