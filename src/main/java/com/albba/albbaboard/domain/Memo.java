package com.albba.albbaboard.domain;

import com.albba.albbaboard.model.MemoDto;
import com.albba.albbaboard.model.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Memo extends Timestamp {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable= false)
    private String contents;


    public Memo(String title, String contents)
    {
        this.title = title;
        this.contents=contents;
    }
    public Memo(MemoDto memoDto)
    {
        this.title = memoDto.getTitle();
        this.contents = memoDto.getContents();
    }

}
