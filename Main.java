package odev;

public class Main {

	public static void main(String[] args) {
		
	Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)","2 ay sürecek Yazýlým geliþtirme kampý..","Engin Demirog");
	Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA & REACT)","2 ay sürecek Yazýlým geliþtirme kampý..","Engin Demirog");
	Course course3 = new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs","Temel Programlama Mantýðý..","Engin Demirog");
	System.out.println("EÐÝTÝMLERÝMÝZ :");
	Course[]  courses = {course1,course2,course3};
	for (Course course : courses) {
		System.out.println(course.name + " , " + course.description + " , " + course.teach);
	}
	
	Member member1 = new Member(1,"Hatice","Yýlmaz");
	Member member2 = new Member(2,"Gamze","Kýlýç");
	Member member3 = new Member(3,"Nejla","Yaþlý");
	System.out.println("ÜYELERÝMÝZ :");
	Member[] members = {member1,member2,member3};
	for (Member member : members) {
		System.out.println(member.name + "  "+ member.surname);
	}
	
	CourseManager courseManager = new CourseManager();
	System.out.println("ÜYELERÝMÝZÝN KAYIT OLDUÐU EÐÝTÝMLER :");
	courseManager.add(course1,member1);
	courseManager.add(course2,member2);
	courseManager.add(course3,member3);
	}
	
}
