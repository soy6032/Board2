package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dto.RestBoardDto;
import board.mapper.RestBoardMapper;

@Service
public class RestBoardServiceImpl implements RestBoardService {
	@Autowired
	private RestBoardMapper restBoardMapper;
	
	@Override
	public List<RestBoardDto> selectRestBoardList() throws Exception {
		return restBoardMapper.selectRestBoardList();
	}
	
	@Override
	public RestBoardDto selectRestBoardDetail(int boardIdx) throws Exception {
		restBoardMapper.updateRestHitCount(boardIdx);
		
		return restBoardMapper.selectRestBoardDetail(boardIdx);
	}
	
	@Override
	public void insertRestBoard(RestBoardDto data) throws Exception {
		restBoardMapper.insertRestBoard(data);
	}
	
	@Override
	public void updateRestBoard(RestBoardDto data) throws Exception {
		restBoardMapper.updateRestBoard(data);
	}
	
	@Override
	public void deleteRestBoard(int boardIdx) throws Exception {
		restBoardMapper.deleteRestBoard(boardIdx);
	}
}
