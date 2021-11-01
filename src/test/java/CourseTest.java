import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CourseTest {
    Course course;

    @Before
    public void setup(){
        course = new Course("Computer Science", DateTime.parse("01/10/2021", DateTimeFormat.forPattern("dd/MM/yyyy")),DateTime.parse("30/06/2022",DateTimeFormat.forPattern("dd/MM/yyyy")));
    }

    @Test
    public void testCourseName(){
        Assert.assertEquals("Computer Science",course.getCourseName());
    }

    @Test
    public void testStartDate(){
        Assert.assertEquals(DateTime.parse("01/10/2021",DateTimeFormat.forPattern("dd/MM/yyyy")),course.getStartDate());
    }

    @Test
    public void testEndDate(){
        Assert.assertEquals(DateTime.parse("30/06/2022",DateTimeFormat.forPattern("dd/MM/yyyy")),course.getEndDate());
    }

    @Test
    public void testAddStudents(){
        Student student = new Student("Shain",21, DateTime.parse("11/02/2000", DateTimeFormat.forPattern("dd/MM/yyyy")),"18331093");
        course.addStudents(student);
        Assert.assertTrue(course.getStudents().contains(student));
    }

    @Test
    public void testAddModules(){
        Module module = new Module("Software Engineering","CT417");
        course.addModules(module);
        Assert.assertTrue(course.getModules().contains(module));
    }
}
