package sda.java9.wpj.advanced.oop.course.people;

import sda.java9.wpj.advanced.oop.course.rooms.*;
import sda.java9.wpj.advanced.oop.course.content.*;

public class Trainer {
    
    private String name;
    private ClassRoom classRoom;
    
    public void openRoom(ClassRoom room) {
        room.setIsOpen(true);
    }
    
    public void enterRoom(ClassRoom room) {
        if (!room.getIsOpen()) {
            if (room.getTrainer() != null) {
                throw new IllegalStateException("Trener juz jest w pokoju!");
            }
            this.openRoom(room);
        }
        this.classRoom = room;
        room.setTrainer(this);
    }  
    
    public String sayGreetings() {
        String greet = "Witajcie!";
        greet += "\n\nBądźcie pozdrowieni szczęśliwi, którzy trafiliście na te zajęcia!";
        greet += "\nJESTEM... " + this.name.toUpperCase();
        return greet;
    }
    
	public String sayCourseTechnicalInfo(Course course)
	{
		return "Ja od siebie mogą dodać trochę dokładniej, że " + course.getLongDescription();
	}
	
	public String sayCourseWprowadzenieDoJavaInfo (CourseBlock courseBlock)
	{
		return "Wypada bym przedstawił wam także dokładniejsze informacje o blokach kursu, które bedziemy przerabiać: " +
		courseBlock.getOverallInformation() + " " + courseBlock.getTechnicalInformation();
	}
	
	public String sayBreak (Course courseBreak)
	{
	return "Zsynchronizujmy zegarki. Teraz czas na " + courseBreak.getCourseBreak();
	}
	
	
		
	
    public Trainer() {}
    
    public Trainer(String name) {
        this.name = name;
    }
    
    public ClassRoom getRoom() {
        return classRoom;
    }  
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}