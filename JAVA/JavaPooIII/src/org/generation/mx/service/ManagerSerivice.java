package org.generation.mx.service;

import org.generation.mx.modal.manager.Manager;

import java.util.ArrayList;
import java.util.List;

public class ManagerSerivice {

    private List<Manager> managers = new ArrayList<>();

    public ManagerSerivice(){

    }

    // Metodos Manageer
    public void addManager(Manager manager){
        managers.add(manager);
    }

    //Mostrar Lista
    public List<Manager> getManagers(){
        return managers;
    }
}
