package com.frgp.racing.controller;


import com.frgp.racing.service.impl.TlmSessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 37
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/tlm-session")
public class TlmSessionController {
    @Autowired
    TlmSessionServiceImpl tlmSessionService;
}
