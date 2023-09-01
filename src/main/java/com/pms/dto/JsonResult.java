package com.pms.dto;

/**
 * 返回给前端的json数据
 * Created by Ming on 2018/2/8.
 */
public class JsonResult {

    private boolean isSuccess;
    private String message;

    public JsonResult(boolean isSuccess,String message){
        this.isSuccess = isSuccess;
        this.message = message;
    }

    public JsonResult(){

    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
