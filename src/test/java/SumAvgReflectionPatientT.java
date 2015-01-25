
import com.cpe4235.lecture4.Ip;
import com.cpe4235.lecture4.Op;
import com.cpe4235.lecture4.Patient;
import com.cpe4235.lecture4.YesNo;
import java.lang.reflect.Method;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author RainWhileLoop
 */
public class SumAvgReflectionPatientT extends TestCase {

    private int count(Patient patient) throws Exception {
        int count = 0;
        Method[] methods = patient.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                count++;
            }
        }
        return count;
    }

    private float average(Patient patient) throws Exception {
        return (float) sum(patient) / count(patient);
    }

    private int sum(Patient patient) throws Exception {
        int sum = 0;
        Method[] methods = patient.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(patient);
                sum = sum + yn.getScore();
            }
        }
        return sum;
    }

    public void testSumIp() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.Yes);
        ip.setRole2(YesNo.No);
        ip.setRole3(YesNo.No);
        ip.setRole4(YesNo.Yes);
        ip.setRole5(YesNo.Yes);
//        assertEquals(3, sum(ip));
        System.out.println(average(ip));
        assertEquals(0.6, average(ip));
    }

//    public void testSumOp() throws Exception {
//        Op op = new Op();
//        op.setRole1(YesNo.Yes);
//        op.setRole2(YesNo.Yes);
//        op.setRole3(YesNo.No);
//        op.setRole4(YesNo.Yes);
//        op.setRole5(YesNo.No);
//        op.setRole6(YesNo.Yes);
//        op.setRole7(YesNo.Yes);
//        assertEquals(5, sum(op));
//    }
    
}
