package com.liu.Responsibilitychain;

/**
 * @author shidacaizi
 * @date 2020/6/1 22:14
 */
public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        //创建相关审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        MasterApprover masterApprover = new MasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        //将各个审批的下一个人设置好 处理人构成环状
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(masterApprover);
        masterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}
