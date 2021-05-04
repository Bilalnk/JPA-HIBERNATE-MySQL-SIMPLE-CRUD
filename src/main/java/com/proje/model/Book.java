package com.proje.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Book {

    @Id
    private int bookId;
    private String name;
    private int pageCount;
    private String topic;
    private String author;

    @Temporal(TemporalType.DATE)
    private Date publisherDate;

    public Book() {
    }

    public Book(int bookId, String name, int pageCount, String topic, String author, Date publisherDate) {
        this.bookId = bookId;
        this.name = name;
        this.pageCount = pageCount;
        this.topic = topic;
        this.author = author;
        this.publisherDate = publisherDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublisherDate() {
        return publisherDate;
    }

    public void setPublisherDate(Date publisherDate) {
        this.publisherDate = publisherDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", topic='" + topic + '\'' +
                ", author='" + author + '\'' +
                ", publisherDate=" + publisherDate +
                '}';
    }
}
