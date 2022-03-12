package com.example.automatedgarden;

public class Tomato extends Plant {
    public Tomato() {
        this.plantName = "Tomato";
        this.daysPerGrowth = 5;
        this.daysUntilDead = 7;
        this.plantStage = PlantStage.SEED;
    }
}
