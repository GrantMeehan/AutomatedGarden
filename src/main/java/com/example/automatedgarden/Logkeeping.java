package com.example.automatedgarden;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
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
            FileWriter writer = new FileWriter("logs/logs.txt");
            writer.write("---------------------------------------" + '\n');
            writer.write("Simulation began at " + dtf.format(GardenMain.startTime) + '\n');
            writer.write("---------------------------------------" + '\n');
            writer.write('\n');
            for (String log:logs) {
                writer.write(log + '\n');
            }
            writer.write('\n');
            writer.write("------------------------------------------" + '\n');
            writer.write("Simulation finished at " + dtf.format(LocalDateTime.now()) + '\n');
            writer.write("------------------------------------------" + '\n');
            writer.write("Total plants harvested:" + '\n');
            writer.write("Bell Pepper: " + BellPepper.bellPepperHarvestCount + '\n');
            writer.write("Eggplant: " + Eggplant.eggplantHarvestCount + '\n');
            writer.write("Onion: " + Onion.onionHarvestCount + '\n');
            writer.write("Tomato: " + Tomato.tomatoHarvestCount + '\n');
            writer.write("Zucchini: " + Zucchini.zucchiniHarvestCount);
            writer.close();
        } catch (IOException e) {
            System.out.println("Unable to write logs.");
        }

    }
}
