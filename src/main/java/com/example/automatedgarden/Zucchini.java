package com.example.automatedgarden;

public class Zucchini extends Plant{
    public Zucchini() {
        this.plantName = "Zucchini";
        this.daysPerGrowth = 5;
        this.daysUntilDead = 7;
        this.plantStage = PlantStage.SEED;
    }
}
