package src;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//            float sub1;
//            float sub2;
//            float sub3;
//            Scanner sc = new Scanner(System.in);
//            sub1=sc.nextFloat();
//            sub2=sc.nextFloat();
//            sub3=sc.nextFloat();
//            float total_Perc = (sub1+sub2+sub3)/300*100;
//            if(sub1>=33 && sub2>=33 && sub3>=33 && total_Perc>=40)
//            {
//                System.out.println("pass");
//            }
//            else{
//                System.out.println("fail");
//            }
//        int day;
//        Scanner sc = new Scanner(System.in);
//        day = sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Not a Day");
//                break;
//        }
        String website;
        Scanner sc = new Scanner(System.in);
        website = sc.nextLine();
        if (website.endsWith(".com")) {
            System.out.println("commercial website");
        }
        if (website.endsWith(".org")) {
            System.out.println("organisation website");
        }
        if (website.endsWith(".in")) {
            System.out.println("indian website");
        }
    }
}





