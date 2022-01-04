package com.smartbatchjobui.smartbatchjobui.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity(name = "batch_job_parameter_audit")
@EntityListeners(AuditingEntityListener.class)
public class BatchJobParameterAuditEntity extends AudiTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_job_parameter_audit_id")
    private Long batchJobParameterAuditId;
    @Column(name = "batch_job_parameter_id")
    private Long batchJobParameterId;
    @Column(name = "batch_job_id")
    private Long batchJobId;
    @Column(name = "Parameter_Name")
    private String ParameterName;
    @Column(name = "Parameter_Description")
    private String ParameterDescription;
    @Column(name = "Parameter_Type")
    private String ParameterType;
    @Column(name = "Parameter_Format")
    private String ParameterFormat;
    @Column(name = "Mandatory_Flag")
    private Boolean MandatoryFlag;
    @Column(name = "Visible_Flag")
    private Boolean VisibleFlag;
    @Column(name = "Default_Value")
    private String DefaultValue;
    @Column(name = "Regex_for_Validation")
    private String RegexForValidation;
    @Column(name = "Operation")
    private String Operation;
    @Column(name = "audit_user_Id")
    private String auditUserId;

    public BatchJobParameterAuditEntity(){}

    public BatchJobParameterAuditEntity(Long batchJobParameterAuditId,
                                        Long batchJobParameterId,
                                        Long batchJobId, String parameterName,
                                        String parameterDescription,
                                        String parameterType,
                                        String parameterFormat,
                                        Boolean mandatoryFlag,
                                        Boolean visibleFlag, String defaultValue,
                                        String regexForValidation,
                                        String operation, String auditUserId) {
        this.batchJobParameterAuditId = batchJobParameterAuditId;
        this.batchJobParameterId = batchJobParameterId;
        this.batchJobId = batchJobId;
        ParameterName = parameterName;
        ParameterDescription = parameterDescription;
        ParameterType = parameterType;
        ParameterFormat = parameterFormat;
        MandatoryFlag = mandatoryFlag;
        VisibleFlag = visibleFlag;
        DefaultValue = defaultValue;
        RegexForValidation = regexForValidation;
       Operation = operation;
        this.auditUserId = auditUserId;
    }

    @Override
    public String toString() {
        return "BatchJobParameterAuditEntity{" +
                "batchJobParameterAuditId=" + batchJobParameterAuditId +
                ", batchJobParameterId=" + batchJobParameterId +
                ", batchJobId=" + batchJobId +
                ", ParameterName='" + ParameterName + '\'' +
                ", ParameterDescription='" + ParameterDescription + '\'' +
                ", ParameterType='" + ParameterType + '\'' +
                ", ParameterFormat='" + ParameterFormat + '\'' +
                ", MandatoryFlag=" + MandatoryFlag +
                ", VisibleFlag=" + VisibleFlag +
                ", DefaultValue='" + DefaultValue + '\'' +
                ", RegexForValidation='" + RegexForValidation + '\'' +
                ", Operation='" + Operation + '\'' +
                ", auditUserId='" + auditUserId + '\'' +
                '}';
    }

    public Long getBatchJobParameterAuditId() {
        return batchJobParameterAuditId;
    }

    public void setBatchJobParameterAuditId(Long batchJobParameterAuditId) {
        this.batchJobParameterAuditId = batchJobParameterAuditId;
    }

    public Long getBatchJobParameterId() {
        return batchJobParameterId;
    }

    public void setBatchJobParameterId(Long batchJobParameterId) {
        this.batchJobParameterId = batchJobParameterId;
    }

    public Long getBatchJobId() {
        return batchJobId;
    }

    public void setBatchJobId(Long batchJobId) {
        this.batchJobId = batchJobId;
    }

    public String getParameterName() {
        return ParameterName;
    }

    public void setParameterName(String parameterName) {
        ParameterName = parameterName;
    }

    public String getParameterDescription() {
        return ParameterDescription;
    }

    public void setParameterDescription(String parameterDescription) {
        ParameterDescription = parameterDescription;
    }

    public String getParameterType() {
        return ParameterType;
    }

    public void setParameterType(String parameterType) {
        ParameterType = parameterType;
    }

    public String getParameterFormat() {
        return ParameterFormat;
    }

    public void setParameterFormat(String parameterFormat) {
        ParameterFormat = parameterFormat;
    }

    public Boolean getMandatoryFlag() {
        return MandatoryFlag;
    }

    public void setMandatoryFlag(Boolean mandatoryFlag) {
        MandatoryFlag = mandatoryFlag;
    }

    public Boolean getVisibleFlag() {
        return VisibleFlag;
    }

    public void setVisibleFlag(Boolean visibleFlag) {
        VisibleFlag = visibleFlag;
    }

    public String getDefaultValue() {
        return DefaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        DefaultValue = defaultValue;
    }

    public String getRegexForValidation() {
        return RegexForValidation;
    }

    public void setRegexForValidation(String regexForValidation) {
        RegexForValidation = regexForValidation;
    }
    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId;
    }
}