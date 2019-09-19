package tk.droidroot.devices.Models;

public class Component {
    private int id;
    private String name;
    private boolean status;

    public Component(int id, String name){
        this.status = true;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
