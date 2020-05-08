package club.banyuan.blog.service;

import club.banyuan.blog.bean.User;

public class UserService {
    public static User findByName(String username) {
        return new User("zhangsan", 21);
    }
}
