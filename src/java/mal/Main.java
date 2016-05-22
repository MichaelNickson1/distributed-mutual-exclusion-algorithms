package Agrawalas;

import java.Utils.PropertiesManager;

public class Main {
    public static PropertiesManager propertiesManager;
    public static NetworkController networkController;
    public static String pid;
    public static String[] nodes;
    public static void main(String[] args){

        propertiesManager = new PropertiesManager();
        pid = propertiesManager.getProperty("pid");
        nodes = propertiesManager.getArray("nodes");
        networkController = new NetworkController();
        networkController.start();
    }

}
