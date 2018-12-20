# JAVA 교육 정리

## H.JavaSwing
### Java GUI (Swing API)


### MVC Pattern (MVC : Model–View–Controller)
Example Code : javaSwingMVC

애플리케이션을 Model, View, Controller 영역으로 구분하여 개발합니다. 영역간의 결합도를 최소화한 디자인 패턴입니다. 장점은 디자이너, 개발자 영역이 분리됨으로써 분업화가 쉬워지며, 유지보수가 용이합니다.

* Model
모델의 상태에 변화가 있을 때 컨트롤러와 뷰에 이를 통보한다. 이와 같은 통보를 통해서 뷰는 최신의 결과를 보여줄 수 있고, 컨트롤러는 모델의 변화에 따른 적용 가능한 명령을 추가·제거·수정할 수 있다. 어떤 MVC 구현에서는 통보 대신 뷰나 컨트롤러가 직접 모델의 상태를 읽어 오기도 한다.

<pre><code>
public class Student {
   private String rollNo;
   private String name;
   
   public String getRollNo() {
      return rollNo;
   }
   
   public void setRollNo(String rollNo) {
      this.rollNo = rollNo;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
}
</code></pre>

* View
사용자가 볼 결과물을 생성하기 위해 모델로부터 정보를 얻어 온다.

<pre><code>
public class StudentView {
   public void printStudentDetails(String studentName, String studentRollNo){
      System.out.println("Student: ");
      System.out.println("Name: " + studentName);
      System.out.println("Roll No: " + studentRollNo);
   }
}
</code></pre>

* Controller
모델에 명령을 보냄으로써 모델의 상태를 변경할 수 있다. 
(예: 워드 프로세서에서 문서를 편집하는 것) 또, 컨트롤러가 관련된 뷰에 명령을 보냄으로써 
모델의 표시 방법을 바꿀 수 있다. (문서를 스크롤하는 것)

<pre><code>
public class StudentController {
   private Student model;
   private StudentView view;

   public StudentController(Student model, StudentView view){
      this.model = model;
      this.view = view;
   }

   public void setStudentName(String name){
      model.setName(name);    
   }

   public String getStudentName(){
      return model.getName();    
   }

   public void setStudentRollNo(String rollNo){
      model.setRollNo(rollNo);      
   }

   public String getStudentRollNo(){
      return model.getRollNo();     
   }

   public void updateView(){           
      view.printStudentDetails(model.getName(), model.getRollNo());
   }  
}
</code></pre>

* Program Start (MVC 패턴)

<pre><code>
public class MVCPatternDemo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
   }

   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
}
</code></pre>
