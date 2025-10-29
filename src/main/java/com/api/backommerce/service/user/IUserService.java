package com.api.backommerce.service.user;

import com.api.backommerce.dto.UserDto;
import com.api.backommerce.model.User;
import com.api.backommerce.request.CreateUserRequest;
import com.api.backommerce.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);

    User createUser(CreateUserRequest request);

    User updateUser(UserUpdateRequest request, Long userId);

    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
