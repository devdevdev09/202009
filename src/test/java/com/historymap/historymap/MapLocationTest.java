package com.historymap.historymap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.historymap.historymap.date.utils.Utils;

import org.junit.jupiter.api.Test;

public class MapLocationTest {

    public void getEqualseResult(String input, boolean result){
        boolean _result = Utils.timeCheck(input);
        assertEquals(result, _result);
    }
    
    @Test
    public void timeTextMatchTest(){
        
        getEqualseResult("2020-09-01 12:00:00", true);
        
        getEqualseResult("", false);
        getEqualseResult(null, false);
        getEqualseResult("2020090125:00:00", false);
        getEqualseResult("2020-09-0125:00:00", false);
        getEqualseResult("2020-09-01 25:00:00", false);
        getEqualseResult("2020-09-01 25:00:OO", false);
        getEqualseResult("2020:09:01 25-00-00", false);
        getEqualseResult("2020:09:01 24:00:00", false);
        getEqualseResult("0000-13-01 23:00:00", false);
    }
}
