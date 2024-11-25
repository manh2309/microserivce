package com.devteria.profile.controller;

import com.devteria.profile.Service.UserProfileService;
import com.devteria.profile.dto.response.UserProfileResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @GetMapping("/users/{profileId}")
    UserProfileResponse getProfile(@PathVariable String profileId){
        return userProfileService.getUserProfile(profileId);
    }
}
