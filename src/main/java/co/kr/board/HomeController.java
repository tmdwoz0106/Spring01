package co.kr.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.board.service.BoardService;

@Controller
public class HomeController {
	@Autowired
	public BoardService service;
	
	@RequestMapping(value = "/home.do" , method = RequestMethod.GET)
	public String mainPage() {
		return "home";
	}
	
	@RequestMapping(value = "/test.do" , method = RequestMethod.POST)
	public String Test(String id , HttpServletRequest request) {
		request.setAttribute("cnt", service.cnt());
		return "home";
	}
}
