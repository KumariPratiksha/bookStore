package com.pratiksha.author;

import com.pratiksha.author.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")

public class authoeController {

    autoeRepository repo = new autoeRepository();

    @PostMapping("/add-book")
    public ResponseEntity addBook(@RequestBody Book book){
         String result=repo.addBook(book);
        return new ResponseEntity<>( result,HttpStatus.CREATED);

    }

    @PostMapping("/add-author")
    public ResponseEntity addAuthor(@RequestBody Author author){
         String result = repo.addAuthor(author);
        return new ResponseEntity<>(result,HttpStatus.CREATED);
    }
}
