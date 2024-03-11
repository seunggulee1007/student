package com.nhn.edu.springboot.student.adapter.in.web.query;

import com.nhn.edu.springboot.student.application.port.in.SearchAccountQuery;
import com.nhn.edu.springboot.student.application.port.in.SearchAccountUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AccountWebController {

    private final SearchAccountUseCase searchAccountUseCase;

    @GetMapping("/web/account/{id}")
    public String getAccountById(@PathVariable String id, Model model) {
        model.addAttribute("account", searchAccountUseCase.getAccountById(SearchAccountQuery.of(id)));
        model.addAttribute("transferServiceYn", "Y");
        return "account";
    }

    @GetMapping("/web/accounts")
    public String getAccounts(Model model) {
        model.addAttribute("accounts", searchAccountUseCase.getAccounts());
        return "accounts";
    }

    @GetMapping("/web/test")
    public String test(Model model) {
        model.addAttribute("transferServiceYn", "Y");
        return "test";
    }

    @PostMapping("/web/posttest")
    public String posttest(Model model) {
        return "account";
    }

}
