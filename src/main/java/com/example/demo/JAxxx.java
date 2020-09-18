package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller // using rest controller we can directly return the object and object data
public class JAxxx {
	
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String sai()
	{
		return "insert.jsp";
	}
	/*
	 * @RequestMapping("/add") public Object Teja(Alien a , ModelMap m) {
	 * 
	 * Alien s = repo.save(a); m.addAttribute("sai", s); return "sai.jsp"; }
	 */
	/*
	 * @GetMapping(path="/find",produces={"application/json"}) public ModelAndView
	 * yadav(@RequestParam("no") int no) { ModelAndView mv = new
	 * ModelAndView("show.jsp"); Alien al = repo.findById(no).orElse(new Alien());
	 * System.out.println(repo.findByName("sai")); mv.addObject("sa",al); return mv
	 * ; }
	 */

@RequestMapping("/add")
public String add(Alien a)
{
	 repo.save(a);
	return "sai.jsp";
}

/*
 * @RequestMapping("/hi")
 * 
 * @ResponseBody public List<Alien> getAliens() { return null;// repo.findAll();
 * }
 * 
 * @GetMapping("/findby/{no}")
 * 
 * @ResponseBody public Optional<Alien> gotAlien(@PathVariable("no") int no) {
 * return repo.findById(no); }
 */
}
