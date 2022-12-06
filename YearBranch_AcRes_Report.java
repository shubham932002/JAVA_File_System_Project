// Porgram to Produce Year and Branchwise Students Academic Reults Information Report
import java.io.*;
public class YearBranch_AcRes_Report
{
    
    YearBranch_AcRes_Report(String yr, String brn)
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("AcResrep2.html"));
            BufferedReader br1 = new BufferedReader(new FileReader("AcResults.txt"));
            BufferedReader br2;
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>Yearwise, Branchwise Students Academic Results Information Report</h1></center>");
            bw.write("<br>");
            /*bw.write("<h3>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for the Batch Year : "+"20"+ yr+ "</h3>");*/
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the Batch Year : "+"20"+ yr+ "</h3>");
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the Branch : "+ brn+ "</h3>");
            bw.write("<center>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>PRN</th>");
            bw.write("<th>Student Name</th>");
            bw.write("<th>Div</th>");
            bw.write("<th>Roll No.</th>");
            bw.write("<th>Sem-1 %</th>");
            bw.write("<th>Sem-2 %</th>");
            bw.write("<th>Sem-3 %</th>");
            bw.write("<th>Sem-4 %</th>");
            bw.write("<th>Sem-5 %</th>");
            bw.write("<th>Sem-6 %</th>");
            bw.write("<th>No. of Active Backlogs</th>");
            bw.write("</tr>");
            String stud, reg, studname = "";
            String data[], regdata[];
            String batyear, branch, div, rollno, bran;
            if(brn.equals("Electronics"))
                bran = "Ec";
            else
                bran = brn.substring(0, 2);
            while((stud = br1.readLine()) != null)
            {
                data = stud.split("\\$");
                batyear = data[0].substring(0, 2);
                branch = data[0].substring(2, 4);
                div = data[0].substring(4, 5);
                rollno = data[0].substring(5, 7);
                if(batyear.equals(yr) && bran.equals(branch))
                {
                    bw.write("<tr>");
                    bw.write("<td>" +data[0]+ "</td>");
                    //-----------------------------------------------
                    br2 = new BufferedReader(new FileReader("Registration.txt"));
                    while((reg = br2.readLine()) != null)
                    {
                        regdata = reg.split("\\$");
                        if(data[0].equals(regdata[0]))
                        {
                            studname = regdata[1];
                            break;
                        }
                    }
                    br2.close();
                    //-----------------------------------------------
                    bw.write("<td>" +studname+ "</td>");   
                    bw.write("<td>" +div+ "</td>");
                    bw.write("<td>" +rollno+ "</td>");
                    bw.write("<td>" +data[1]+ "</td>");
                    bw.write("<td>" +data[2]+ "</td>");
                    bw.write("<td>" +data[3]+ "</td>");
                    bw.write("<td>" +data[4]+ "</td>");
                    bw.write("<td>" +data[5]+ "</td>");                
                    bw.write("<td>" +data[6]+ "</td>");                             
                    bw.write("<td>" +data[7]+ "</td>");
                    bw.write("</tr>");
                }
            }
            bw.write("</table>");
            bw.write("</center>");
            bw.write("</body>");
            bw.write("</html>");
            br1.close();
            bw.close();
            Runtime rt = Runtime.getRuntime();
            rt.exec("Explorer AcResrep2.html");
        }
        catch(IOException ioe1)
        {
        }
    }
}

