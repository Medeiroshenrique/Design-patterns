package com.pontoevirgulasoftwaresolutions.director;

import com.pontoevirgulasoftwaresolutions.builders.ReportBuilder;

public class ReportDirector {
    public void construct(ReportBuilder builder){
        builder.buildHeader();
        builder.buildBody();
        builder.buildFooter();
    }
}
