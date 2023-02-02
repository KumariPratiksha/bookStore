package com.pratiksha.author;
import com.pratiksha.author.Author;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

public class autoeRepository {
    private  HashMap<String, Book> bookList = new HashMap<>();
     private HashMap<String, Author> authorList = new HashMap<>();

    public String addBook( Book book){
        if(bookList.containsKey(book.getName())){
            return " book already present";
        }
        bookList.put(book.getName(),book);
        return "Book added";


    }
    public String addAuthor( Author author){
        if(authorList.containsKey(author.getName())){
            return " author already present";
        }
        authorList.put(author.getName(),author);
        return "Author added";


    }





}
