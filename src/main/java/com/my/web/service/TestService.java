package com.my.web.service;

import com.my.web.entity.Role;

import java.util.List;

public interface TestService {

    List<Role> getName(String name);

    List<Role> fetchRoleList();
}
