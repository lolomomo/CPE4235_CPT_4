/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cpe4235.lecture4.Ip;
import com.cpe4235.lecture4.YesNo;
import junit.framework.TestCase;

/**
 *
 * @author RainWhileLoop
 */
public class SumAveragePatientT extends TestCase {

    private int sum(Ip ip) {

        return ip.getRole1().getScore()
                + ip.getRole2().getScore()
                + ip.getRole3().getScore()
                + ip.getRole4().getScore()
                + ip.getRole5().getScore();
    }

    public void testSum() {
        Ip ip = new Ip(YesNo.Yes, YesNo.No, YesNo.Yes, YesNo.Yes, YesNo.No);
        assertEquals(3, sum(ip));
    }
}
