package com.pontoevirgulasoftwaresolutions.products;


public class PdfReport {
    private String content = "It's easier than it looks, just focus on the process of creation instead of the object itself!";

    public void append (String text){
        content += text;
    }

    @Override
    public String toString() {
        return "PdfReport{" +
                "content='" + content + '\'' +
                '}';
    }
}
