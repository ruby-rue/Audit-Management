package models;

public class Process {
    private String id;
    private String name;
    private String organizationId;

    public Process(String id, String name, String organizationId) {
        this.id = id;
        this.name = name;
        this.organizationId = organizationId;
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

    public String getOrganizationId() { 
        return organizationId; 
    }

    public void setOrganizationId(String organizationId) { 
        this.organizationId = organizationId; 
    }
}
