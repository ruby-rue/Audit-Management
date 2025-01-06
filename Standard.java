package models;

import java.util.List;
import java.util.ArrayList;

public class Standard {
    private String id;
    private String name;
    private List<Clause> clauses;

    public Standard(String id, String name) {
        this.id = id;
        this.name = name;
        this.clauses = new ArrayList<>();
    }

    public String getId() { 
        return id; 
    }

    public void setId(String id) { 
        this.id = id; 
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public List<Clause> getClauses() { 
        return clauses; 
    }

    public void setClauses(List<Clause> clauses) { 
        this.clauses = clauses; 
    }
}
