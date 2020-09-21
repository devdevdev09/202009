package com.historymap.historymap.index;

import org.springframework.stereotype.Service;

import java.util.List;

import com.historymap.historymap.mapper.IndexMapper;
import com.historymap.historymap.vo.location.Location;
import com.historymap.historymap.vo.position.Position;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class IndexService {

    @Autowired
    private IndexMapper indexMapper;

	public List<Location> getIndex(String user_id) {
        return indexMapper.getIndex(user_id);
	}

	public int insertList(List<Position> list, String user_id) {
        int result = 0;

        try{
            for(Position position : list){
                indexMapper.insertList(position, user_id);
            }
            result = 1;
        }catch(Exception e){
            result = -1;
        }

		return result;
	}
    
}
