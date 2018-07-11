package a.b.pr;

import java.util.List;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
//		Country cto = new Country();
//		cto.setCode(1);
//		cto.setName("name");
//		mapper.insertCountry(cto);
//		Country country = mapper.selectCountry().get(0);
//		System.out.println(country.getCode());
//		System.out.println(country.getName());
		
		List<Country> country = mapper.selectCountry();
		model.addAttribute("country",country);
		return "home";
	}
	
}
