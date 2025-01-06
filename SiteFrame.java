package gui;

import controllers.SiteController;
import models.Site;

import javax.swing.*;
import java.awt.*;

public class SiteFrame extends JFrame {
    private SiteController controller;

    public SiteFrame() {
        controller = new SiteController();

        setTitle("Manage Sites");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton addSiteButton = new JButton("Add Site");
        addSiteButton.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Site ID:");
            String name = JOptionPane.showInputDialog("Enter Site Name:");
            String orgId = JOptionPane.showInputDialog("Enter Organization ID:");
            controller.addSite(new Site(id, name, orgId));
            JOptionPane.showMessageDialog(this, "Site added!");
        });

        JButton listSitesButton = new JButton("List Sites");
        listSitesButton.addActionListener(e -> {
            StringBuilder siteList = new StringBuilder();
            for (Site site : controller.getSites()) {
                siteList.append(site.getId()).append(" - ").append(site.getName())
                        .append(" (Organization: ").append(site.getOrganizationId()).append(")\n");
            }
            JOptionPane.showMessageDialog(this, siteList.toString(), "Sites", JOptionPane.INFORMATION_MESSAGE);
        });

        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
        panel.add(addSiteButton);
        panel.add(listSitesButton);
        add(panel);

        setVisible(true);
    }

}
