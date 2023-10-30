package com.careerit.cj.day15;

import java.util.List;

public class InvoiceManager {

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("INV-1234", "Krish", 4500, ApprovalStatus.DRAFT);
        Invoice invoice2 = new Invoice("INV-1235", "Manoj", 5500, ApprovalStatus.PENDING);
        Invoice invoice3 = new Invoice("INV-1236", "Charan", 6500, ApprovalStatus.APPROVED);
        Invoice invoice4 = new Invoice("INV-1237", "Tanvi", 7500, ApprovalStatus.APPROVED);
        Invoice invoice5 = new Invoice("INV-1238", "Suresh", 8500, ApprovalStatus.DRAFT);

        List<Invoice> invoices = List.of(invoice1, invoice2, invoice3, invoice4, invoice5);

        for (Invoice invoice : invoices) {
            if (invoice.getApprovalStatus() == ApprovalStatus.APPROVED) {
                StringBuilder sb = new StringBuilder();
                sb.append("Dear ").append(invoice.getCustomerName()).append("\n")
                        .append("Your invoice number ").append(invoice.getInvoiceNo()).append(" amount is ").append(invoice.getAmount())
                        .append(", please pay the amount as soon as possible");
                System.out.println(sb.toString());
            }
        }
    }
}
