package com.example.android.reportcardandroid;

import java.util.ArrayList;


public class ReportCard {
    /**
     * Constant variable for the name of the school
     */
    static final private String SCHOOL_NAME = "XYZ";
    // Represent the name of the student
    private String mStudentName;
    // ArrayList to store reportCardObjects
    private ArrayList<ReportCardObject> mReportCardObject;

    /**
     * Constructor
     *
     * @param studentName       is the name of the student
     * @param reportCardObjects objects
     */
    public ReportCard(String studentName, ArrayList<ReportCardObject> reportCardObjects) {
        setmStudentName(studentName);
        mReportCardObject = reportCardObjects;
    }

    /**
     *
     * @param mReportCardObject sets object
     */
    public void setmReportCardObject(ArrayList<ReportCardObject> mReportCardObject) {
        this.mReportCardObject = mReportCardObject;
    }

    /**
     *
     * @return object
     */
    public ArrayList<ReportCardObject> getmReportCardObject() {
        return mReportCardObject;
    }

    /**
     * @return the name of the student
     */
    public String getmStudentName() {
        return mStudentName;
    }

    /**
     * @param mStudentName sets the name of the student
     */
    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    /**
     * @return String objectsToString in which all the info is concatenated
     */
    public String objectsToString() {
        String objectsToString = "";
        /**
         * Constructs a string builder with no characters in it and an
         * initial capacity of 16 characters.
         */
        StringBuilder stringBuilder = new StringBuilder();
        /**
         * For-Each Loop to iterate over the collection of objects
         */
        for (ReportCardObject reportCardObject : mReportCardObject) {
            /**
             * append(Object obj)
             * Appends the string representation of the Object argument.
             */
            stringBuilder.append(reportCardObject.getmSubject() + " - " + reportCardObject.getmTeacher() + " - " + reportCardObject.getmStudentScore() + "\n");
        }
        /**
         * Concatenate all the variables and text
         */
        objectsToString = "Report Card" + "\n\n" +
                "School name: " + SCHOOL_NAME + "\n\n" +
                "Student name: " + mStudentName + "\n\n" +
                "Subject >>> Teacher >>> Score" + "\n\n" +
                stringBuilder.toString();
        return objectsToString;
    }

    /**
     * @return String objectToString from public method objectsToString()
     */
    @Override
    public String toString() {
        return objectsToString();
    }
}

class ReportCardObject {
    private String mSubject;
    private String mTeacher;
    private int mStudentScore;

    /**
     * Create a new ReportCard object.
     *
     * @param subject      is the subject that the student has been taking
     *                     (such as English, Mathematics, etc.)
     * @param teacher      is the is the particular teacher that has been teaching the subject
     * @param studentScore is the score that the teacher has given to the student
     */
    public ReportCardObject(String subject, String teacher, int studentScore) {
        setmSubject(subject);
        setmTeacher(teacher);
        setmStudentScore(studentScore);
    }

    /**
     * @return the name of the subject
     */
    public String getmSubject() {
        return mSubject;
    }

    /**
     * @param mSubject sets the name of the subject
     */
    public void setmSubject(String mSubject) {
        this.mSubject = mSubject;
    }

    /**
     * @return the name of the teacher
     */
    public String getmTeacher() {
        return mTeacher;
    }

    /**
     * @param mTeacher sets the name of the teacher
     */
    public void setmTeacher(String mTeacher) {
        this.mTeacher = mTeacher;
    }

    /**
     * @return student's score for particular subject
     */
    public int getmStudentScore() {
        return mStudentScore;
    }

    /**
     * @param mStudentScore sets the student's score for particular subject
     */
    public void setmStudentScore(int mStudentScore) {
        this.mStudentScore = mStudentScore;
    }
}
