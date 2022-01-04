package com.smartbatchjobui.smartbatchjobui.dto;


public class BatchJobSubmit {
    private Long batchJobSubmitId;
    private String batchJobName;
    private String createBatchJobParameter;

    public BatchJobSubmit(){}

    public BatchJobSubmit(Long batchJobSubmitId, String batchJobName, String createBatchJobParameter) {
        this.batchJobSubmitId = batchJobSubmitId;
        this.batchJobName = batchJobName;
        this.createBatchJobParameter = createBatchJobParameter;
    }

    @Override
    public String toString() {
        return "BatchJobSubmit{" +
                "batchJobSubmitId=" + batchJobSubmitId +
                ", batchJobName='" + batchJobName + '\'' +
                ", createBatchJobParameter='" + createBatchJobParameter + '\'' +
                '}';
    }

    public Long getBatchJobSubmitId() {
        return batchJobSubmitId;
    }

    public void setBatchJobSubmitId(Long batchJobSubmitId) {
        this.batchJobSubmitId = batchJobSubmitId;
    }

    public String getBatchJobName() {
        return batchJobName;
    }

    public void setBatchJobName(String batchJobName) {
        this.batchJobName = batchJobName;
    }

    public String getCreateBatchJobParameter() {
        return createBatchJobParameter;
    }

    public void setCreateBatchJobParameter(String createBatchJobParameter) {
        this.createBatchJobParameter = createBatchJobParameter;
    }
}
