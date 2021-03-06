package com.example.duynguyen.sample.utils;

public class Utils {
	
	//Email Validation pattern
	public static final String emailRegEx = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
	//Username Validation pattern
	public static final String userNameRegEx = "[a-zA-Z0-9._]";
	//StudentKey
    public static final String studentKeyRegEx = "myStudent[0-9]{5,5}[a-zA-Z0-9._]*";

	//Fragments Tags
	public static final String Login_Fragment = "Login_Fragment";
	public static final String SignUp_Fragment = "SignUp_Fragment";
	public static final String ForgotPassword_Fragment = "ForgotPassword_Fragment";

	//User Types
    public static final String PARENT= "parent";
    public static final String TEACHER= "teacher";
    public static final String STUDENT= "student";

    //Firebase Childs
    public static final String USERS_CHILD= "users";
    public static final String CLASSES_CHILD= "classes";
    public static final String STUDENTS_CHILD= "students";
    public static final String PARENTS_CHILD= "parents";
    public static final String TEACHER_CHILD= "teacher";




}
