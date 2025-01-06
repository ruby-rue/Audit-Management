package gui;

import javax.swing.*;
import java.awt.*;

public class AdminFrame extends JFrame {
    public AdminFrame() {
        setTitle("Admin Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton manageOrganizationsButton = new JButton("Manage Organizations");
        manageOrganizationsButton.addActionListener(e -> new OrganizationFrame());

        JButton manageSitesButton = new JButton("Manage Sites");
        manageSitesButton.addActionListener(e -> new SiteFrame());

        JButton manageAuditsButton = new JButton("Manage Audits");
        manageAuditsButton.addActionListener(e -> new AuditFrame());

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.add(manageOrganizationsButton);
        panel.add(manageSitesButton);
        panel.add(manageAuditsButton);

        add(panel);
        setVisible(true);
    }
}
