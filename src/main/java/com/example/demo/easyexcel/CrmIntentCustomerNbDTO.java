package com.example.demo.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.lang.String;
import java.math.BigDecimal;

@Data
public class CrmIntentCustomerNbDTO {

    @ExcelProperty("IntentCustomerId")
    private Long intentCustomerId; // bigint

    @ExcelProperty("OrgCode")
    private String orgCode; // varchar(255)

    @ExcelProperty("OrgName")
    private String orgName; // varchar(255)

    @ExcelProperty("CustomerState")
    private String customerState; // varchar(255)

    @ExcelProperty("CustomerNo")
    private String customerNo; // varchar(255)

    @ExcelProperty("FirstVisitDate")
    private String firstVisitDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("CustomerName")
    private String customerName; // varchar(255)

    @ExcelProperty("Sex")
    private String sex; // varchar(20)

    @ExcelProperty("CustomerSource")
    private String customerSource; // varchar(255)

    @ExcelProperty("IntroducerId")
    private Integer introducerId; // int

    @ExcelProperty("Introducer")
    private String introducer; // varchar(64)

    @ExcelProperty("CustomerType")
    private String customerType; // varchar(255)

    @ExcelProperty("IsWalkIn")
    private Boolean isWalkIn; // int - 转换为布尔值

    @ExcelProperty("Provider")
    private String provider; // varchar(255)

    @ExcelProperty("IsFuture")
    private Boolean isFuture; // int - 转换为布尔值

    @ExcelProperty("FutureDate")
    private String futureDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("MobileTelephone")
    private String mobileTelephone; // varchar(255)

    @ExcelProperty("Telephone")
    private String telephone; // varchar(255)

    @ExcelProperty("OtherTelephone")
    private String otherTelephone; // varchar(255)

    @ExcelProperty("Profession")
    private String profession; // varchar(255)

    @ExcelProperty("Birthday")
    private String birthday; // varchar(25) - 假设是日期格式

    @ExcelProperty("IdCard")
    private String idCard; // varchar(255)

    @ExcelProperty("Age")
    private Integer age; // decimal(6) - 转换为整数

    @ExcelProperty("LinkMan")
    private String linkMan; // varchar(64)

    @ExcelProperty("LinkManTel")
    private String linkManTel; // varchar(255)

    @ExcelProperty("Industryknowledge")
    private String industryKnowledge; // varchar(255)

    @ExcelProperty("PresentAddress")
    private String presentAddress; // text - 使用String表示

    @ExcelProperty("RoomType")
    private String roomType; // varchar(255)

    @ExcelProperty("HouseType")
    private String houseType; // varchar(255)

    @ExcelProperty("Area")
    private BigDecimal area; // decimal(18, 4)

    @ExcelProperty("Storey")
    private String storey; // varchar(255)

    @ExcelProperty("DecorationStyle")
    private String decorationStyle; // varchar(255)

    @ExcelProperty("DecorationArea")
    private String decorationArea; // varchar(255)

    @ExcelProperty("Estate")
    private String estate; // varchar(255)

    @ExcelProperty("DecorationAddress")
    private String decorationAddress; // text - 使用String表示

    @ExcelProperty("EstimatedDate")
    private String estimatedDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("EstimatedCost")
    private String estimatedCost; // text - 使用String表示

    @ExcelProperty("RoomMeasuringDate")
    private String roomMeasuringDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("CustomerAttention")
    private String customerAttention; // text - 使用String表示

    @ExcelProperty("FamilyMember")
    private String familyMember; // text - 使用String表示

    @ExcelProperty("AboutOurCompany")
    private String aboutOurCompany; // text - 使用String表示

    @ExcelProperty("CustomerDemand")
    private String customerDemand; // text - 使用String表示

    @ExcelProperty("DraftCustomerId")
    private Long draftCustomerId; // bigint

    @ExcelProperty("ChangeDate")
    private String changeDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("ChangeUserId")
    private Integer changeUserId; // int

    @ExcelProperty("ChangeUser")
    private String changeUser; // varchar(64)

    @ExcelProperty("CreateDate")
    private String createDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("CreateUserId")
    private Integer createUserId; // int

    @ExcelProperty("CreateUser")
    private String createUser; // varchar(64)

    @ExcelProperty("EditDate")
    private String editDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("EditUserId")
    private Integer editUserId; // int

    @ExcelProperty("EditUser")
    private String editUser; // varchar(64)

    @ExcelProperty("Remark")
    private String remark; // text - 使用String表示

    @ExcelProperty("WorkflowId")
    private Long workflowId; // bigint

    @ExcelProperty("WorkflowName")
    private String workflowName; // varchar(200)

    @ExcelProperty("IsFormDead")
    private Boolean isFormDead; // int - 转换为布尔值

    @ExcelProperty("MarketingDeptCode")
    private String marketingDeptCode; // varchar(255)

    @ExcelProperty("MarketingDeptName")
    private String marketingDeptName; // varchar(255)

    @ExcelProperty("MarketingManagerId")
    private Integer marketingManagerId; // int

    @ExcelProperty("MarketingManager")
    private String marketingManager; // varchar(255)

    @ExcelProperty("BudgetAmount")
    private BigDecimal budgetAmount; // decimal(18, 4)

    @ExcelProperty("BalanceAmount")
    private BigDecimal balanceAmount; // decimal(18, 4)

    @ExcelProperty("CollectedAmount")
    private BigDecimal collectedAmount; // decimal(18, 4)

    @ExcelProperty("DirectAmount")
    private BigDecimal directAmount; // decimal(18, 4)

    @ExcelProperty("MaterialAmount")
    private BigDecimal materialAmount; // decimal(18, 4)

    @ExcelProperty("FurnitureAmount")
    private BigDecimal furnitureAmount; // decimal(18, 4)

    @ExcelProperty("DesignerId")
    private Integer designerId; // int

    @ExcelProperty("Designer")
    private String designer; // varchar(255)

    @ExcelProperty("DesignerWorkOrderDate")
    private String designerWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("BudgeterId")
    private Integer budgeterId; // int

    @ExcelProperty("Budgeter")
    private String budgeter; // varchar(255)

    @ExcelProperty("BudgeterWorkOrderDate")
    private String budgeterWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("WorkerPrincipalId")
    private Integer workerPrincipalId; // int

    @ExcelProperty("WorkerPrincipal")
    private String workerPrincipal; // varchar(255)

    @ExcelProperty("WorkerPrincipalWorkOrderDate")
    private String workerPrincipalWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("CheckerId")
    private Integer checkerId; // int

    @ExcelProperty("Checker")
    private String checker; // varchar(255)

    @ExcelProperty("CheckerWorkOrderDate")
    private String checkerWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("AccepterId")
    private Integer accepterId; // int

    @ExcelProperty("Accepter")
    private String accepter; // varchar(255)

    @ExcelProperty("AccepterWorkOrderDate")
    private String accepterWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("CustomerManagerId")
    private Integer customerManagerId; // int

    @ExcelProperty("CustomerManager")
    private String customerManager; // varchar(255)

    @ExcelProperty("CustomerManagerWorkOrderDate")
    private String customerManagerWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("FurnitureDesignerId")
    private Integer furnitureDesignerId; // int

    @ExcelProperty("FurnitureDesigner")
    private String furnitureDesigner; // varchar(255)

    @ExcelProperty("FurnitureDesignerWorkOrderDate")
    private String furnitureDesignerWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("FurnitureCheckerId")
    private Integer furnitureCheckerId; // int

    @ExcelProperty("FurnitureChecker")
    private String furnitureChecker; // varchar(255)

    @ExcelProperty("FurnitureCheckerWorkOrderDate")
    private String furnitureCheckerWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("FurnitureAccepterId")
    private Integer furnitureAccepterId; // int

    @ExcelProperty("FurnitureAccepter")
    private String furnitureAccepter; // varchar(255)

    @ExcelProperty("FurnitureAccepterWorkOrderDate")
    private String furnitureAccepterWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("ComplaintNum")
    private Integer complaintNum; // int

    @ExcelProperty("ReturnVisitNum")
    private Integer returnVisitNum; // int

    @ExcelProperty("LastComplaintDate")
    private String lastComplaintDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("LastReturnVisitDate")
    private String lastReturnVisitDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("IsSuccessfulCase")
    private Boolean isSuccessfulCase; // int - 转换为布尔值

    @ExcelProperty("IsDistributeChange")
    private Boolean isDistributeChange; // int - 转换为布尔值

    @ExcelProperty("IsWorkflowFinish")
    private Boolean isWorkflowFinish; // int - 转换为布尔值

    @ExcelProperty("IsProjectFinish")
    private Boolean isProjectFinish; // int - 转换为布尔值

    @ExcelProperty("WorkflowFinishDate")
    private String workflowFinishDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("ProjectFinishDate")
    private String projectFinishDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("FirstBillingDate")
    private String firstBillingDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("IntentCustomerState")
    private Integer intentCustomerState; // int

    @ExcelProperty("AccountDate")
    private String accountDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("DeadSignState")
    private String deadSignState; // varchar(20)

    @ExcelProperty("DeadSignApplyDate")
    private String deadSignApplyDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("DeadSignApplyUserId")
    private Integer deadSignApplyUserId; // int

    @ExcelProperty("DeadSignApplyUser")
    private String deadSignApplyUser; // text - 使用String表示

    @ExcelProperty("DeadSignAuditDate")
    private String deadSignAuditDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("DeadSignAuditUserId")
    private Integer deadSignAuditUserId; // int

    @ExcelProperty("DeadSignAuditUser")
    private String deadSignAuditUser; // text - 使用String表示

    @ExcelProperty("SupervisorId")
    private Integer supervisorId; // int

    @ExcelProperty("Supervisor")
    private String supervisor; // text - 使用String表示

    @ExcelProperty("SupervisorWorkOrderDate")
    private String supervisorWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("LastVisitDate")
    private String lastVisitDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("VisitCount")
    private Integer visitCount; // int

    @ExcelProperty("LastCallBackDate")
    private String lastCallBackDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("CallBackCount")
    private Integer callBackCount; // int

    @ExcelProperty("BusinessInfo")
    private String businessInfo; // text - 使用String表示

    @ExcelProperty("ConstructionInfo")
    private String constructionInfo; // text - 使用String表示

    @ExcelProperty("FinanceInfo")
    private String financeInfo; // text - 使用String表示

    @ExcelProperty("DesignManagerId")
    private Integer designManagerId; // int

    @ExcelProperty("DesignManager")
    private String designManager; // text - 使用String表示

    @ExcelProperty("DesignManagerWorkOrderDate")
    private String designManagerWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("MarketingType")
    private String marketingType; // varchar(255)

    @ExcelProperty("SuccessRate")
    private BigDecimal successRate; // decimal(10, 4)

    @ExcelProperty("MarketingManagerWorkOrderDate")
    private String marketingManagerWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("AfterSaleVisitNum")
    private Integer afterSaleVisitNum; // int

    @ExcelProperty("LastAfterSaleVisitDate")
    private String lastAfterSaleVisitDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("RepairedNum")
    private Integer repairedNum; // int

    @ExcelProperty("LastRepairedDate")
    private String lastRepairedDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("SalesmanId")
    private Integer salesmanId; // int

    @ExcelProperty("Salesman")
    private String salesman; // text - 使用String表示

    @ExcelProperty("SalesmanWorkOrderDate")
    private String salesmanWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("WorkerPrincipalAccountDate")
    private String workerPrincipalAccountDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("RepairedAmount")
    private BigDecimal repairedAmount; // decimal(18, 4)

    @ExcelProperty("DesignerDeptCode")
    private String designerDeptCode; // varchar(255)

    @ExcelProperty("DesignerDeptName")
    private String designerDeptName; // varchar(255)

    @ExcelProperty("WorkerPrincipalDeptCode")
    private String workerPrincipalDeptCode; // varchar(255)

    @ExcelProperty("WorkerPrincipalDeptName")
    private String workerPrincipalDeptName; // varchar(255)

    @ExcelProperty("Clerk")
    private String clerk; // text - 使用String表示

    @ExcelProperty("EngineeringManager")
    private String engineeringManager; // text - 使用String表示

    @ExcelProperty("LastWorkOrderDate")
    private String lastWorkOrderDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("LastEpcDate")
    private String lastEpcDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("KHBalanceState")
    private Integer khBalanceState; // int

    @ExcelProperty("GZBalanceState")
    private Integer gzBalanceState; // int

    @ExcelProperty("YFRepairedAmount")
    private BigDecimal yfRepairedAmount; // decimal(18, 4)

    @ExcelProperty("SFRepairedAmount")
    private BigDecimal sfRepairedAmount; // decimal(18, 4)

    @ExcelProperty("YSDesignCharge")
    private BigDecimal ysDesignCharge; // decimal(18, 4)

    @ExcelProperty("CoveredArea")
    private BigDecimal coveredArea; // decimal(18, 4)

    @ExcelProperty("LastCustomerRecordDate")
    private String lastCustomerRecordDate; // varchar(25) - 假设是日期格式

    @ExcelProperty("CustomerRecordCount")
    private Integer customerRecordCount; // int

    @ExcelProperty("DecorationCity")
    private String decorationCity; // varchar(255)

    @ExcelProperty("DecorationFullAddress")
    private String decorationFullAddress; // text - 使用String表示

    @ExcelProperty("StoreOrgCode")
    private String storeOrgCode; // varchar(255)

    @ExcelProperty("StoreOrgName")
    private String storeOrgName; // varchar(255)

    @ExcelProperty("CollectedEarnestAmount")
    private BigDecimal collectedEarnestAmount; // decimal(18, 4)

    @ExcelProperty("KHBalanceApplyState")
    private Integer khBalanceApplyState; // int

    @ExcelProperty("GZBalanceApplyState")
    private Integer gzBalanceApplyState; // int

    @ExcelProperty("YFAmount")
    private BigDecimal yfAmount; // decimal(18, 4)

    @ExcelProperty("ChatLogContent")
    private String chatLogContent; // text - 使用String表示

    @ExcelProperty("PhotoUrl")
    private String photoUrl; // text - 使用String表示

    @ExcelProperty("CustomerSourceDetail")
    private String customerSourceDetail; // text - 使用String表示
}