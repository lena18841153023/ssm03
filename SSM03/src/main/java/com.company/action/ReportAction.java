package com.company.action;

import com.company.service.iservice.ReportService;
import com.company.service.result.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/26.
 */
@Controller
@RequestMapping("report")
public class ReportAction {
    @Autowired
    private ReportService reportService;

    @RequestMapping(value = "show",method = RequestMethod.GET)
    @ResponseBody
    public List<Report> show(){
        List<Report> list=new ArrayList<Report>();
        list=reportService.showReport();
        return list;

    }
}