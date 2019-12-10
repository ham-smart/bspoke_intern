package no.bspoke.app.userlogging.repository;

import no.bspoke.app.userlogging.model.UserInfo;

import java.util.List;

public interface UserLogRepository {
    public List<UserInfo> getUsers();

    public UserInfo getUserInfo(String userId);
}
