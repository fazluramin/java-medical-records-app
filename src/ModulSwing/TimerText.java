/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Aegis
 */
public class TimerText extends JLabel {
            ActionListener listener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent act)
            {
                // TODO Auto-generated method stub

                String sJam = " ";
                String sMenit = " ";
                String sDetik = " ";

                Date today = new Date();
                @SuppressWarnings("deprecation")
                int now_Jam = today.getHours(); //Mengambil jam saat ini
                @SuppressWarnings("deprecation")
                int now_Menit = today.getMinutes(); // Mengambil menit saat ini
                @SuppressWarnings("deprecation")
                int now_Detik = today.getSeconds(); //Mengambil detik saat ini

                if(now_Jam <= 9)
                {
                    sJam = "0"; //Menambah angka 0 di depan Jam
                }
                if(now_Menit <= 9)
                {
                    sMenit = "0";  //Menambah angka 0 di depan Menit
                }
                if(now_Detik <= 9)
                {
                    sDetik = "0"; //Menambah angka 0 di depan Detik
                }

                String Jam = sJam + Integer.toString(now_Jam);  //Merubah type data int now_Jam menjadi String
                String Menit = sMenit + Integer.toString(now_Menit); //Merubah type data int now_Menit menjadi String
                String Detik = sDetik + Integer.toString(now_Detik); //Merubah type data int now_Detik menjadi String
                

		            }
		 };

		       Timer waktu = new Timer(1000,listener);
		        
}
