package com.historymap.historymap.index;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

import com.historymap.historymap.mapper.IndexMapper;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class IndexService {

    @Autowired
    private IndexMapper indexMapper;

	public List<HashMap<String, String>> getIndex() {
        return indexMapper.getIndex();
	}
    
}
