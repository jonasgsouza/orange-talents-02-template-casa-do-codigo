package br.com.zup.casadocodigo.controller.response;

import br.com.zup.casadocodigo.model.Book;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BookDetailResponse {

    private Long id;

    private String title;

    private String resume;

    private String summary;

    private BigDecimal price;

    private Integer pageCount;

    private String isbn;

    private LocalDate publishDate;

    private AuthorResponse author;

    private CategoryResponse category;

    public BookDetailResponse(Book book) {
        id = book.getId();
        title = book.getTitle();
        resume = book.getResume();
        summary = book.getSummary();
        price = book.getPrice();
        pageCount = book.getPageCount();
        isbn = book.getIsbn();
        publishDate = book.getPublishDate();
        author = new AuthorResponse(book.getAutor());
        category = new CategoryResponse(book.getCategoria());
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getResume() {
        return resume;
    }

    public String getSummary() {
        return summary;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public AuthorResponse getAuthor() {
        return author;
    }

    public CategoryResponse getCategory() {
        return category;
    }

}
