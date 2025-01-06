package gui;

import controllers.OrganizationController;
import models.Organization;

import javax.swing.*;
import java.awt.*;

public class OrganizationFrame extends JFrame {
    private OrganizationController controller;

    public OrganizationFrame() {
        controller = new OrganizationController();

        setTitle("Manage Organizations");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton addOrgButton = new JButton("Add Organization");
        addOrgButton.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Organization ID:");
            String name = JOptionPane.showInputDialog("Enter Organization Name:");
            controller.addOrganization(new Organization(id, name));
            JOptionPane.showMessageDialog(this, "Organization added!");
        });

        JButton listOrgButton = new JButton("List Organizations");
        listOrgButton.addActionListener(e -> {
            StringBuilder orgList = new StringBuilder();
            for (Organization org : controller.getOrganizations()) {
                orgList.append(org.getId()).append(" - ").append(org.getName()).append("\n");
            }
            JOptionPane.showMessageDialog(this, orgList.toString(), "Organizations", JOptionPane.INFORMATION_MESSAGE);
        });

        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
        panel.add(addOrgButton);
        panel.add(listOrgButton);
        add(panel);

        setVisible(true);
    }
}
