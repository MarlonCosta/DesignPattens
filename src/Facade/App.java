package Facade;

public class App implements Connection {
    @Override
    public void connect() {
        WiFiConnection wifi = new WiFiConnection();
        BluetoothConnection bluetooth = new BluetoothConnection();
        GPSConnection gps = new GPSConnection();

        wifi.connect();
        bluetooth.connect();
        gps.connect();
    }
}
