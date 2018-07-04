package com.usuaris.springrestfulapiusuaris.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


// A controller is a Java object whose job is to handle requests to certain URIs.

/**
 * Aquest controlador encripta la contrassenya del nou usuari i el guarda a la base de dades.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    /*
        We are applying annotations to methods to indicate which URI each method should handle.

        URL: Is an address that includes a method for locating a resource with a protocol like HTTP or FTP.
        A URL will include a host name, like creativecommons.org, but a URI doesn't have to.

     */
}
