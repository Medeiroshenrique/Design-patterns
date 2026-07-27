package com.pontoevirgulasoftwaresolutions.products;

public class HtmlReport {
    private String content = "Focus on how the object is created, not in the object itself!";

    public void append (String text){
        content += text;
    }

    @Override
    public String toString() {
        return "HtmlReport{" +
                "content='" + content + '\'' +
                '}';
    }
}
