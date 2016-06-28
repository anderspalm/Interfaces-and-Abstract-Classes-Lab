/**
 * Created by andeski on 6/28/16.
 */
public class Samsung extends Remote{


    @Override
    public void channelUp() {
        System.out.println("Thou hast turned the channel one up");
    }

    @Override
    public void channelDown() {
        System.out.println("Thou hast turned the channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Thou hast turned the volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Thou hast turned the volume down");
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
        return "Samsung";
    }
}
