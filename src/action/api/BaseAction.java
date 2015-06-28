package action.api;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Benny on 27/6/15.
 */
public class BaseAction extends ActionSupport {

    protected Map<Object, Object> responseData;

    public Map<Object, Object> getResponseData() {
        return responseData;
    }

    public void setResponseData(Map<Object, Object> responseData) {
        this.responseData = responseData;
    }

    public void toApi(Integer code, String message, Object data) {
        responseData = new HashMap<>();
        responseData.put("code", code);
        responseData.put("message", "");
        responseData.put("data", data);
    }

    public String noPermission() {
        toApi(401, "no permission", "");
        return SUCCESS;
    }

    public String noAuthorized() {
        toApi(403, "no authorized", "");
        return SUCCESS;
    }
}
