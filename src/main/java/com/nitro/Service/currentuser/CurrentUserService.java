package com.nitro.Service.currentuser;

import com.nitro.Entity.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}