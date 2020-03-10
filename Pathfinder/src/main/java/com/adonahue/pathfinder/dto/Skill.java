package com.adonahue.pathfinder.dto;

/**
 *
 * @author allison
 */
public class Skill {

    String name;
    String type;
    int rank;

    public Skill(String name, String type) {
        this.name = name;
        this.type = type;
        this.rank = 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    
}
