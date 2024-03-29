package snhu.jukebox.playlist;

import snhu.student.playlists.*;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public StudentList(){
	}

	public List<String> getStudentsNames() {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		String StudentName1 = "TestStudent1Name";
		studentNames.add(StudentName1);
		
		String StudentName2 = "TestStudent2Name";
		studentNames.add(StudentName2);
		
		String AllanGibbons = "Allan Gibbons";
		studentNames.add(AllanGibbons);
		
		String JadaThibodeaux = "Jada Thibodeaux";
		studentNames.add(JadaThibodeaux);
		
		//Module 5 Code Assignment
		//Add your name to create a new student profile
		//Use template below and put your name in the areas of 'StudentName'
		//String StudentName3 = "TestStudent3Name";
		//studentNames.add(StudentName3);
		
		return studentNames;
	}

	public Student GetStudentProfile(String student){
		Student emptyStudent = null;
	
		switch(student) {
		   case "TestStudent1_Playlist":
			   TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();
			   Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());
			   return TestStudent1;
			   
		   case "TestStudent2_Playlist":
			   TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
			   Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
			   return TestStudent2;
			   
		   case "Allan Gibbons":
			   AllanGibbons_Playlist allanGibbons = new AllanGibbons_Playlist();
			   Student AllanGibbons = new Student("Allan Gibbons", allanGibbons.StudentPlaylist());
			   return AllanGibbons;
			   
		   case "TestJadaThibodeaux_Playlist":
			   JadaThibodeaux_Playlist jadaThibodeaux = new JadaThibodeaux_Playlist();
			   Student JadaThibodeaux = new Student("Jada Thibodeaux", jadaThibodeaux.StudentPlaylist());
			   return JadaThibodeaux;
		
			      
		   //Module 6 Code Assignment - Add your own case statement for your profile. Use the above case statements as a template.

		}
		return emptyStudent;
	}
}
