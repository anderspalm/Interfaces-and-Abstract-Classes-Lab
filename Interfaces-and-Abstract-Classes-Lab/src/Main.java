import java.util.ArrayList;
import java.util.List;

/**
 * Created by andeski on 6/28/16.
 */
public class Main {

    public static void main(String[] args) {


        // adding three children to an ArrayList to then be looped over
        List<Remote> controller = new ArrayList<Remote>();
        controller.add(new Panasonic());
        controller.add(new Samsung());
        controller.add(new Sony());

        int i = 0;
        for(Remote temp : controller) {
            if (temp.startScan().equals("granted")) {
                System.out.println("\n");
                System.out.println(temp.company_name());
                temp.numberButtonPressed(i);
                temp.channelUp();
                temp.channelDown();
                temp.volumeDown();
                temp.volumeUp();
            }
            // access denied function
            else {
                System.out.println("\n");
                System.out.println(temp.company_name());
                System.out.println("Your access was denied; cannot complete request");
            }
            i ++;
        }
    }
}
