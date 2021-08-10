package com.bridgelabz;

public class MoodAnalyzer{
    public String sms;

    public MoodAnalyzer(String sms){
        this.sms = sms;
    }

    public String analyseMood(Object o) throws MoodAnalyzerException{
        try {
            if (sms.isEmpty()){
                throw new MoodAnalyzerException("Entered value is empty", MoodAnalyzerException.ExceptionType.EmptyType);
            }
            if (sms.contains("Sad")){
                return "SAD";
            }else {
                return "HAPPY";
            }
        }catch (NullPointerException npe){
            throw new MoodAnalyzerException("Enter value is null", MoodAnalyzerException.ExceptionType.NullType);
        }
    }

    public static void main(String[] args) throws MoodAnalyzerException {

        MoodAnalyzer mood2 = new MoodAnalyzer("Sad");
        MoodAnalyzer mood3 = new MoodAnalyzer("Happy");
        MoodAnalyzer mood1 = new MoodAnalyzer("");

        String moodEx2 = mood2.analyseMood(null);
        String moodEx3 = mood3.analyseMood(null);
        String moodEx1 = mood1.analyseMood(null);

        System.out.println(moodEx2);
        System.out.println(moodEx3);
        System.out.printf(moodEx1);

    }


}
