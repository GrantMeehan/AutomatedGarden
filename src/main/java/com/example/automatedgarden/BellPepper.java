package com.example.automatedgarden;

public class BellPepper extends Plant {
    public BellPepper() {
        this.name = "Bell Pepper";
        this.daysPerGrowth = 5;
        this.daysUntilDead = 7;
        this.plantStage = PlantStage.SEED;
    }
}
