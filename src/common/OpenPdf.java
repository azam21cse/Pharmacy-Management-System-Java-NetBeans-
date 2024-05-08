/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;
import dao.PharmacyUtils;

public class OpenPdf {
    public static void openById(String id) {
        try {
            String filePath = PharmacyUtils.billPath + File.separator + id + ".pdf";
            File file = new File(filePath);
            
            if (file.exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + filePath);
            } else {
                JOptionPane.showMessageDialog(null, "File doesn't exist!");
            }
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while opening the file.");
        }
    }
}
