package com.adonahue.pathfinder.controller;

import com.adonahue.pathfinder.ui.PathfinderView;
import com.adonahue.pathfinder.dto.Character;
/**
 *
 * @author allison
 */
public class PathfinderController {

    private PathfinderView view = new PathfinderView();

    public void run() {

        //Menu Selection
        //1. Create New Character
        //2. Level Character
        //3. Edit Character
        //4. Exit
        boolean keepGoing = true;
        int menuSelection;

        while (keepGoing) {

            menuSelection = view.getMenuSelection();

            switch (menuSelection) {
                case 1:
                    createCharacter();
                    break;
                case 2:
                    levelCharacter();
                    break;
                case 3:
                    editCharacter();
                    break;
                case 4:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
    }

    private void createCharacter() {
        String race = view.getRaceChoice();        
        String cClass = view.getClassChoice();
        Character character = new Character(race,cClass);
        character.setAbiltiyScores(view.enterAbilityScores());
        
    }

    private void levelCharacter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void editCharacter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void unknownCommand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
