package com.bookmrks.bookmarkerapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.time.Instant;

@Entity
@Table(name = "bookmarks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bookmark {

    @Id
    @SequenceGenerator(name = "bm_id_seq_gen", sequenceName = "bm_id_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "bm_id_seq")
    public Long id;


    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String title;

    private Instant createdAt;


}
