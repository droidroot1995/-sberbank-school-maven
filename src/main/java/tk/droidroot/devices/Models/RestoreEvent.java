package tk.droidroot.devices.Models;

public class RestoreEvent implements Event{
    private int deviceId;
    private int componentId;

    public RestoreEvent(int deviceId, int componentId){
        this.deviceId = deviceId;
        this.componentId = componentId;
    }

    public boolean getStatus() {
        return true;
    }

    public int getDeviceId() {
        return this.deviceId;
    }

    public int getComponentId() {
        return this.componentId;
    }
}
