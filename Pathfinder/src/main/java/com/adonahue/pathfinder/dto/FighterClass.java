/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adonahue.pathfinder.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author allison
 */
public class FighterClass implements Class {

    private Random rand = new Random();

    @Override
    public int setHP(int level) {
        return 10 + (rand.nextInt(6) + 5) * (level - 1);
    }

    @Override
    public int setInitGold() {
        int roll = 0;
        for (int i = 1; i <= 5; i++) {
            roll += (rand.nextInt(6) + 1);
        }
        return roll * 10;
    }

    @Override
    public List<String> setClassSkills() {
        List<String> classSkills = new ArrayList<>();
        classSkills.add("Climb");
        classSkills.add("Craft");
        classSkills.add("Handle Animal");
        classSkills.add("Intimidate");
        classSkills.add("Knowledge (dungeoneering)");
        classSkills.add("Knowledge (engineering)");
        classSkills.add("Profession");
        classSkills.add("Ride");
        classSkills.add("Survival");
        classSkills.add("Swim");
        return classSkills;
    }

    @Override
    public List<Integer> setBAB(int level) {
        List<Integer> bab = new ArrayList<>();
        int bab1 = level;
        int bab2 = level - 5;
        int bab3 = level - 10;
        int bab4 = level - 15;

        bab.add(bab1);
        if (level >= 5) {
            bab.add(bab2);
        }
        if (level >= 10) {
            bab.add(bab3);
        }
        if (level >= 15) {
            bab.add(bab4);
        }
        return bab;
    }

    @Override
    public int setFort(int level) {
        return 2 + level % 2;
    }

    @Override
    public int setWill(int level) {
        return level % 3;
    }

    @Override
    public int setRef(int level) {
        return level % 3;
    }

}
