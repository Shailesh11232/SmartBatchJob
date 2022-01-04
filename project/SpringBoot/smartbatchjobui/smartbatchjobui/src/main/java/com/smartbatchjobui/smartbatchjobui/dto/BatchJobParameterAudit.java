package com.smartbatchjobui.smartbatchjobui.dto;

public class BatchJobParameterAudit extends CreateBatchJobParameter {
    private long batchJobId;
    private Long batchJobParameterAuditId;
    private Long   parameterId;
    private String parameterName ;
    private String parameterDescription ;
    private String parameterType ;
    private String parameterFormat ;
    private Boolean mandatoryFlag ;
    private Boolean visibleFlag ;
    private String defaultValue ;
    private String regexforValidation ;
    private String Operation;
    private String auditUserId;

    public BatchJobParameterAudit(){}

    public BatchJobParameterAudit(long batchJobId, Long batchJobParameterAuditId, Long parameterId, String parameterName, String parameterDescription, String parameterType, String parameterFormat, Boolean mandatoryFlag, Boolean visibleFlag, String defaultValue, String regexforValidation, String operation, String auditUserId) {
        this.batchJobId = batchJobId;
        this.batchJobParameterAuditId = batchJobParameterAuditId;
        this.parameterId = parameterId;
        this.parameterName = parameterName;
        this.parameterDescription = parameterDescription;
        this.parameterType = parameterType;
        this.parameterFormat = parameterFormat;
        this.mandatoryFlag = mandatoryFlag;
        this.visibleFlag = visibleFlag;
        this.defaultValue = defaultValue;
        this.regexforValidation = regexforValidation;
        Operation = operation;
        this.auditUserId = auditUserId;
    }

    @Override
    public String toString() {
        return "BatchJobParameterAudit{" +
                "batchJobId=" + batchJobId +
                ", batchJobParameterAuditId=" + batchJobParameterAuditId +
                ", parameterId=" + parameterId +
                ", parameterName='" + parameterName + '\'' +
                ", parameterDescription='" + parameterDescription + '\'' +
                ", parameterType='" + parameterType + '\'' +
                ", parameterFormat='" + parameterFormat + '\'' +
                ", mandatoryFlag=" + mandatoryFlag +
                ", visibleFlag=" + visibleFlag +
                ", defaultValue='" + defaultValue + '\'' +
                ", regexforValidation='" + regexforValidation + '\'' +
                ", Operation='" + Operation + '\'' +
                ", auditUserId='" + auditUserId + '\'' +
                '}';
    }

    public long getBatchJobId(Long batchJobId) {
        return this.batchJobId;
    }

    public void setBatchJobId(long batchJobId) {
        this.batchJobId = batchJobId;
    }

    public Long getBatchJobParameterAuditId() {
        return batchJobParameterAuditId;
    }

    public void setBatchJobParameterAuditId(Long batchJobParameterAuditId) {
        this.batchJobParameterAuditId = batchJobParameterAuditId;
    }

    public Long getParameterId() {
        return parameterId;
    }

    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterDescription() {
        return parameterDescription;
    }

    public void setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription;
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public String getParameterFormat() {
        return parameterFormat;
    }

    public void setParameterFormat(String parameterFormat) {
        this.parameterFormat = parameterFormat;
    }

    public Boolean getMandatoryFlag() {
        return mandatoryFlag;
    }

    public void setMandatoryFlag(Boolean mandatoryFlag) {
        this.mandatoryFlag = mandatoryFlag;
    }

    public Boolean getVisibleFlag() {
        return visibleFlag;
    }

    public void setVisibleFlag(Boolean visibleFlag) {
        this.visibleFlag = visibleFlag;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getRegexforValidation() {
        return regexforValidation;
    }

    public void setRegexforValidation(String regexforValidation) {
        this.regexforValidation = regexforValidation;
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
