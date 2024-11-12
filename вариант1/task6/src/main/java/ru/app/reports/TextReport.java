package ru.app.reports;

import ru.app.data.DataSource;

public class TextReport extends Report {
    public TextReport(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected void collectData() {
        System.out.println("Collecting data for text report...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting data as plain text...");
    }

    @Override
    protected void outputData() {
        System.out.println("Outputting text report...");
    }
}