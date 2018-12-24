package ru.krivonos.project.interfaces;

import ru.krivonos.project.models.Report;

import java.util.Date;
import java.util.List;

public interface IReportService {


    Report getWeeklyReport(int projectId, int WeekNumber);

    Report getWeeklyReport(int projectId, Date date);

    List<Report> getReportsFromScope(int projectId, Date startDate, Date endDate);
}
