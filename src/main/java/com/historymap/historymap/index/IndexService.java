package com.historymap.historymap.index;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
	public int insertList(List<Location> list, String user_id) {
        int result = 0;

        try{
            for(Location location : list){
                location.setUser_id(user_id);
                result = indexMapper.insertList(location);
                // System.out.println(location.getLatitude());
                if(result <= 0){
                    result = -1;
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            result = -1;
        }

		return result;
	}
    
}
