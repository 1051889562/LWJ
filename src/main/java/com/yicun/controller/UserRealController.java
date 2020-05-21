package com.yicun.controller;

import com.yicun.entity.UserReal;
import com.yicun.service.UserRealService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserReal)表控制层
 *
 * @author makejava
 * @since 2020-02-08 20:02:14
 */
@Controller
public class UserRealController {
    /**
     * 服务对象
     */
    @Resource
    private UserRealService userRealService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("/selectOne")
    public UserReal selectOne(Integer id) {
        return this.userRealService.queryById(id);
    }

    @RequestMapping("/")
    public String selectAll(Model model) {
        List<UserReal> userRealList = userRealService.queryAll();
        model.addAttribute("userRealList", userRealList);
        return "index";
    }

    @RequestMapping("/adduser")
    public String adduser() {

        return "adduser";
    }

    @RequestMapping("/add_user")
    @ResponseBody
    public boolean add_user(UserReal userReal) {
        boolean flag = false;
        UserReal userReal1 = userRealService.insert(userReal);
        if (userReal1 != null)
            flag = true;

        return flag;
    }

    @RequestMapping("/del_user")
    public String del_user(int id) {
        boolean flag = userRealService.deleteById(id);
        return "redirect:/";
    }

    private int id;
    @RequestMapping("/upduser")
    public String upduser(int id, Model model) {
        this.id=id;
        UserReal userReal = userRealService.queryById(id);
        model.addAttribute("userReal", userReal);
        return "upduser";
    }

    @RequestMapping("/upd_user")
    @ResponseBody
    public boolean upd_user(UserReal userReal) {
        userReal.setId(this.id);
//        System.out.println(userReal.getId()+" "+userReal.getGender()+" "+userReal.getUresult()+" "+userReal.getUserType()
//                +" "+userReal.getBirthday()+" "+userReal.getPassword()+" "+userReal.getRealName()+" "+userReal.getUsername());
        UserReal userReal1 = userRealService.update(userReal);
        if (userReal1 != null)
            return true;
        else
            return false;
    }
}