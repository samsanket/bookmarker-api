package com.bookmrks.bookmarkerapi;

import com.bookmrks.bookmarkerapi.domain.BookMarkRepository;
import com.bookmrks.bookmarkerapi.domain.Bookmark;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataIntilizer implements CommandLineRunner {
    @Autowired
    BookMarkRepository bookMarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookMarkRepository.save(new Bookmark(null, "url://1","title1", Instant.now()));
        bookMarkRepository.save(new Bookmark(null, "url://2","title2", Instant.now()));
        bookMarkRepository.save(new Bookmark(null, "url://3","title3", Instant.now()));
        bookMarkRepository.save(new Bookmark(null, "url://4","title4", Instant.now()));
        bookMarkRepository.save(new Bookmark(null, "url://5","title5", Instant.now()));
        bookMarkRepository.save(new Bookmark(null, "url://6","title6", Instant.now()));
        bookMarkRepository.save(new Bookmark(null, "url://7","title7", Instant.now()));
        bookMarkRepository.save(new Bookmark(null, "url://8","title8", Instant.now()));
    }
}
