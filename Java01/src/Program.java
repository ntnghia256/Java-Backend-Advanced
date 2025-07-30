import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department d1 = new Department(1, "Sale");
		Department d2 = new Department(2, "Marketing");
		Department d3 = new Department(3, "IT");
		
		Account a1 = new Account(1, "a1@gmail.com", "a1", "User One", d1, PositionName.DEV, new Date());
        Account a2 = new Account(2, "a2@gmail.com", "a2", "User Two", d2, PositionName.TEST, new Date());
        Account a3 = new Account(3, "a3@gmail.com", "a3", "User Three", d3, PositionName.PM, new Date());

        Group g1 = new Group(1, "Java Group", 1, new Date());
        Group g2 = new Group(2, "Python Group", 2, new Date());
        Group g3 = new Group(3, "SQL Group", 3, new Date());

        GroupAccount ga1 = new GroupAccount(1, 1, new Date());
        GroupAccount ga2 = new GroupAccount(2, 2, new Date());
        GroupAccount ga3 = new GroupAccount(3, 3, new Date());

        TypeQuestion tq1 = new TypeQuestion(1, "Essay");
        TypeQuestion tq2 = new TypeQuestion(2, "Multiple-Choice");
        TypeQuestion tq3 = new TypeQuestion(3, "True/False");

        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
        CategoryQuestion cq2 = new CategoryQuestion(2, ".NET");
        CategoryQuestion cq3 = new CategoryQuestion(3, "SQL");

        Question q1 = new Question(1, "What is JVM?", 1, 1, 1, new Date());
        Question q2 = new Question(2, "What is .NET Core?", 2, 2, 2, new Date());
        Question q3 = new Question(3, "Write an SQL join", 3, 1, 3, new Date());

        Answer ans1 = new Answer(1, "Java Virtual Machine", 1, true);
        Answer ans2 = new Answer(2, ".NET Framework", 2, true);
        Answer ans3 = new Answer(3, "SELECT * FROM ...", 3, true);

        Exam ex1 = new Exam(1, "EX001", "Java Basic", 1, 60, 1, new Date());
        Exam ex2 = new Exam(2, "EX002", ".NET Advanced", 2, 90, 2, new Date());
        Exam ex3 = new Exam(3, "EX003", "SQL Mastery", 3, 75, 3, new Date());

        ExamQuestion eq1 = new ExamQuestion(1, 1);
        ExamQuestion eq2 = new ExamQuestion(2, 2);
        ExamQuestion eq3 = new ExamQuestion(3, 3);
	}

}
