package in.co.oop;

public class DAy_01 {

    public enum Day {
        Sunday,Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday;

        public int getWeekDay(){
            switch (this){
                case Sunday :return 0;
                case Monday:return 1;
                case Tuesday:return 2;
                case Wednesday:return 3;
                case Thrusday:return 4;
                case Friday:return 5;
                case Saturday:return 6;
            }
            return 0;
        }
    }
//    Day f = new Day();
    Day d = Day.Sunday;

    public static void main(String[] args) {
        Day fd= Day.Friday;
        System.out.println(fd.getWeekDay());
        switch (fd){
            case Monday :
                System.out.println("Mondays are worse.");
                break;
            case Friday:
                System.out.println("Fridays are better.");
                break;
        }
        Day[] days = fd.values();
        for (Day d: days){
            System.out.println(d);
        }
    }

}
