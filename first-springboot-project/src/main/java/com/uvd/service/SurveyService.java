package com.uvd.service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.uvd.datapkg.Questions;
import com.uvd.datapkg.Survey;


@Component
public class SurveyService {
	
	
	private static List<Survey> surveys = new ArrayList<>();
	static {
		
		Questions question1 = new Questions("Question1",
				"Largest Country in the World", "Russia", Arrays.asList(
						"India", "Russia", "United States", "China"));
		Questions question2 = new Questions("Question2",
				"Most Populus Country in the World", "China", Arrays.asList(
						"India", "Russia", "United States", "China"));
		Questions question3 = new Questions("Question3",
				"Highest GDP in the World", "United States", Arrays.asList(
						"India", "Russia", "United States", "China"));
		Questions question4 = new Questions("Question4",
				"Second largest english speaking country", "India", Arrays
						.asList("India", "Russia", "United States", "China"));
		
		List<Questions> questions = new ArrayList<>(Arrays.asList(question1,question2,question2,question4));
		
		Survey survey = new Survey("Survey1", "My Favorite Survey","Description of the Survey",questions);
		
		surveys.add(survey);
		
	}
	
	public List<Survey> retrieveAllSurveys() {
		return surveys;
	}
	
	public Survey retrieveSurvey(String surveyId) {
		for (Survey survey : surveys) {
			if (survey.getId().equals(surveyId)) {
				return survey;
			}
		}
		return null;
	}
	
	public List<Questions> retrieveQuestions(String surveyId) {
		Survey survey = retrieveSurvey(surveyId);

		if (survey == null) {
			return null;
		}

		return survey.getQuestions();
	}
	
	public Questions retrieveQuestion(String surveyId, String questionId) {
		Survey survey = retrieveSurvey(surveyId);

		if (survey == null) {
			return null;
		}

		for (Questions question : survey.getQuestions()) {
			if (question.getId().equals(questionId)) {
				return question;
			}
		}

		return null;
	}
	private SecureRandom random = new SecureRandom();

	public Questions addQuestion(String surveyId, Questions question) {
		Survey survey = retrieveSurvey(surveyId);

		if (survey == null) {
			return null;
		}

		String randomId = new BigInteger(130, random).toString(32);
		question.setId(randomId);

		survey.getQuestions().add(question);

		return question;
	}
	
	
	
	

}
