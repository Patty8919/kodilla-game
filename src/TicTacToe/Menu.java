package TicTacToe;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    File savedHashMaps = new File("ranking.list");
    Map<String, Long> map = new HashMap<>();

    public void saveMap() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(savedHashMaps));
            oos.writeObject(map);
            oos.close();
        } catch (Exception e) {

        }
    }

    public void loadMap() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(savedHashMaps));
            Object readMap = ois.readObject();
            if(readMap instanceof HashMap) {
                map.putAll((HashMap) readMap);
            }
            ois.close();
        } catch (Exception e) {
        }
    }
}

