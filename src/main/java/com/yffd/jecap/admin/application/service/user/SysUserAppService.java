package com.yffd.jecap.admin.application.service.user;

import com.yffd.jecap.admin.domain.user.entity.SysUser;
import com.yffd.jecap.admin.domain.user.service.SysUserService;
import com.yffd.jecap.common.base.service.AbstractBaseAppService;
import com.yffd.jecap.common.base.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserAppService extends AbstractBaseAppService<SysUser> {
    @Autowired private SysUserService sysUserService;

    @Override
    protected IBaseService getBaseService() {
        return sysUserService;
    }

}
