package org.jboss.aerogear.unifiedpush.service.impl;

import org.jboss.aerogear.unifiedpush.api.PushApplication;
import org.jboss.aerogear.unifiedpush.dao.PageResult;
import org.jboss.aerogear.unifiedpush.dao.PushApplicationDao;
import org.jboss.aerogear.unifiedpush.service.SearchApplicationService;

import javax.inject.Inject;

public class SearchByDeveloperApplicationServiceImpl implements SearchApplicationService {

    @Inject
    private PushApplicationDao pushApplicationDao;

    @Override
    public PageResult<PushApplication> findAllPushApplicationsForDeveloper(String loginName, Integer page, Integer pageSize) {
        return pushApplicationDao.findAllForDeveloper(loginName, page, pageSize);
    }

    @Override
    public PushApplication findByPushApplicationIDForDeveloper(String pushApplicationID, String loginName) {

        return pushApplicationDao.findByPushApplicationIDForDeveloper(pushApplicationID, loginName);
    }

}
