package com.geekbrains.Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(new Human(0,1));
        humansList.add(new Human(0,2));
        humansList.add(new Human(1,3));
        humansList.add(new Human(3,4));
        humansList.add(new Human(4,5));
        humansList.add(new Human(0,6));

        for (int i = 0; i < humansList.size(); i++) {
            for (Human h: humansList) {
                if(h.getParentID() == i){
                    for (Human children: humansList) {
                        if(h.getEntityID() == children.getParentID()){
                            h.addChildren(children);
                        }
                    }
                }
            }
        }

        for (Human h: humansList) {
            System.out.print("humanID = " + h.getId() + " parent = " + h.getParentID() + " -> ");
            if (h.getChildren().size() == 0){
                System.out.print("none child");
                System.out.println();
            } else {
                h.printChildren();
            }
        }


    }
}