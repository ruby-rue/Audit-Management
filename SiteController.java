package controllers;

import models.Site;
import utils.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class SiteController {
    private static final String SITES_FILE = "data/sites.txt";

    public void addSite(Site site) {
        FileHandler.writeToFile(SITES_FILE, site.getId() + "," + site.getName() + "," + site.getOrganizationId());
    }

    public List<Site> getSites() {
        List<Site> sites = new ArrayList<>();
        for (String line : FileHandler.readFromFile(SITES_FILE)) {
            String[] parts = line.split(",");
            sites.add(new Site(parts[0], parts[1], parts[2]));
        }
        return sites;
    }
}
