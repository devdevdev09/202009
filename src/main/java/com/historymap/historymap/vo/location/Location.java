package com.historymap.historymap.vo.location;

import lombok.Data;

@Data
public class Location {
    int id;
    String latitude;
    String longitude;
    String datetime;
    String user_id;
    String marker_id;
    boolean save = true;
}
