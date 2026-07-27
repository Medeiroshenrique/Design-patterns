package com.pontoevirgulasoftwaresolutions;

import com.pontoevirgulasoftwaresolutions.builders.PdfReportBuilder;
import com.pontoevirgulasoftwaresolutions.director.ReportDirector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ReportDirector director = new ReportDirector();

        PdfReportBuilder pdfBuilder = new PdfReportBuilder("teste.pdf");

        director.construct(pdfBuilder);

        pdfBuilder.getResult();

    }
}
