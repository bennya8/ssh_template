package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by Benny on 27/6/15.
 */
public class AuthInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        Map params = actionInvocation.getInvocationContext().getParameters();
        String key[] = (String[]) params.get("key");

        if (key == null || key.length <= 0) {
            return "noAuthorized";
        }
        if (key[0].length() != 32) {
            return "noAuthorized";
        }

        return null;
    }
}
