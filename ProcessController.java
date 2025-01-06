package controllers;

import models.Process;
import utils.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class ProcessController {
    private static final String PROCESSES_FILE = "data/processes.txt";

    public void addProcess(Process process) {
        FileHandler.writeToFile(PROCESSES_FILE, process.getId() + "," + process.getName() + "," + process.getOrganizationId());
    }

    public List<Process> getProcesses() {
        List<Process> processes = new ArrayList<>();
        for (String line : FileHandler.readFromFile(PROCESSES_FILE)) {
            String[] parts = line.split(",");
            processes.add(new Process(parts[0], parts[1], parts[2]));
        }
        return processes;
    }
}
