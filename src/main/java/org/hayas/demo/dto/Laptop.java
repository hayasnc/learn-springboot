package org.hayas.demo.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component Singleton -> A single Object of this class will be created by Spring container on run
// @Scope(value="protoType") -> if scope is protoType the object will be created only on demand ie getBeans()
@Component
public class Laptop
{
   int      LapId;
   String   brand;
   // by default @Autowired searches by type
   // @Qualifier("hardiskName") searches by name in this case name of HardDisk @component("hardiskName")
   @Autowired
   HardDisk hardDisk;
   String   monitor;
   String   processor;

   public int getLapId()
   {
      return LapId;
   }

   public void setLapId(int lapId)
   {
      LapId = lapId;
   }

   public String getBrand()
   {
      return brand;
   }

   public void setBrand(String brand)
   {
      this.brand = brand;
   }

   public HardDisk getHardDisk()
   {
      return hardDisk;
   }

   public void setHardDisk(HardDisk hardDisk)
   {
      this.hardDisk = hardDisk;
   }

   public Laptop()
   {
      super();
      System.out.println("Laptop object created");
   }

   public String getMonitor()
   {
      return monitor;
   }

   public void setMonitor(String monitor)
   {
      this.monitor = monitor;
   }

   public String getProcessor()
   {
      return processor;
   }

   public void setProcessor(String processor)
   {
      this.processor = processor;
   }

   @Override
   public String toString()
   {
      return "Laptop [hardDisk=" + hardDisk + ", monitor=" + monitor + ", processor=" + processor + "]";
   }

   public void verify()
   {
      System.out.println("Inside laptop");
   }

}
