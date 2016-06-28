/**
 * Created by andeski on 6/28/16.
 */
public abstract class Remote implements WaterProof, Rechargeable, Universal, FingerPrintScanner, CompanyName{
    private boolean mneedsBatteries;
    private boolean msupportsUsb;

    public Remote() {
    }

    public Remote(boolean needsBatteries, boolean supportsUsb) {
        mneedsBatteries = needsBatteries;
        msupportsUsb = supportsUsb;
    }

    public void setBatteries(boolean needsBatteries) {
        mneedsBatteries = needsBatteries;
    }

    public boolean getBatteries() {
        return mneedsBatteries;
    }

    public void setsupportsUsb(boolean supportsUsb) {
        msupportsUsb = supportsUsb;
    }

    public boolean getsupportUsb() {
        return msupportsUsb;
    }

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public void powerButtonPressed() {
        System.out.println("the power button was pressed");
    }

    public void numberButtonPressed(int num) {
        System.out.println("Changing channel1 to channel" + num);
    }

    @Override
    public String startScan() {
        return null;
    }
}
