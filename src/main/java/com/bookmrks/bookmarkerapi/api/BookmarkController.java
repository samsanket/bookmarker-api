package com.bookmrks.bookmarkerapi.api;
import com.bookmrks.bookmarkerapi.domain.BookMarkService;
import com.bookmrks.bookmarkerapi.domain.BookMarksDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

    @Autowired
    BookMarkService bookMarkService;

    @GetMapping("/")
    public BookMarksDto getBookmark(@RequestParam(name = "page", defaultValue = "1") Integer page){
    return bookMarkService.getBookmark(page);
    }
}
