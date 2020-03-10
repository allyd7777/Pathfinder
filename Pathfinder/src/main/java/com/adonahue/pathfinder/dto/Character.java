package com.adonahue.pathfinder.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author allison
 */
public class Character {

    String race;
    String cClass;
    AbilityScores abiltiyScores;
    Map<String, Skill> skills = new HashMap<>();

    public Character(String race, String cClass) {
        this.race = race;
        this.cClass = cClass;
    }

    public AbilityScores getAbiltiyScores() {
        return abiltiyScores;
    }

    public void setAbiltiyScores(AbilityScores abiltiyScores) {
        this.abiltiyScores = abiltiyScores;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass;
    }

    public void setSkills() {
        skills.put("Acrobatics", new Skill("Acrobatics", "Dex"));
        skills.put("Appraise", new Skill("Appraise", "Int"));
        skills.put("Bluff", new Skill("Bluff", "Cha"));
        skills.put("Climb", new Skill("Climb", "Str"));
        skills.put("Craft", new Skill("Craft", "Int"));
        skills.put("Diplomacy", new Skill("Diplomacy", "Cha"));
        skills.put("Disable Device", new Skill("Disable Device", "Dex"));
        skills.put("Disguise", new Skill("Disguise", "Cha"));
        skills.put("Escape Artist", new Skill("Escape Artist", "Dex"));
        skills.put("Fly", new Skill("Fly", "Dex"));
        skills.put("Handle Animal", new Skill("Handle Animal", "Cha"));
        skills.put("Heal", new Skill("Heal", "Wis"));
        skills.put("Intimidate", new Skill("Intimidate", "Cha"));
        skills.put("Knowledge (Arcana)", new Skill("Knowledge (Arcana)", "Int"));
        skills.put("Knowledge (Dungeoneering)", new Skill("Knowledge (Dungeoneering)", "Int"));
        skills.put("Knowledge (Engineering)", new Skill("Knowledge (Engineering)", "Int"));
        skills.put("Knowledge (Geography)", new Skill("Knowledge (Geography)", "Int"));
        skills.put("Knowledge (History)", new Skill("Knowledge (History)", "Int"));
        skills.put("Knowledge (Local)", new Skill("Knowledge (Local)", "Int"));
        skills.put("Knowledge (Nature)", new Skill("Knowledge (Nature)", "Int"));
        skills.put("Knowledge (Nobility)", new Skill("Knowledge (Nobility)", "Int"));
        skills.put("Knowledge (Planes)", new Skill("Knowledge (Planes)", "Int"));
        skills.put("Knowledge (Religion)", new Skill("Knowledge (Religion)", "Int"));
        skills.put("Linguistics", new Skill("Linguistics", "Int"));
        skills.put("Perception", new Skill("Perception", "Wis"));
        skills.put("Perform", new Skill("Perform", "Cha"));
        skills.put("Profession", new Skill("Profession", "Wis"));
        skills.put("Ride", new Skill("Ride", "Dex"));
        skills.put("Sense Motive", new Skill("Sense Motive", "Wis"));
        skills.put("Sleight of Hand", new Skill("Sleight of Hand", "Dex"));
        skills.put("Spellcraft", new Skill("Spellcraft", "Int"));
        skills.put("Stealth", new Skill("Stealth", "Dex"));
        skills.put("Survival", new Skill("Survival", "Wis"));
        skills.put("Swim", new Skill("Swim", "Str"));
        skills.put("Use Magic Device", new Skill("Use Magic Device", "Cha"));        
    }

}
