package com.albba.albbaboard.controller;

import com.albba.albbaboard.domain.Memo;
import com.albba.albbaboard.model.MemoDto;
import com.albba.albbaboard.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {
//ㅇㅇ
    private final BoardService boardService;
    //메모 전체 읽어오기
    @GetMapping("/albba")
    public List<Memo> getMemos() throws SQLException {
        return boardService.getMemos();
    }

    //메모 수정
    //@Secured(value= UserRoleEnum.Authority.ADMIN)
    @PutMapping("/albba/{id}")
    public Long modifyMemo(@PathVariable Long id, @RequestBody MemoDto memoDto)
    {
        return boardService.modifyMemo(id,memoDto).getId();

    }
    //메모 저장하는거
    //@Secured(value= UserRoleEnum.Authority.ADMIN)
    @PostMapping("/albba")
    public Memo createMemo(@RequestBody MemoDto memoDto)
    {
        return boardService.createMemo(memoDto);
    }
}
