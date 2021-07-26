package com.test.ApiTestAutomationFramework.domain;

import java.util.List;

public class Source {

    private List<String> measures;
    private List<Annotation> annotations;
    private String name;
    private List<String> substitutions;

    public Source(List<String> measures, List<Annotation> annotations, String name, List<String> substitutions) {
        this.measures = measures;
        this.annotations = annotations;
        this.name = name;
        this.substitutions = substitutions;
    }

    public List<String> getMeasures() {
        return measures;
    }

    public void setMeasures(List<String> measures) {
        this.measures = measures;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubstitutions() {
        return substitutions;
    }

    public void setSubstitutions(List<String> substitutions) {
        this.substitutions = substitutions;
    }
}
