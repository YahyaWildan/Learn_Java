package com.example.homefragment;

public class DataModelListAddress {
    String labelName, recipient_name, txtAddress;

    public DataModelListAddress(String labelName, String recipient_name, String txtAddress) {
        this.labelName = labelName;
        this.recipient_name = recipient_name;
        this.txtAddress = txtAddress;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getRecipient_name() {
        return recipient_name;
    }

    public void setRecipient_name(String recipient_name) {
        this.recipient_name = recipient_name;
    }

    public String getTxtAddress() {
        return txtAddress;
    }

    public void setTxtAddress(String txtAddress) {
        this.txtAddress = txtAddress;
    }
}
