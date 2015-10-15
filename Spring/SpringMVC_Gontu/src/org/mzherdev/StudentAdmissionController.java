package org.mzherdev;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
			ModelAndView modelAndView = new ModelAndView("/admissionForm");
			return modelAndView;
	}
	
	@RequestMapping(value="/submit.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student,
										BindingResult result
//											@RequestParam("studentName") String name,
//											@RequestParam("studentHobby") String hobby
											) {
//			ModelAndView modelAndView = new ModelAndView("/admissionSuccess");
//			modelAndView.addObject("msg",
//					"Details submitted: Name " + name + ", hobby: " + hobby);
			
//			Student student = new Student();
//			student.setStudentName(name);
//			student.setStudentHobby(hobby);
		
		if(result.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("/admissionForm");
			return modelAndView;
		}
		
			ModelAndView modelAndView = new ModelAndView("/admissionSuccess");
//			modelAndView.addObject("msg",
//					"You entered following data: ");
//			modelAndView.addObject("student", student);
			
			return modelAndView;
	}
	
	@ModelAttribute
	public void addingCommonAttrs(Model model) {
		model.addAttribute("msg", "Some common message");
	}
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
////		binder.setDisallowedFields(new String[] {"studentMobile"});
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
//		binder.registerCustomEditor(Date.class,  "studentDOB", new CustomDateEditor(dateFormat, false));
//		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
//	}
}
