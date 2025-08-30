package com.aej.cecarticulo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@Document("Articulos")
public class ArticuloModel {
    @Id
    private String id;
    private String title;
    private String summary;
    private String publishedDate;
    private List<String> authors;
    private List<String> categories;
    private String pdfUrl;
    private String text;




    public ArticuloModel(String id, String title, String summary, List<String> authors, String publishedDate, List<String> categories, String pdfUrl, String text) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.categories = categories;
        this.pdfUrl = pdfUrl;
        this.text = text;
    }

    public ArticuloModel() {}
}
