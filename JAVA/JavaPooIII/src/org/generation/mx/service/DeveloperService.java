package org.generation.mx.service;

import org.generation.mx.modal.developer.Developer;

import java.util.ArrayList;
import java.util.List;

public class DeveloperService {

    private final List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public List<Developer> getDevelopers(){
        return developers;
    }

}
