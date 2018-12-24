package ru.krivonos.project.models;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class ProjectStatistics {

    public int id;

    public int projectId;

    private final Date dateOfCreation;

    private BigDecimal budgetSpent;

    private BigDecimal salarySpending;

    private BigDecimal maintenanceSpending;

    private boolean deadlineReached;

    private int efficiencyMark;

    private int weekNumber;

    public ProjectStatistics(int projectId) {
        this.projectId = projectId;
        dateOfCreation = new Date();
        Calendar calendar = Calendar.getInstance();
        weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public int getEfficiencyMark() {
        return efficiencyMark;
    }

    public void setEfficiencyMark(int efficiencyMark) {
        this.efficiencyMark = efficiencyMark;
    }

    public boolean isDeadlineReached() {
        return deadlineReached;
    }

    public void setDeadlineReached(boolean deadlineReached) {
        this.deadlineReached = deadlineReached;
    }

    public BigDecimal getBudgetSpent() {
        return budgetSpent;
    }

    public void setBudgetSpent(BigDecimal budgetSpent) {
        this.budgetSpent = budgetSpent;
    }

    public BigDecimal getSalarySpending() {
        return salarySpending;
    }

    public void setSalarySpending(BigDecimal salarySpending) {
        this.salarySpending = salarySpending;
    }

    public BigDecimal getMaintenanceSpending() {
        return maintenanceSpending;
    }

    public void setMaintenanceSpending(BigDecimal maintenanceSpending) {
        this.maintenanceSpending = maintenanceSpending;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public int getWeekNumber() {
        return weekNumber;
    }
}
