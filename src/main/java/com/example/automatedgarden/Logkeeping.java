package com.example.automatedgarden;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Logkeeping {
    private static ArrayList<String> logs = new ArrayList<>();

    public static void addLog(String log) {
        logs.add(log);
    }

    public static void compileLogs() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        try {
            FileWriter writer = new FileWriter("logs.txt");
            writer.write("---------------------------------------" + '\n');
            writer.write("Simulation began at " + dtf.format(GardenMain.startTime) + '\n');
            writer.write("---------------------------------------" + '\n');
            writer.write('\n');
            for (String log:logs) {
                writer.write(log + '\n');
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Unable to write logs.");
        }

    }
}
