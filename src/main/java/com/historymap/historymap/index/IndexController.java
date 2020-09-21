package com.historymap.historymap.index;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.historymap.historymap.vo.location.Location;
import com.historymap.historymap.vo.position.Position;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IndexService indexService;
    
    @RequestMapping("/")
    public String index(Model model){
        String user_id = "0001";

        List<Location> list = indexService.getIndex(user_id);
        model.addAttribute("locationList", list);

        return "index";
    }

    @PostMapping("/save")
    @ResponseBody
    public String listSave(@RequestBody List<Map<String, Object>> list){
        String user_id = "0001";
        // int result = indexService.insertList(list, user_id);
        return "index";
    }
}
