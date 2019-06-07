package org.hayas.demo.dto;

public class RestDemoModel
{

   private String id;
   private String content;

   public RestDemoModel()
   {

   }

   public RestDemoModel(String id, String content)
   {
      this.id = id;
      this.content = content;
   }

   public String getId()
   {
      return id;
   }

   public String getContent()
   {
      return content;
   }
}
