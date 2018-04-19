package online.vintem.api.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by eduardo on 19/04/18.
 */
public class GeradorDeSenha {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("admin"));
    }

}
