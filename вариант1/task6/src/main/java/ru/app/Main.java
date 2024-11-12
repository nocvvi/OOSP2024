package ru.app;

import ru.app.data.DataSource;
import ru.app.reports.ChartReport;
import ru.app.reports.Report;
import ru.app.reports.TextReport;
import ru.app.reports.TableReport;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();

        Report chartReport = new ChartReport(dataSource);
        chartReport.generate();

        Report textReport = new TextReport(dataSource);
        textReport.generate();

        Report tableReport = new TableReport(dataSource);
        tableReport.generate();
    }
}