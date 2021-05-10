package odev;

public class Main {

	public static void main(String[] args) {
		
	Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + Angular)","2 ay s�recek Yaz�l�m geli�tirme kamp�..","Engin Demirog");
	Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA & REACT)","2 ay s�recek Yaz�l�m geli�tirme kamp�..","Engin Demirog");
	Course course3 = new Course(3,"Programlamaya Giri� ��in Temel Kurs","Temel Programlama Mant���..","Engin Demirog");
	System.out.println("E��T�MLER�M�Z :");
	Course[]  courses = {course1,course2,course3};
	for (Course course : courses) {
		System.out.println(course.name + " , " + course.description + " , " + course.teach);
	}
	
	Member member1 = new Member(1,"Hatice","Y�lmaz");
	Member member2 = new Member(2,"Gamze","K�l��");
	Member member3 = new Member(3,"Nejla","Ya�l�");
	System.out.println("�YELER�M�Z :");
	Member[] members = {member1,member2,member3};
	for (Member member : members) {
		System.out.println(member.name + "  "+ member.surname);
	}
	
	CourseManager courseManager = new CourseManager();
	System.out.println("�YELER�M�Z�N KAYIT OLDU�U E��T�MLER :");
	courseManager.add(course1,member1);
	courseManager.add(course2,member2);
	courseManager.add(course3,member3);
	}
	
}
