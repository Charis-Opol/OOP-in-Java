import java.util.ArrayList;

class Device{
    private String device_name;
    private boolean status;
    private String location;

    Device(){}

    public void setdevice_name(String device_name){
        this.device_name = device_name;
    }
    public void setstatus(boolean status){
        this.status = status;
    }
    public void setlocation(String location){
        this.location = location;
    }

    public String getdevice_name(){
        return this.device_name;
    }
    public boolean getstatus(){
        return this.status;
    }
    public String getlocation(){
        return this.location;
    }

    public void displayinfo(){
        System.out.println("Device name: " + getdevice_name());
        System.out.println("Device Status(False(off) and True(on)): " + getstatus());
        System.out.println("Device Location: " + getlocation());
    }
}

class SmartHomeController{
    static int total_devices;

    ArrayList<Device> devices = new ArrayList<>();
    public void add_device(String device_name, String location){
        Device d = new Device();
        d.setdevice_name(device_name);
        d.setlocation(location);
        devices.add(d);
        System.out.println("Device added.");
        total_devices = total_devices + 1;
    }

    public void turn_on(String device_name){
        for (Device index: devices) {
            if (index.getdevice_name() == device_name){
                index.setstatus(true);
                System.out.println("The device is on.");
                break;
            }
        }
    }

    public void turn_off(String device_name){
        for (Device index: devices) {
            if (index.getdevice_name() == device_name){
                index.setstatus(false);
                System.out.println("The device is off.");
                break;
            }
        }
    }

    public void displayDevices(){
        System.out.println("Devices in the system.");
        for (Device device: devices){
            device.displayinfo();
        }
    }

}

public class Smart_Home {
    public static void main(String[] args){
        SmartHomeController shc = new SmartHomeController();
        shc.add_device("Wi-Fi", "Living room");
        shc.add_device("TV", "Bedroom");
        shc.add_device("Play Station", "Gaming room");

        shc.turn_on("Wi-Fi");
        shc.turn_off("Wi-Fi");

        shc.displayDevices();
    }
}
