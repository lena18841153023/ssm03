package com.company.dao.idao;

import com.company.service.result.Report;

import java.util.List;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public interface ReportDao {
    List<Report>  showReport() throws  Exception;
}
