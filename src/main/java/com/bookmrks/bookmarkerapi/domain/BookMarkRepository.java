package com.bookmrks.bookmarkerapi.domain;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BookMarkRepository  extends JpaRepository<Bookmark,Long> {

}
