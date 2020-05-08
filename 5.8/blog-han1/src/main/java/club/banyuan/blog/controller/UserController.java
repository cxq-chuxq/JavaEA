package club.banyuan.blog.controller;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;
import club.banyuan.blog.service.BlogService;
import club.banyuan.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user/{username:[a-z0-9_]+}")
public class UserController {
    @GetMapping
    @ResponseBody
    public List<Blog> users(@RequestParam(name="page",required=false,defaultValue="1") Integer page ,@RequestParam(name="size",required=false, defaultValue="10") Integer size, @PathVariable String username) {
        User user = new UserService().findByName("zhangsan");
        List list = new BlogService().findBlogs(user);
        List list1 = new ArrayList();
        for(int i=0;i<size;i++){
            list1.add(list.get(page*size+-size+i));
        }
        return list1;
    }
}
