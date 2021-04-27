package board.service;

import java.util.List;

import board.dto.RestBoardDto;

public interface RestBoardService {
	List<RestBoardDto> selectRestBoardList() throws Exception;
	RestBoardDto selectRestBoardDetail(int boardIdx) throws Exception;
	void insertRestBoard(RestBoardDto data) throws Exception;
	void updateRestBoard(RestBoardDto data) throws Exception;
	void deleteRestBoard(int boardIdx) throws Exception;
}
