package com.green.SecondLife.community.service;

import com.green.SecondLife.community.vo.BoardFreeListVO;

import java.util.List;

public interface CommunityService {
    //자유게시판 목록 조회
    public List<BoardFreeListVO> selectFreeBoardList(BoardFreeListVO boardFreeListVO);
    //자유게시판 글 등록
    public int insertFreeBoard(BoardFreeListVO boardFreeListVO);
    //자유게시판 글 상세조회
    public BoardFreeListVO selectFreeBoardDetail(int freeBoardNum);
    //자유게시판 글 삭제
    public int deleteFreeBoard(int freeBoardNum);
    //자유게시판 글 수정
    public int updateFreeBoard(BoardFreeListVO boardFreeListVO);
    //자유게시판 조회수 증가
    public int updateFreeBoardCnt(int freeBoardNum);
    //자유게시판 댓글 목록 조회
    public List<BoardFreeListVO> selectFreeBoardComment();
}
