package com.shopping.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopping.model.EmployeeDTO;
import com.shopping.services.EmployeeService;

@Controller
public class LoginController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping({ "/", "/login" })
	public String welcome() {

		return "login";

	}

	@PostMapping("/employeeLogin")
	public String login(@RequestParam String emailId, @RequestParam String password, Model model, HttpSession session) {
		EmployeeDTO employeeDTO = employeeService.authUser(emailId, password);
		if (employeeDTO != null) {
			model.addAttribute("Email", employeeDTO.getEmailId());
			model.addAttribute("employee", employeeDTO);
			model.addAttribute("employeeiId", employeeDTO.getEmployeeId());

			session.setAttribute("Email", employeeDTO.getEmailId());
			session.setAttribute("password", employeeDTO.getPassword());

			return "viewEmployee";
		} else {
			model.addAttribute("message", "Sorry username and password are not correct!");
			return "login";
		}
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {

		List<EmployeeDTO> empList = employeeService.findAll();
		model.addAttribute("employeeList", empList);
		return "employeeList";

	}

	@GetMapping("/editEmployee")
	public String editEmployee(@RequestParam int sid, Model model) {
		// Adding signupList into request scope
		EmployeeDTO entity = employeeService.findById(sid);
		model.addAttribute("entity", entity);
		return "editEmployee";
	}

	@GetMapping("/deleteEmployee")
	public String deleteUser(@RequestParam int sid) {
		employeeService.deleteById(sid);
		return "redirect:/dashboard";
	}

	@GetMapping("/pagination")
	public String showPaginatedData(@RequestParam(required = false, defaultValue = "1") String pageid, Model model) {
		int pageSize = 4;
		int ppageid = Integer.parseInt(pageid);
		if (ppageid <= 0) {
			ppageid = 1;
		}
		// 2
		// 6
		if (ppageid > 1) {
			ppageid = (ppageid - 1) * pageSize + 1;
		}
		List<EmployeeDTO> empList = employeeService.getDTO(ppageid, pageSize);
		int totalRecords = employeeService.findTotalEmployee();
		model.addAttribute("employeeList", empList);
		model.addAttribute("recordStarts", ppageid);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("pageid", pageid);
		model.addAttribute("totalRecords", totalRecords);
		return "pagination";
	}

	@GetMapping("/viewEmployee")
		public String viewEmployePage() {
			return "viewEmployee";
	   }

	@PostMapping("/uploadImage")
	public String uploadImage(@ModelAttribute EmployeeDTO dtoEmploye ) throws IOException {
		byte[] bImage = dtoEmploye.getPhoto().getBytes();
		dtoEmploye.setBphoto(bImage);
	   employeeService.upload(dtoEmploye);

		return "viewEmployee";
}
}
