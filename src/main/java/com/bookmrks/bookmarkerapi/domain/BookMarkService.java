package com.bookmrks.bookmarkerapi.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookMarkService {
 @Autowired
 BookMarkRepository bookMarkRepository;

 @Autowired
 BookmarkMapper bookmarkMapper;


    @Transactional(readOnly = true)
    public BookMarksDto getBookmark(Integer page){
        int pageNo = page < 1 ?0 :page -1;
        Pageable pageable= PageRequest.of(pageNo,10, Sort.Direction.ASC,"createdAt");
        Page<BookmarkDTO> bookmarkDTOPage= bookMarkRepository.findBy(pageable);
        return new BookMarksDto(bookmarkDTOPage);
    }

}
