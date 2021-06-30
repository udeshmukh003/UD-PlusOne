package com.uvd.springboot;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.uvd.datapkg.Questions;
import com.uvd.service.SurveyService;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService surveyservice;
	private Object object;
	
	
	@GetMapping("/surveys/{surveyId}/questions")
	public List<Questions> retrivequestions(@PathVariable String surveyId){
			
		return surveyservice.retrieveQuestions(surveyId);
	}
	
	@PostMapping("/surveys/{surveyId}/questions")
	public ResponseEntity addQuestionToSurvey(@PathVariable String surveyId, @RequestBody Questions newQuestion)
	{
		
		Questions question = surveyservice.addQuestion(surveyId, newQuestion);
		
		if(question==null)
			return ResponseEntity.noContent().build();
		
		 URI location = ServletUriComponentsBuilder.fromCurrentRequest()
	                .path("/{id}").buildAndExpand(question.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/surveys/{surveyId}/questions/{questionId}")
	public Questions retrievDetailsofquestion(@PathVariable String surveyId, @PathVariable String questionId){
			
		return surveyservice.retrieveQuestion(surveyId, questionId);
	}

}
