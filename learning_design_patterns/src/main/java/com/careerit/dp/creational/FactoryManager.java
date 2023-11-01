package com.careerit.dp.creational;

enum ReportLevel{
    BASIC, DETAILED
}

enum ReportType {
    EXCEL, PDF, CSV
}

interface ReportGenerator {
    void printReport(String message);
}

class DetailedExcelReport implements ReportGenerator {
    @Override
    public void printReport(String message) {
        System.out.println("Detailed Excel report :"+message);
    }
}
class DetailedPdfReport implements ReportGenerator {
    @Override
    public void printReport(String message) {
        System.out.println("Detailed Pdf report :"+message);
    }
}
class DetailedCsvReport implements ReportGenerator {
    @Override
    public void printReport(String message) {
        System.out.println("Detailed Csv report :"+message);
    }
}


class ExcelReport implements ReportGenerator {
    @Override
    public void printReport(String message) {
        System.out.println("Excel report :"+message);
    }
}
class PdfReport implements ReportGenerator {
    @Override
    public void printReport(String message) {
        System.out.println("Pdf report :"+message);
    }
}
class CsvReport implements ReportGenerator {
    @Override
    public void printReport(String message) {
        System.out.println("Csv report :"+message);
    }
}

abstract class AbstractFactory {
    abstract ReportGenerator getReportGenerator(ReportType reportType);
}
class BasicReportFactory extends AbstractFactory {
    @Override
    public ReportGenerator getReportGenerator(ReportType reportType){
        return switch (reportType) {
            case EXCEL -> new ExcelReport();
            case PDF -> new PdfReport();
            case CSV -> new CsvReport();
        };
    }
}
class DetailedReportFactory extends AbstractFactory {
    public  ReportGenerator getReportGenerator(ReportType reportType){
        return switch (reportType) {
            case EXCEL -> new DetailedExcelReport();
            case PDF -> new DetailedPdfReport();
            case CSV -> new DetailedCsvReport();
        };
    }
}


class ReportFactoryGenerator {

    public static AbstractFactory getInstance(ReportLevel reportLevel){
        return switch (reportLevel) {
            case BASIC:
                yield new BasicReportFactory();
            case DETAILED:
                yield new DetailedReportFactory();

        };
    }
}

public class FactoryManager {
    public static void main(String[] args) {
          AbstractFactory reportFactory = ReportFactoryGenerator.getInstance(ReportLevel.DETAILED);
          ReportGenerator reportGenerator = reportFactory.getReportGenerator(ReportType.EXCEL);
          reportGenerator.printReport("Greetings from design patterns");
    }
}
