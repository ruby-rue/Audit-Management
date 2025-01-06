package models;

import java.util.Date;

public class Audit {
    private int id;
    private String name;
    private int organizationId;
    private int standardId;
    private Date auditDate;
    private String status;

    public Audit(int id, String name, int organizationId, int standardId, Date auditDate) {
        this.id = id;
        this.name = name;
        this.organizationId = organizationId;
        this.standardId = standardId;
        this.auditDate = auditDate;
        this.status = "New";
    }

    public Audit(String id, String organizationId, String standardId, Date auditDate) {
        this.id = Integer.parseInt(id);
        this.organizationId = Integer.parseInt(organizationId);
        this.standardId = Integer.parseInt(standardId);
        this.auditDate = auditDate;
        this.status = "New";
    }

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

    public int getStandardId() { 
        return standardId; 
    }

    public void setStandardId(int standardId) { 
        this.standardId = standardId; 
    }

    public Date getAuditDate() { 
        return auditDate; 
    }

    public void setAuditDate(Date auditDate) { 
        this.auditDate = auditDate; 
    }

    public String getStatus() { 
        return status; 
    }

    public void setStatus(String status) { 
        this.status = status; 
    }
}
