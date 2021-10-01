package com.smartbatchjobui.smartbatchjobui.dto;

public class CreateBatchJobParameter {
    private Long   parameterId;
    private String parameterName ;
    private String parameterDescription ;
    private String parameterType ;
    private String parameterFormat ;
    private Boolean mandatoryFlag ;
    private Boolean visibleFlag ;
    private String defaultValue ;
    private String regexforValidation ;

    public CreateBatchJobParameter(){

    }

    public CreateBatchJobParameter(Long parameterId, String parameterName, String parameterDescription, String parameterType, String parameterFormat, Boolean mandatoryFlag, Boolean visibleFlag, String defaultValue, String regexforValidation) {
        this.parameterId = parameterId;
        this.parameterName = parameterName;
        this.parameterDescription = parameterDescription;
        this.parameterType = parameterType;
        this.parameterFormat = parameterFormat;
        this.mandatoryFlag = mandatoryFlag;
        this.visibleFlag = visibleFlag;
        this.defaultValue = defaultValue;
        this.regexforValidation = regexforValidation;
    }

    @Override
    public String toString() {
        return "CreateBatchJobParameter{" +
                "parameterId=" + parameterId +
                ", parameterName='" + parameterName + '\'' +
                ", parameterDescription='" + parameterDescription + '\'' +
                ", parameterType='" + parameterType + '\'' +
                ", parameterFormat='" + parameterFormat + '\'' +
                ", mandatoryFlag=" + mandatoryFlag +
                ", visibleFlag=" + visibleFlag +
                ", defaultValue='" + defaultValue + '\'' +
                ", regexforValidation='" + regexforValidation + '\'' +
                '}';
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
}