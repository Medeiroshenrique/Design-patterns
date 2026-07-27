package com.pontoevirgulasoftwaresolutions.products;

public class TextReport {
    private String content = "Pay atention in the PROCESS, not in the object itself!";

    public void append (String text){
        content += text;
    }

    @Override
    public String toString() {
        return "TextReport{" +
                "content='" + content + '\'' +
                '}';
    }
}
