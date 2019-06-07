package org.hayas.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hayas.demo.dto.RestDemoModel;
import org.springframework.stereotype.Service;

@Service
public class RestDemoService
{
   private List<RestDemoModel> demoList = new ArrayList<>(Arrays.asList(new RestDemoModel("1", "Ronoldo"), new RestDemoModel("2", "Messi")));

   public List<RestDemoModel> getAllDemoItems()
   {
      return demoList;
   }

   public RestDemoModel getDemoItem(String id)
   {
      for (RestDemoModel item : demoList)
      {
         if (item.getId().equals(id))
         {
            return item;
         }
      }
      return null;
   }

   public void addUser(RestDemoModel item)
   {
      demoList.add(item);
   }

}
