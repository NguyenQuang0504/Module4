package com.controller;

import com.model.Music;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.service.IMusicService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private IMusicService iMusicService;

    @GetMapping("/music")
    public ModelAndView listMusic(){
        List<Music> list = iMusicService.findAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list1", list);
        return modelAndView;
    }
    @GetMapping("/create")
    public String create(ModelMap modelMap){
        modelMap.addAttribute("music", new Music());
        return "create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Music music){
        iMusicService.save(music);
        return "redirect:/music";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        iMusicService.delete(id);
        return "redirect:/music";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id, ModelMap modelMap){
        Music music = iMusicService.findById(id);
        modelMap.addAttribute("music", music);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Music music){
        iMusicService.save(music);
        return "redirect:/music";
    }
}
