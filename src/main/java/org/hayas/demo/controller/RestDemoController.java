package org.hayas.demo.controller;

import java.util.List;

import org.hayas.demo.dto.RestDemoModel;
import org.hayas.demo.service.RestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemoController
{
   @Autowired
   private RestDemoService demoService;

   @RequestMapping("/getall")
   public List<RestDemoModel> getAllHello()
   {
      return demoService.getAllDemoItems();
   }

   @RequestMapping("/get/{id}")
   public RestDemoModel getHello(@PathVariable String id)
   {
      return demoService.getDemoItem(id);
   }

   @RequestMapping(method = RequestMethod.POST, value = "/addUser")
   public boolean addUser(@RequestBody RestDemoModel greet)
   {
      demoService.addUser(greet);
      return true;
   }
}
