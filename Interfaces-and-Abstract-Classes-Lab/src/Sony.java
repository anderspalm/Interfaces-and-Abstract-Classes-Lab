/**
 * Created by andeski on 6/28/16.
 */
public class Sony extends Remote{



    @Override
    public void channelUp() {
        System.out.println("The remote is broken... oops");
    }

    @Override
    public void channelDown() {
        System.out.println("Computer says no...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Yippee... up up and away!");
    }

    @Override
    public void volumeDown() {
        System.out.println("Did you want something?");
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("it is not rechargeable ");
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Minimal compatability");
    }

    @Override
    public boolean isWaterProof() {
        System.out.println("It is waterproof");
        return true;
    }

    @Override
    public String startScan() {
        return "denied";
    }

    @Override
    public String company_name() {
        return "Sony";
    }
}
