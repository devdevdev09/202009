package com.historymap.historymap.mapper;

import java.util.List;

import com.historymap.historymap.vo.location.Location;
import com.historymap.historymap.vo.position.Position;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IndexMapper {
    List<Location> getIndex(String user_id);
    int insertList(Location location);
}
