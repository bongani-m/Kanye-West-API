package com.bonganimbigi;

import jdk.nashorn.internal.runtime.QuotedStringTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Bongani on 9/19/2016.
 */

@RestController
@RequestMapping("/api")
public class YeController {

    @Autowired
    private QuoteRepository quoteRepository;

    @RequestMapping("/quotes")
    public List<Quote> hello() {
        return quoteRepository.getQuotes();
    }
}
