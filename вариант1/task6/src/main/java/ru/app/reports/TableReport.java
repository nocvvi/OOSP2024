package ru.app.reports;

import ru.app.data.DataSource;

public class TableReport extends Report {
    public TableReport(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected void collectData() {
        System.out.println("Collecting data for table report...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting data as table...");
    }

    @Override
    protected void outputData() {
        System.out.println("Outputting table report...");
    }
}