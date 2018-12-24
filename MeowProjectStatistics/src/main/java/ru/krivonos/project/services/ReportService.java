package ru.krivonos.project.services;

import ru.krivonos.project.interfaces.IBaseService;
import ru.krivonos.project.interfaces.IReportService;
import ru.krivonos.project.models.Project;
import ru.krivonos.project.models.ProjectStatistics;
import ru.krivonos.project.models.Report;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ReportService implements IReportService {

    private IBaseService<Project> projectService;
    private IBaseService<ProjectStatistics> projectStatisticsService;

    public ReportService(IBaseService<Project> projectService, IBaseService<ProjectStatistics> projectStatisticsService){

        this.projectService = projectService;
        this.projectStatisticsService = projectStatisticsService;
    }

    @Override
    public Report getWeeklyReport(int projectId, int weekNumber) {
        if (projectStatisticsService.getList() != null) {
            for (ProjectStatistics statistics : projectStatisticsService.getList()) {
                if (statistics.getWeekNumber() == weekNumber) {
                    return new Report(statistics);
                }
            }
        }
        return null;
    }

    @Override
    public Report getWeeklyReport(int projectId, Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);
        if (projectStatisticsService.getList() != null) {
            for (ProjectStatistics statistics : projectStatisticsService.getList()) {
                if (statistics.getWeekNumber() == weekNumber) {
                    return new Report(statistics);
                }
            }
        }
        return null;
    }

    @Override
    public List<Report> getReportsFromScope(int projectId, Date startDate, Date endDate) {
        List<Report> reports = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        int startingWeek = calendar.get(Calendar.WEEK_OF_YEAR);
        calendar.setTime(endDate);
        int endingWeek = calendar.get(Calendar.WEEK_OF_YEAR);
        Report reportBuffer = null;
        for (int i = startingWeek; i <= endingWeek ; i++) {
            reportBuffer = getWeeklyReport(projectId, i);
            if (reportBuffer != null) {
                reports.add(reportBuffer);
            }
        }
        return reports;
    }
}
