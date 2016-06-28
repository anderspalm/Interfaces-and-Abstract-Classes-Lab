/**
 * Created by andeski on 6/28/16.
 */
public class Panasonic extends Remote{

    @Override
    public void channelUp() {
        System.out.println("Turned the channel up one");
    }

    @Override
    public void channelDown() {
        System.out.println("Turned the channel down one");
    }

    @Override
    public void volumeUp() {
        System.out.println("Turned the volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Turned the volume down");
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("it is not rechargeable ");
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Total compatability");
    }

    @Override
    public boolean isWaterProof() {
        System.out.println("it is not waterproof");
        return false;
    }

    @Override
    public String startScan() {
        return "granted";
    }

    @Override
    public String company_name() {
        return "Panasonic";
    }
}
