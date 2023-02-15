package com.bookmrks.bookmarkerapi.api;
import com.bookmrks.bookmarkerapi.domain.BookMarkService;
import com.bookmrks.bookmarkerapi.domain.Bookmark;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

    @Autowired
    BookMarkService bookMarkService;

    @GetMapping("/")
    public List<Bookmark> getBookmark(){
    return bookMarkService.getBookmark();
    }
}
