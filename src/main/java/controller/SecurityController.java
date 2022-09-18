package controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class SecurityController {
    @Secured({"ROLE_READ"})
    @GetMapping("/read")
    public String getRead() {
        return "Read";
    }

    @RolesAllowed({"ROLE_WRITE"})
    @GetMapping("/write")
    public String getWrite() {
        return "Write";
    }

    @PostAuthorize("hasAnyRole('WRITE','DELETE')")
    @GetMapping("/wd")
    public String getWriteOrDelete() {
        return "Write or Delete";
    }

    @GetMapping("/")
    @PreAuthorize("#username == authentication.principal.username")
    public String LoadUserDetail(String username) {
        return "Hi, " + username;
    }

}
