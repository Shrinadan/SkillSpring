package com.vlog.Blogapplication.Controller;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vlog.Blogapplication.model.Post;
import com.vlog.Blogapplication.repo.PostRepo;

@Controller
public class Postcontroller {
	 @Autowired
 private PostRepo repo;
	 
	 @GetMapping("/home")
	public String index(Model model)
	{
	model.addAttribute("home", repo.findAll());
	
	return "home";
	
	}
	
	@GetMapping("/new")
	public String newP(Model model)
	{
		model.addAttribute("post", new Post());
		return "new_post";
	}
	@PostMapping("/saving")
	public String savePost(@ModelAttribute("post") Post post)
	{
		repo.save(post);
		return "redirect:/home";
	}
	@GetMapping("/edit/{id}")
	public String editpost(@PathVariable int id,Model model)
	{
		model.addAttribute("post", repo.findById(id));
		return "edit_post";
	}
	@PostMapping("/upadte")
	public String updatePost(@ModelAttribute("post") Post post)
	{
		repo.save(post);
		return "redirect/home";
	}
	@GetMapping("/delete/{id}")
	public String deletepost(@PathVariable int id)
	
	{
		repo.deleteById(id);
		return "redirect/home";
	}
	
}
