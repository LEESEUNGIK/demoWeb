package com.example.demo.Controller;

import com.example.demo.Dto.idInfoDTO;
import com.example.demo.Type.identifiedType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @RequestMapping("/welcome")
    public String welcome(ModelMap model){
        idInfoDTO a  = new idInfoDTO();
        System.out.println(identifiedType.ALIEN_REGISTER);
        System.out.println(identifiedType.DRIVER_LICENSE);
        System.out.println(identifiedType.valueOf("DRIVER_LICENSE"));
       for(identifiedType b : identifiedType.values()){
           System.out.println(b.getText());
           }
           a.setIdentifiedType(identifiedType.values());
        model.addAttribute("name","hanpass");
        model.addAttribute("identified",a);
        System.out.println("idid"+a.toString());
        return "welcome";
    }

    @RequestMapping("/main")
    public String main(ModelMap model, @RequestParam String name, @ModelAttribute identifiedType identifiedType){
        System.out.println(name);
        model.addAttribute("name",name);
        System.out.println(identifiedType.toString());
        System.out.println(identifiedType.getText());
        return "main";
    }

    @RequestMapping("/selectInfo")
    public String selectInfo(){

        return "info";
    }
}
