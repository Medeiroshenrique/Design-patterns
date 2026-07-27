package com.pontoevirgulasoftwaresolutions.builders;

import com.lowagie.text.Document;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileOutputStream;


public class PdfReportBuilder implements ReportBuilder
{
    private Document document;
    private PdfWriter writer;

    public PdfReportBuilder (String fileName){
        try {
            document = new Document();
            writer = PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void buildHeader() {
        try {
            document.add(new Paragraph("Report in PDF"));
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void buildBody() {
        try {
            document.add(new Paragraph("Revenue: $1000"));
            document.add(new Paragraph("Profit: $300"));
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void buildFooter() {
        try{
            document.add(new Paragraph("==============================="));
            document.add(new Paragraph("Generated using the PdfReportBuilder"));
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }

    public void getResult(){
        document.close();
    }
}
