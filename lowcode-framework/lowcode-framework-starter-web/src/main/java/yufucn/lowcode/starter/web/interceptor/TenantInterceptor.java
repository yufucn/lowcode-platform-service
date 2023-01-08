package yufucn.lowcode.starter.web.interceptor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;
import yufucn.lowcode.multitenancy.TenantContext;

/**
 * @author wang
 * @date 2023/1/8 13:52
 */
@Component
public class TenantInterceptor implements WebRequestInterceptor {

    @Value("${tenant-key:X-YUFU-TENANT-ID}")
    private String tenantKey;

    @Override
    public void preHandle(WebRequest request) throws Exception {
        String tenantId;
        if (request.getHeader(tenantKey) != null) {
            tenantId = request.getHeader(tenantKey);
            TenantContext.setTenantId(tenantId);
        }
    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        TenantContext.clear();
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {

    }
}
