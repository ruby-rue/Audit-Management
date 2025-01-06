package controllers;

import models.Organization;
import utils.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class OrganizationController {
    private static final String ORGANIZATIONS_FILE = "data/organizations.txt";

    public void addOrganization(Organization organization) {
        FileHandler.writeToFile(ORGANIZATIONS_FILE, organization.getId() + "," + organization.getName());
    }

    public List<Organization> getOrganizations() {
        List<Organization> organizations = new ArrayList<>();
        for (String line : FileHandler.readFromFile(ORGANIZATIONS_FILE)) {
            String[] parts = line.split(",");
            organizations.add(new Organization(parts[0], parts[1]));
        }
        return organizations;
    }
}
