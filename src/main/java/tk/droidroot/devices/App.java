package tk.droidroot.devices;

import tk.droidroot.devices.Models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, Device> devices  = new HashMap<Integer, Device>();
        devices.put(1, new Device(1, "device 1"));

        devices.get(1).addComponent(new Component(1, "Component 1"));
        devices.get(1).addComponent(new Component(2, "Component 2"));
        devices.get(1).addComponent(new Component(3, "Component 3"));

        List<Event> events = new ArrayList<Event>();
        events.add(new ErrorEvent(1, 1));
        events.add(new ErrorEvent(1, 2));
        events.add(new RestoreEvent(1, 1));
        events.add(new RestoreEvent(1, 2));
        events.add(new ErrorEvent(1, 3));
        events.add(new RestoreEvent(1, 3));

        for(int i = 0; i < events.size(); i++){
            int devId = events.get(i).getDeviceId();
            int compId = events.get(i).getComponentId();
            boolean status = events.get(i).getStatus();
            devices.get(devId).setComponentStatus(compId, status);
        }
    }
}
