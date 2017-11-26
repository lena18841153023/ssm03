package com.company.service.impl;

import com.company.dao.idao.ReportDao;
import com.company.service.iservice.ReportService;
import com.company.service.result.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
@Service("reportService")
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportDao reportDao;
    @Override
    public List<Report> showReport() {
        List<Report> list = null;
        try {
           list = reportDao.showReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
