import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class SwitchExample1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Day: ");
//        String day = sc.next();

//        switch(day){
//                case "Monday":
//                    System.out.println("Work Hard");
//                    break;
//                case "Tuesday":
//                    System.out.println("Work Hard");
//                    break;
//                case "Wednesday":
//                    System.out.println("Work Hard");
//                    break;
//                case "Thursday":
//                    System.out.println("Work Hard");
//                    break;
//                case "Friday":
//                    System.out.println("Work Hard");
//                    break;
//                case "Satrday":
//                    System.out.println("Enjoy Weekend");
//                    break;
//                case "Sunday":
//                    System.out.println("Enjoy Weekend");
//                     break;
//            default :
//                System.out.println("Invalid Day"); break;
//        }
                // OR

        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        String msg = switch(dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Work Hard";
            case SATURDAY, SUNDAY -> "Enjoy Weekend";
            default -> {
                System.out.println("Invalid Input");
                yield ""; // Return an empty string as a placeholder
            }
        };

        System.out.println(msg);
    }
}
