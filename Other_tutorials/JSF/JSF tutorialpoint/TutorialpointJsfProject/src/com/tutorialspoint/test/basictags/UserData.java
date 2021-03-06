package com.tutorialspoint.test.basictags;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

   private static final long serialVersionUID = 1L;

//   public String[] data = {"1","2","3"};
//
//   public String[] getData() {
//      return data;
//   }
//
//   public void setData(String[] data) {
//      this.data = data;
//   }
   
   public String data = "1";

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   public String showResult(){
      FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = 
      fc.getExternalContext().getRequestParameterMap();
      data =  params.get("username"); 
      return "paramResult";
   }
}