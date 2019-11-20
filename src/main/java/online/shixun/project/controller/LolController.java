package online.shixun.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import online.shixun.project.pojo.Theme;
import online.shixun.project.service.LolService;

@Controller
public class LolController {
	
	@Autowired
	LolService lolService;

	@RequestMapping("/show")
	public String index(HttpSession session,Model model) {
		//往前端传一个name
		session.setAttribute("name", "User");
		//连表查询数据库信息
		List<Theme> loltheme = lolService.getallLOL();
		model.addAttribute("loltheme", loltheme);
		return "index";
	}
	@RequestMapping("/sule")
	public String sule() {
		
		return "index";
	}
	/**
	 * 进入IG页面
	 * @return
	 */
	@RequestMapping("/queryigx")
	public String queryigx() {
		
		return "igx";
	}
	/**
	 * IG页面返回主页面
	 * @return
	 */
	@RequestMapping("/navigation")
	public String toneigx() {
		return "redirect:/show";
	}
}
