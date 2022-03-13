package com.example.automatedgarden;

public class Eggplant extends Plant {
    public Eggplant() {
        this.name = "Eggplant";
        this.daysPerGrowth = 5;
        this.daysUntilDead = 7;
        this.plantStage = PlantStage.SEED;
    }
}
