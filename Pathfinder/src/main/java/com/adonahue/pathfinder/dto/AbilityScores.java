package com.adonahue.pathfinder.dto;

/**
 *
 * @author allison
 */
public class AbilityScores {
    
    int strength;
    int dexterity;
    int wisdom;
    int intelligence;
    int constitution;
    int charisma;
    
    public AbilityScores(){
        
    }

    public AbilityScores(int strength, int dexterity, int wisdom, int intelligence, int constitution, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
        this.constitution = constitution;
        this.charisma = charisma;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
    
    
    
}
