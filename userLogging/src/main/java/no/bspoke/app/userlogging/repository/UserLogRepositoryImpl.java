package no.bspoke.app.userlogging.repository;

import no.bspoke.app.userlogging.exception.UserNotFound;
import no.bspoke.app.userlogging.model.UserInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserLogRepositoryImpl implements UserLogRepository {
    private List<UserInfo> userList;

    public UserLogRepositoryImpl() {
        userList = new ArrayList<UserInfo>();

        userList.add(new UserInfo());
        userList.add(new UserInfo());
        userList.add(new UserInfo());
        userList.add(new UserInfo());
    }

    @Override
    public List<UserInfo> getUsers() {
        return userList;
    }

    @Override
    public UserInfo getUserInfo(String userId) {
        for (UserInfo usr : userList) {
            if (usr.getUserId() == userId) {
                return usr;
            }
        }

        throw new UserNotFound();
    }
}
