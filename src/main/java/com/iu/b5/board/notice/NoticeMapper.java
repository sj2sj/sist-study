package com.iu.b5.board.notice;

import org.apache.ibatis.annotations.Mapper;

import com.iu.b5.board.BoardMapper;

//인터페이스 안의 메서드를 구현하는 것이 아니라 그대로 들고오는거기 때문에 상속으로!!
@Mapper
public interface NoticeMapper extends BoardMapper {

}
