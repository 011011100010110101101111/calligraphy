package com.hpwenxue.utils;import com.hpwenxue.config.InitConfig;import com.hpwenxue.domain.User;import com.hpwenxue.enums.Dictionaries;import com.hpwenxue.repository.UserRepository;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.CommandLineRunner;import org.springframework.stereotype.Component;/** * 初始化系统数据 * @author : liuwenlong * @date : 2018/1/13 16:05 */@Componentpublic class Init implements CommandLineRunner {    @Autowired    private UserRepository userRepository;    @Override    public void run(String... args) throws Exception {        initUsers();    }    /**     * 初始化系统用户，超级管理员     */    private void initUsers(){        User user = userRepository.findByUserName("admin");        if (user == null){            userRepository.save(new InitConfig().initUser());        }    }    /**     * 初始化系统角色     */    private void initRoles(){    }}