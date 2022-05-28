package com.sparta.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginForm() {
        return "redirect:/login-form.html";
    }

    //    POST http://localhost:8080/login
    //    Header
    //    Content type: application/x-www-form-urlencoded
    //            Body
    //    id=superman&password=superman
    @PostMapping("/login")
    public String postLogin(@RequestParam String id, @RequestParam String password, Model model) {
        // @RequestParam을 통해서 id와 pw 받기
        // Model을 넘겨주기 위해서 선언
        /*if (!id.equals(password)) {
            System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
            return "redirect:/login-form.html";
        }
        model.addAttribute("loginId", id);
        return "login-result";*/
        if (id.equals(password)) {
            model.addAttribute("loginId", id);
        }
        return "login-result";
    }
}
