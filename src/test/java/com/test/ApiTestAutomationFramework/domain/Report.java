package com.test.ApiTestAutomationFramework.domain;

import java.util.List;

public class Report {

    private List<Data> data;
    private List<String> source;

    public Report(List<Data> data, List<String> source) {
        this.data = data;
        this.source = source;
    }

    public List<String> getSource() {
        return source;
    }

    public void setSource(List<String> source) {
        this.source = source;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
