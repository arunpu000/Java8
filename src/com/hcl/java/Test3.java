package com.hcl.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test3 {

   public static void main(String args[]) {

      try {
         FileInputStream fstream = new FileInputStream("E:\\hcl\\2n\\testing.log");
         BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

         String lines;
         String key = "";
         boolean start = false;
         List<String> result = new ArrayList<>();

         while ((lines = br.readLine()) != null) {
            if (start) {
               result.add(lines);
            }
            if (lines.contains(key)) {
               start = true;
            }
         }

         HashMap<Integer, Integer> usercount = new HashMap<>();
         for (int i = 1; i <= 24; i++) {
            usercount.put(i, 0);

         }

         for (String line : result) {
            if (line != null) {
               char[] c = line.toCharArray();
               if (c.length != 0 && c[0] == '~') {
                  String[] splited = line.split("T");
                  String timestamp = new String(splited[1]);

                  String[] time = timestamp.split(":");
                  String hr = new String(time[0]);

                  Integer i = usercount.get(new Integer(hr));

                  usercount.put(new Integer(hr), i + 1);
               }

            }
         }

         System.out.println(usercount);

      } catch (IOException ex) {
         // throw exception
      }
   }

}


