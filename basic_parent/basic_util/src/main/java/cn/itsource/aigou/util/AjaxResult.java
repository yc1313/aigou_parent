package cn.itsource.aigou.util;

//Ajax请求响应对象的类
public class AjaxResult {
    private boolean success=true;
    private String message="操作成功";

    //返回到前台对象
    private Object resultObj;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMassage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }

    //成功 AjaxResult.me()
    //AjaxResult.me().setSuccess(flase),setMassage("失败")
    public static AjaxResult me(){
        return new AjaxResult();
    }


   /* //成功
    public AjaxResult() {
    }

    //失败 并且有提示
    public AjaxResult(String massage) {
        this.success=false;
        this.massage = massage;
    }*/
}
