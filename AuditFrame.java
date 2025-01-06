package gui;

import controllers.AuditController;
import models.Audit;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class AuditFrame extends JFrame {
    private AuditController controller;

    public AuditFrame() {
        controller = new AuditController();

        setTitle("Manage Audits");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton addAuditButton = new JButton("Add Audit");
        addAuditButton.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Audit ID:");
            String orgId = JOptionPane.showInputDialog("Enter Organization ID:");
            String auditorId = JOptionPane.showInputDialog("Enter Auditor ID:");
            controller.addAudit(new Audit(id, orgId, auditorId, new Date()));
            JOptionPane.showMessageDialog(this, "Audit added!");
        });

        JButton listAuditsButton = new JButton("List Audits");
        listAuditsButton.addActionListener(e -> {
            StringBuilder auditList = new StringBuilder();
            for (Audit audit : controller.getAudits()) {
                auditList.append(audit.getId()).append(" - ").append(audit.getOrganizationId())
                        .append(" (Auditor: ").append(audit.getAuditorId()).append(")\n");
            }
            JOptionPane.showMessageDialog(this, auditList.toString(), "Audits", JOptionPane.INFORMATION_MESSAGE);
        });

        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
        panel.add(addAuditButton);
        panel.add(listAuditsButton);
        add(panel);

        setVisible(true);
    }
}
