package com.example.automatedgarden;

public class Onion extends Plant {
    public Onion() {
        this.plantName = "Onion";
        this.daysPerGrowth = 5;
        this.daysUntilDead = 7;
        this.plantStage = PlantStage.SEED;
    }
}
