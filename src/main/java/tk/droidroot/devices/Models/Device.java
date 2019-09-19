package tk.droidroot.devices.Models;

import java.util.HashMap;
import java.util.Map;

public class Device {
    private int id;
    private String name;
    private String status;

    private Map<Integer, Component> components;

    public Device(int id, String name){
        this.id = id;
        this.name = name;
        this.status = "normal";
        components = new HashMap<Integer, Component>();
    }

    public void addComponent(Component component) {
        if(!this.components.containsKey(component.getId())){
            this.components.put(component.getId(), component);
        }
    }

    public void setComponentStatus(int componentId, boolean componentStatus){

        //System.out.println(this.components.containsKey(componentId));
        if(this.components.containsKey(componentId)){
            //System.out.println(this.components.get(componentId).isStatus());
            this.components.get(componentId).setStatus(componentStatus);
            //System.out.println(this.components.get(componentId).isStatus());
        }

        checkStatus();
    }
    
    private void checkStatus(){

        int count = 0;

        for (Component component: components.values()) {
            if(!component.isStatus()){
                count++;
            }
        }

        if((count == 1)){
            status = "Warning";
        }
        else if((count == 0)){
            status = "Normal";
        }
        else if(((double)count / components.size() > 0.5)){
            status = "Error";
        }

        System.out.println(
                String.format("Устройство id = %s, name = %s изменило своё состояние на %s",
                        this.id, this.name, this.status)
        );

    }
}
