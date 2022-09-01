package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String[] nameOfSchool, String[] scores) {
        int highestScore = 0;
        String nameOfSchoolHavingHighestMarks = null;
        try {
            int[] scoresInt = new int[scores.length];
            for (int index = 0; index < scores.length; index++) {
                scoresInt[index] = Integer.parseInt(scores[index]);
            }
            for (int index = 0; index < scores.length; index++) {
                if (highestScore < scoresInt[index]) ;
                highestScore = scoresInt[index];
                nameOfSchoolHavingHighestMarks = nameOfSchool[index];


            }

            return nameOfSchoolHavingHighestMarks;
        } catch (NumberFormatException exception) {
            return exception.toString();
        }
    }


    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String[] name) {
        String[] upperCase = new String[name.length];
        try {
            for (int counter = 0; counter < name.length; counter++) {
                upperCase[counter] = name[counter].toUpperCase();
            }
        } catch (NullPointerException exception) {
            throw new RuntimeException(exception);
        }
        return upperCase;

    }
}







