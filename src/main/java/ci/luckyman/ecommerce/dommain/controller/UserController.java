package ci.luckyman.ecommerce.dommain.controller;

import ci.luckyman.ecommerce.dommain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


}
