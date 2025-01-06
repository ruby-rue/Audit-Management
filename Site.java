package models;

import java.util.List;
import java.util.ArrayList;

public class Site {
    private int id;
    private String name;
    private int organizationId;
    private List<Site> sites;
    private List<Process> processes;

    public Site(int id, String name, int organizationId) {
        this.id = id;
        this.name = name;
        this.organizationId = organizationId;
        this.sites = new ArrayList<>();
        this.processes = new ArrayList<>();
    }

    public Site(String id, String name, String organizationId) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.organizationId = Integer.parseInt(organizationId);
        this.sites = new ArrayList<>();
        this.processes = new ArrayList<>();
    }

    // Getters and setters
    public int getId() { 
        return id; 
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public int getOrganizationId() { 
        return organizationId; 
    }

    public void setOrganizationId(int organizationId) { 
        this.organizationId = organizationId; 
    }

    public List<Site> getSites() { 
        return sites; 
    }

    public void setSites(List<Site> sites) { 
        this.sites = sites; 
    }

    public List<Process> getProcesses() { 
        return processes; 
    }

    public void setProcesses(List<Process> processes) { 
        this.processes = processes; 
    }
}
