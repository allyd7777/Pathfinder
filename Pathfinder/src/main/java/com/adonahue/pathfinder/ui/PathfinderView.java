package com.adonahue.pathfinder.ui;

import com.adonahue.pathfinder.dto.AbilityScores;

/**
 *
 * @author allison
 */
public class PathfinderView {

    private UserIO io = new UserIOImpl();

    public int getMenuSelection() {
        io.println("Menu:");
        io.println("1. Create New Character");
        io.println("2. Level Character");
        io.println("3. Edit Character");
        io.println("4. Exit");

        return io.readInt("Please chose an option", 1, 4);
    }

    public String getRaceChoice() {
        io.println("Please choose a race:");
        io.println("~ Human ~");
        io.println("~ Orc ~");
        return io.readString("");
    }

    public String getClassChoice() {
        io.println("Please choose a class:");
        io.println("~ Fighter ~");
        io.println("~ Rogue ~");
        return io.readString("");
    }

    public AbilityScores enterAbilityScores() {
        AbilityScores abilityScores = new AbilityScores();
        abilityScores.setStrength(io.readInt("Enter strength abilty score"));
        abilityScores.setDexterity(io.readInt("Enter dexterity abilty score"));
        abilityScores.setConstitution(io.readInt("Enter constitution abilty score"));
        abilityScores.setWisdom(io.readInt("Enter wisdom abilty score"));
        abilityScores.setIntelligence(io.readInt("Enter intelligence abilty score"));
        abilityScores.setCharisma(io.readInt("Enter charisma abilty score"));
        return abilityScores;
    }

}
