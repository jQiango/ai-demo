package com.example.demo.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class CrmFormConstructionContract {

    @ExcelProperty("FormConstructionContractId")
    private Long formConstructionContractId;

    @ExcelProperty("OrgCode")
    private String orgCode;

    @ExcelProperty("OrgName")
    private String orgName;

    @ExcelProperty("CustomerNo")
    private String customerNo;

    @ExcelProperty("IntentCustomerId")
    private Long intentCustomerId;

    @ExcelProperty("CustomerName")
    private String customerName;

    @ExcelProperty("ConstructionContractNo")
    private String constructionContractNo;

    @ExcelProperty("ContractDate")
    private String contractDate;

    @ExcelProperty("ContractDuration")
    private Double contractDuration;

    @ExcelProperty("RealBeginDate")
    private String realBeginDate;

    @ExcelProperty("PlandBeginDate")
    private String plandBeginDate;

    @ExcelProperty("DesignCharge")
    private Double designCharge;

    @ExcelProperty("DiscountAmount")
    private Double discountAmount;

    @ExcelProperty("ContractAmount")
    private Double contractAmount;

    @ExcelProperty("IsPrimarySteelSelfBuy")
    private Integer isPrimarySteelSelfBuy;

    @ExcelProperty("IsThirdPartySuperior")
    private Integer isThirdPartySuperior;

    @ExcelProperty("IsDiscountAmountFormula")
    private Integer isDiscountAmountFormula;

    @ExcelProperty("DiscountAmountFormula")
    private String discountAmountFormula;

    @ExcelProperty("RealEndDate")
    private String realEndDate;

    @ExcelProperty("EstimateAmount")
    private Double estimateAmount;

    @ExcelProperty("AdjustAmount")
    private Double adjustAmount;

    @ExcelProperty("PrimarySteelBudgetAmount")
    private Double primarySteelBudgetAmount;

    @ExcelProperty("ProjectBudgetAmount")
    private Double projectBudgetAmount;

    @ExcelProperty("PrimarySteelSettlementAmount")
    private Double primarySteelSettlementAmount;

    @ExcelProperty("ProjectSettlementAmount")
    private Double projectSettlementAmount;

    @ExcelProperty("Amount1")
    private Double amount1;

    @ExcelProperty("Amount2")
    private Double amount2;

    @ExcelProperty("Amount3")
    private Double amount3;

    @ExcelProperty("Amount4")
    private Double amount4;

    @ExcelProperty("SpecialItem")
    private String specialItem;

    @ExcelProperty("ContractEndDate")
    private String contractEndDate;

    @ExcelProperty("State")
    private Integer state;

    @ExcelProperty("AuditDate")
    private String auditDate;

    @ExcelProperty("AudittUserId")
    private Integer audittUserId;

    @ExcelProperty("AuditUser")
    private String auditUser;

    @ExcelProperty("CreateDate")
    private String createDate;

    @ExcelProperty("CreateUserId")
    private Integer createUserId;

    @ExcelProperty("CreateUser")
    private String createUser;

    @ExcelProperty("EditDate")
    private String editDate;

    @ExcelProperty("EditUserId")
    private Integer editUserId;

    @ExcelProperty("EditUser")
    private String editUser;

    @ExcelProperty("Remark")
    private String remark;

    @ExcelProperty("BudgetDiscount")
    private Double budgetDiscount;

    @ExcelProperty("ReceiptTemplateId")
    private Long receiptTemplateId;

    @ExcelProperty("IsEscapeVacation")
    private Integer isEscapeVacation;

    @ExcelProperty("ExtensionPlanFinishDate")
    private String extensionPlanFinishDate;

    @ExcelProperty("ExtensionPlanBeginDate")
    private String extensionPlanBeginDate;

    @ExcelProperty("IsNeedConfirm")
    private Integer isNeedConfirm;

    @ExcelProperty("ConfirmStatius")
    private Integer confirmStatius;

    @ExcelProperty("ConfirmDate")
    private String confirmDate;

    @ExcelProperty("ConfirmDisript")
    private String confirmDisript;
}