package com.albba.albbaboard.service;

import com.albba.albbaboard.domain.Memo;
import com.albba.albbaboard.model.MemoDto;
import com.albba.albbaboard.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;


    //게시판 글 쓰기
    public Memo createMemo(MemoDto memoDto)
    {
        Memo memo = new Memo(memoDto);
        boardRepository.save(memo);

        return memo;
    }

    //게시판 글 수정
    public Memo modifyMemo(Long id,MemoDto memoDto)
    {
        Memo memo = boardRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("해당 메모가 존재하지 않습니다."));
        memo.setContents(memoDto.getTitle());
        memo.setTitle(memoDto.getTitle());
        boardRepository.save(memo);
        return memo;
    }

    public List<Memo> getMemos() throws SQLException {
        List<Memo> memos = boardRepository.findAll();
        return memos;
    }
    //게시판 글 삭제

    //
}