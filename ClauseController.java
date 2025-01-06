package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Clause;
import utils.FileHandler;

public class ClauseController {
    private static final String CLAUSES_FILE = "data/clauses.txt";

    public void addClause(Clause clause) {
        FileHandler.writeToFile(CLAUSES_FILE, clause.getId() + "," + clause.getName() + "," + clause.getStandardId());
    }

    public List<Clause> getClauses() {
        List<Clause> clauses = new ArrayList<>();
        for (String line : FileHandler.readFromFile(CLAUSES_FILE)) {
            String[] parts = line.split(",");
            clauses.add(new Clause(parts[0], parts[1], parts[2]));
        }
        return clauses;
    }
}
