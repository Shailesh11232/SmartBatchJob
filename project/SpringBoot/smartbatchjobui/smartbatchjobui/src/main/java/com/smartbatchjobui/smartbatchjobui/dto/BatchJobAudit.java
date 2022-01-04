package com.smartbatchjobui.smartbatchjobui.dto;

import java.util.List;

public class BatchJobAudit {

    private Long batchJobId ;
    private String batchJobName;
    private String batchJobDescription ;
    private String batchJobType ;
    private List<CreateBatchJobParameter> createBatchJobParameter ;
    private String Operation;
    private String auditUserId;

    public BatchJobAudit() {
    }

    public BatchJobAudit(Long batchJobId, String batchJobName, String batchJobDescription, String batchJobType, List<CreateBatchJobParameter> createBatchJobParameter, String operation, String auditUserId) {
        this.batchJobId = batchJobId;
        this.batchJobName = batchJobName;
        this.batchJobDescription = batchJobDescription;
        this.batchJobType = batchJobType;
        this.createBatchJobParameter = createBatchJobParameter;
        Operation = operation;
        this.auditUserId = auditUserId;
    }

    @Override
    public String toString() {
        return "BatchJobAudit{" +
                "batchJobId=" + batchJobId +
                ", batchJobName='" + batchJobName + '\'' +
                ", batchJobDescription='" + batchJobDescription + '\'' +
                ", batchJobType='" + batchJobType + '\'' +
                ", createBatchJobParameter=" + createBatchJobParameter +
                ", Operation='" + Operation + '\'' +
                ", auditUserId='" + auditUserId + '\'' +
                '}';
    }

    public Long getBatchJobId() {
        return batchJobId;
    }

    public void setBatchJobId(Long batchJobId) {
        this.batchJobId = batchJobId;
    }

    public String getBatchJobName() {
        return batchJobName;
    }

    public void setBatchJobName(String batchJobName) {
        this.batchJobName = batchJobName;
    }

    public String getBatchJobDescription() {
        return batchJobDescription;
    }

    public void setBatchJobDescription(String batchJobDescription) {
        this.batchJobDescription = batchJobDescription;
    }

    public String getBatchJobType() {
        return batchJobType;
    }

    public void setBatchJobType(String batchJobType) {
        this.batchJobType = batchJobType;
    }

    public List<CreateBatchJobParameter> getCreateBatchJobParameter() {
        return createBatchJobParameter;
    }

    public void setCreateBatchJobParameter(List<CreateBatchJobParameter> createBatchJobParameter) {
        this.createBatchJobParameter = createBatchJobParameter;
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

    public void setBatchJobAuditId(Long batchJobAuditId) {
    }
}
