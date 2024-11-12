package ru.app.reports;

import ru.app.data.DataSource;

public abstract class Report {
    protected DataSource dataSource;

    public Report(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public final void generate() {
        collectData();
        formatData();
        outputData();
    }

    protected abstract void collectData();
    protected abstract void formatData();
    protected abstract void outputData();
}