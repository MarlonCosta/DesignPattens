package SemFacade;

public class Main {
    public static void main(String[] args) {

        GPSConnection gps = new GPSConnection();
        WiFiConnection wifi = new WiFiConnection();
        BluetoothConnection bluetooth = new BluetoothConnection();

        wifi.connect();
        bluetooth.connect();
        gps.connect();
    }
}
