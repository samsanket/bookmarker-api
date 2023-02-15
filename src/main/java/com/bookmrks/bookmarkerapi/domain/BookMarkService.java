package com.bookmrks.bookmarkerapi.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookMarkService {
 @Autowired
 BookMarkRepository bookMarkRepository;

    @Transactional(readOnly = true)
    public List<Bookmark> getBookmark(){
        return bookMarkRepository.findAll();
    }

}
