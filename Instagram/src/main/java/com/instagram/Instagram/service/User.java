package com.instagram.Instagram.service;

import com.instagram.Instagram.models.AuthenticationToken;
import com.instagram.Instagram.models.dto.AuthenticationInput;
import com.instagram.Instagram.models.dto.SignInInput;
import com.instagram.Instagram.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class User {

    @Autowired
    IUserRepository iUserRepository;

    @Autowired
    Token token;

    // Sign up
    public String userSignUp(com.instagram.Instagram.models.User user) {
        String existingEmail = user.getEmail();
        com.instagram.Instagram.models.User existingUser = iUserRepository.findFirstByEmail(existingEmail);

        if(existingUser != null){
            return "You're already signed Up. Please sign in";
        }

        String password = user.getPassword();
        try{
            String encryptedPassword = Password.encrypt(password);

            user.setPassword(encryptedPassword);
            iUserRepository.save(user);
            return "Signed up ";
        } catch (NoSuchAlgorithmException e) {
            return "Something went wrong ";
        }
    }

    // Sign In
    public String userSignIn(SignInInput signIn) {
        com.instagram.Instagram.models.User existingUser = iUserRepository.findFirstByEmail(signIn.getEmail());

        if(existingUser == null){
            return "Please sign up first";
        }

        String signInPassword = signIn.getPassword();
        try {
            String encryptSignInPassword = Password.encrypt(signInPassword);
            if(encryptSignInPassword.equals(existingUser.getPassword())){
                AuthenticationToken token = new AuthenticationToken(existingUser);
                this.token.createToken(token);
                return token.getTokenValue();
            }
            else{
                return "incorrect";
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // Update user email
    public String updateUserDetails(AuthenticationInput authenticationInput, String email) {
        if(token.authenticate(authenticationInput)){
            com.instagram.Instagram.models.User existingUser = iUserRepository.findFirstByEmail(authenticationInput.getEmail());
            existingUser.setEmail(email);
            iUserRepository.save(existingUser);
            return "Email updated successfully";
        }
        return "sign to update info";
    }
}
