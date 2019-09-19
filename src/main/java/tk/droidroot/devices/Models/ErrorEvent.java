package tk.droidroot.devices.Models;

public class ErrorEvent implements Event{
    private int deviceId;
    private int componentId;

    public ErrorEvent(int deviceId, int componentId){
        this.deviceId = deviceId;
        this.componentId = componentId;
    }

    public boolean getStatus() {
        return false;
    }

    public int getDeviceId() {
        return this.deviceId;
    }

    public int getComponentId() {
        return this.componentId;
    }
}
