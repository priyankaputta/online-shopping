package net.ptt.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting","Welocme to spring web mvc");
		return mv;
	}
	/*
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam("greeting")String greeting)
	{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("greeting","greeting");
	return mv;
}
	
	
	@RequestMapping(value="/test/greeting")
	public ModelAndView test1(@PathVariable("greeting")String greeting)
	{
		if(greeting==null)
		{
			greeting="hellothere";
		}
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("greeting","greeting");
	return mv;
}
*/
}