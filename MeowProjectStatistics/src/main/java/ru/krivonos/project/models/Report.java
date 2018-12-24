package ru.krivonos.project.models;

import java.math.BigDecimal;

public class Report {
    private BigDecimal budgetSpent;

    private BigDecimal salarySpending;

    private BigDecimal maintenanceSpending;

    private boolean deadlineReached;

    private int efficiencyMark;

    public Report(ProjectStatistics projectStatistics) {
        this.budgetSpent = projectStatistics.getBudgetSpent();
        this.salarySpending = projectStatistics.getSalarySpending();
        this.maintenanceSpending = projectStatistics.getMaintenanceSpending();
        this.deadlineReached = projectStatistics.isDeadlineReached();
        this.efficiencyMark = projectStatistics.getEfficiencyMark();
    }

    public BigDecimal getBudgetSpent() {
        return budgetSpent;
    }

    public BigDecimal getSalarySpending() {
        return salarySpending;
    }

    public BigDecimal getMaintenanceSpending() {
        return maintenanceSpending;
    }

    public boolean isDeadlineReached() {
        return deadlineReached;
    }

    public int getEfficiencyMark() {
        return efficiencyMark;
    }
}

