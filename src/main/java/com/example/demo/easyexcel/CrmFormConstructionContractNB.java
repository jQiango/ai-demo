package com.example.demo.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CrmFormConstructionContractNB {

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
    private BigDecimal contractDuration;

    @ExcelProperty("RealBeginDate")
    private String realBeginDate;

    @ExcelProperty("PlandBeginDate")
    private String plandBeginDate;

    @ExcelProperty("DesignCharge")
    private BigDecimal designCharge;

    @ExcelProperty("DiscountAmount")
    private BigDecimal discountAmount;

    @ExcelProperty("ContractAmount")
    private BigDecimal contractAmount;

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
    private BigDecimal estimateAmount;

    @ExcelProperty("AdjustAmount")
    private BigDecimal adjustAmount;

    @ExcelProperty("PrimarySteelBudgetAmount")
    private BigDecimal primarySteelBudgetAmount;

    @ExcelProperty("ProjectBudgetAmount")
    private BigDecimal projectBudgetAmount;

    @ExcelProperty("PrimarySteelSettlementAmount")
    private BigDecimal primarySteelSettlementAmount;

    @ExcelProperty("ProjectSettlementAmount")
    private BigDecimal projectSettlementAmount;

    @ExcelProperty("Amount1")
    private BigDecimal amount1;

    @ExcelProperty("Amount2")
    private BigDecimal amount2;

    @ExcelProperty("Amount3")
    private BigDecimal amount3;

    @ExcelProperty("Amount4")
    private BigDecimal amount4;

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
    @Deprecated
    private Integer editUserId;

    @ExcelProperty("EditUser")
    private String editUser;

    @ExcelProperty("Remark")
    private String remark;

    @ExcelProperty("BudgetDiscount")
    private BigDecimal budgetDiscount;

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
