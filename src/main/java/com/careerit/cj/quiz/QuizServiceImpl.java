package com.careerit.cj.quiz;

import lombok.SneakyThrows;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizServiceImpl implements QuizService{
    @Override
    @SneakyThrows
    public void startQuiz(String username, QuizType type) {
        Quiz quiz = getQuiz(type);
        List<Question> questions = quiz.getQuestions();
        System.out.println("Welcome :"+username);
        System.out.println("You have select quiz :"+type+" and total questions are :"+questions.size());
        System.out.println("Please wait your quiz is going to start....");
        TimeUnit.SECONDS.sleep(3);
        int correctAnswers = 0;
        // TODO add logic for conducting quiz
        System.out.println("Please wait, we are preparing your result....");
        TimeUnit.SECONDS.sleep(3);
        showQuizResult(username,correctAnswers,questions.size());
    }

    private void showQuizResult(String username, int correctAnswers, int size) {
        // TODO add logic for showing result
    }

    public Quiz getQuiz(QuizType type){
       return JsonReaderUtil.readJson(type);
    }
}
