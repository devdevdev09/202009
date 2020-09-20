package com.historymap.historymap.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IndexMapper {
    List<HashMap<String, String>> getIndex();
}
