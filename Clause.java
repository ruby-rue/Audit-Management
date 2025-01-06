package models;

import java.util.List;
import java.util.ArrayList;

public class Clause {
    private int id;
    private String code;
    private String description;
    private int standardId;
    private String name;
    private List<Clause> clauses;

    public Clause(int id, String code, String description, int standardId) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.standardId = standardId;
        this.clauses = new ArrayList<>();
    }

    public Clause(String id, String code, String description) {
        this.id = Integer.parseInt(id);
        this.code = code;
        this.description = description;
        this.clauses = new ArrayList<>();
    }

    public int getId() { 
        return id; 
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public String getCode() { 
        return code; 
    }

    public void setCode(String code) { 
        this.code = code; 
    }

    public String getDescription() { 
        return description; 
    }

    public void setDescription(String description) { 
        this.description = description; 
    }

    public int getStandardId() { 
        return standardId; 
    }

    public void setStandardId(int standardId) { 
        this.standardId = standardId; 
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
