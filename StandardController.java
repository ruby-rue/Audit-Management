package controllers;

import models.Standard;
import utils.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class StandardController {
    private static final String STANDARDS_FILE = "data/standards.txt";

    public void addStandard(Standard standard) {
        FileHandler.writeToFile(STANDARDS_FILE, standard.getId() + "," + standard.getName());
    }

    public List<Standard> getStandards() {
        List<Standard> standards = new ArrayList<>();
        for (String line : FileHandler.readFromFile(STANDARDS_FILE)) {
            String[] parts = line.split(",");
            standards.add(new Standard(parts[0], parts[1]));
        }
        return standards;
    }
}
