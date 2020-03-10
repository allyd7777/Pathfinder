package com.adonahue.pathfinder.dto;

import java.util.List;

/**
 *
 * @author allison
 */
public interface Class {

    //HP - assign hitDie and get random health each level
    int setHP(int level);//set the initial HP based on max HitDie

    //Gold - assign die and get random money at level 1
    int setInitGold();//set initial Gold based on random Die roll   

    //class skills - set class skills for each class and set up bonuses
    List<String> setClassSkills();

    //BAB - set BAB based on lvl
    List<Integer> setBAB(int level);

    //Fortitude - set fort based on lvl
    int setFort(int level);

    //Will - set based on lvl
    int setWill(int level);

    //Reflex - set based on lvl
    int setRef(int level);

    //add extra stats and abilities based on class and lvl
}
