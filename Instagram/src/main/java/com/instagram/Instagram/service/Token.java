package com.instagram.Instagram.service;


import com.instagram.Instagram.models.AuthenticationToken;
import com.instagram.Instagram.models.dto.AuthenticationInput;
import com.instagram.Instagram.repository.ITokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Token {

    @Autowired
    ITokenRepository iAuthenticationRepository;

    public void createToken(AuthenticationToken token) {
        iAuthenticationRepository.save(token);
    }

    public boolean authenticate(AuthenticationInput authenticationInput) {
        String existingEmail = authenticationInput.getEmail();
        String tokenValue = authenticationInput.getTokenValue();

        AuthenticationToken token = iAuthenticationRepository.findFirstByTokenValue(tokenValue);

        if(token != null){
            return token.getUser().getEmail().equals(existingEmail);
        }
        return false;
    }
}

