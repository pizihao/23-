package com.liu.Responsibilitychain;

/**
 * @author shidacaizi
 * @date 2020/6/1 22:12
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000){
            System.out.println("请求编号id="+ purchaseRequest.getId() + "被"+this.name+"处理了");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
