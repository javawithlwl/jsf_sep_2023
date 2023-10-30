package com.careerit.cj.day15;

public class Invoice {

    private String invoiceNo;
    private String customerName;
    private double amount;
    private ApprovalStatus approvalStatus;

    public Invoice(String invoiceNo, String customerName, double amount, ApprovalStatus approvalStatus) {
        this.invoiceNo = invoiceNo;
        this.customerName = customerName;
        this.amount = amount;
        this.approvalStatus = approvalStatus;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Invoice{");
        sb.append("invoiceNo='").append(invoiceNo).append('\'');
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", approvalStatus=").append(approvalStatus);
        sb.append('}');
        return sb.toString();
    }
}
