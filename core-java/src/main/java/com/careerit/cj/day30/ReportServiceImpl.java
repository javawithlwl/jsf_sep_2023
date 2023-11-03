package com.careerit.cj.day30;

import java.io.Serializable;

abstract  class AbstractReportService {
    public abstract void generateReport();
}
public class ReportServiceImpl extends AbstractReportService implements Serializable,Cloneable {

    public void generateReport(){
        System.out.println("Generate report");
    }
}
