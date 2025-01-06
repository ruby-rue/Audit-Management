package controllers;

import models.Audit;
import utils.FileHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AuditController {
    private static final String AUDITS_FILE = "data/audits.txt";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public void addAudit(Audit audit) {
        FileHandler.writeToFile(AUDITS_FILE, audit.getId() + "," + audit.getOrganizationId() + "," + audit.getAuditType() + "," + DATE_FORMAT.format(audit.getAuditDate()));
    }

    public List<Audit> getAudits() {
        List<Audit> audits = new ArrayList<>();
        for (String line : FileHandler.readFromFile(AUDITS_FILE)) {
            String[] parts = line.split(",");
            try {
                audits.add(new Audit(parts[0], parts[1], parts[2], DATE_FORMAT.parse(parts[3])));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return audits;
    }
}
