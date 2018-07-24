package spring.cloud.config.client.rest;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.config.client.bean.JsonResult;
import spring.cloud.config.client.config.Config;
import spring.cloud.config.client.dao.AdminDao;

@RestController
public class Admin {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private Config config;

    @RequestMapping(method = RequestMethod.GET, value = "/api/admin/{id}")
    public JsonResult<JSONObject> selectAdminById(@PathVariable Integer id){
        String name = config.getName();
        System.out.println(name);
        return JsonResult.success(adminDao.selectAdminById(id));
    }

}
