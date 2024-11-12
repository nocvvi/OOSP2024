package ru.app.reports;

import ru.app.data.DataSource;

public class ChartReport extends Report {
    public ChartReport(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected void collectData() {
        System.out.println("Collecting data for chart report...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting data for chart...");
    }

    @Override
    protected void outputData() {
        System.out.println("Outputting chart report...");
    }
}