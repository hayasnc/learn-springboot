package org.hayas.demo.dto;

import org.springframework.stereotype.Component;

//@component("hardiskName")
@Component
public class HardDisk
{
   String brand;
   int    size;
   int    id;

   public String getBrand()
   {
      return brand;
   }

   public void setBrand(String brand)
   {
      this.brand = brand;
   }

   public int getSize()
   {
      return size;
   }

   public void setSize(int size)
   {
      this.size = size;
   }

   public int getId()
   {
      return id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   @Override
   public String toString()
   {
      return "HardDisk [brand=" + brand + ", size=" + size + ", id=" + id + "]";
   }

   public void verify()
   {
      System.out.println("Inside hardisk");
   }

}
