package com.geekbrains.Test;

import java.util.ArrayList;

public class Human {
    private static int id = 0;
    private int humanId;
    private int parentID;
    private int entityID;
    private ArrayList<Human> children;

    public Human(int parentID, int entityID) {
        id++;
        this.humanId = id;
        this.parentID = parentID;
        this.entityID = entityID;
        this.children = new ArrayList<>();
    }

    public int getParentID() {
        return parentID;
    }

    public int getEntityID() {
        return entityID;
    }

    public int getId() {
        return this.humanId;
    }

    public void addChildren(Human human){
        this.children.add(human);
    }

    public ArrayList<Human> getChildren(){
        return children;
    }

    public void printChildren(){
        for (Human h: children) {
            System.out.println("childID = " + h.getEntityID());
        }
    }
}