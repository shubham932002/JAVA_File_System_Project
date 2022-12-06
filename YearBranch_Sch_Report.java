// Porgram to Produce Yearwise Placement Drives Schedule Report
import java.io.*;
public class YearBranch_Sch_Report
{
    YearBranch_Sch_Report(String yr, String bran)
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Sch3.html"));
            BufferedReader br = new BufferedReader(new FileReader("Drive_Schedule.txt"));
            BufferedReader br1;
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>BatchYear-Branch wise Placement Drives Schedule Information Report</h1></center>");
            bw.write("<br>");
            /*bw.write("<h3>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for the Batch Year : "+"20"+ yr+ "</h3>");*/
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the Batch Year : "+ yr+ "</h3>");
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the Branch : "+ bran+ "</h3>");
            bw.write("<center>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>Sch. ID No.</th>");
            bw.write("<th>Sch. Date</th>");
            bw.write("<th>Company ID</th>");
            bw.write("<th>Short Name</th>");
            bw.write("<th>Full Name</th>");
            bw.write("<th>Drive Type</th>");
            bw.write("<th>Jobs Offered</th>");
            bw.write("</tr>");

            String bran1 = "";
            if(bran.equals("Computer"))
                bran1 = "Comp";
            else if(bran.equals("IT"))
                bran1 = "IT";
            else if(bran.equals("AI&DS"))
                bran1 = "AIDS";
            else if(bran.equals("ETC"))
                bran1 = "ETC";
            else if(bran.equals("Electronics"))
                bran1 = "Elex";
            else if(bran.equals("Mechanical"))
                bran1 = "Mech";
            else if(bran.equals("Civil"))
                bran1 = "Civi";
            else if(bran.equals("Electrical"))
                bran1 = "Elec";
            else if(bran.equals("Instrumentation"))
                bran1 = "Inst";
            else if(bran.equals("Chemical"))
                bran1 = "Chem";
            else if(bran.equals("Production"))
                bran1 = "Prod";

            String sch, comp;
            String schdata[], compdata[], by[], brn[];
            int chk1 = 0, chk2 =0;
            while((sch = br.readLine()) != null)
            {
                schdata = sch.split("\\$");
                by = schdata[4].split(" ");
                chk1 = 0;
                for(int i=0; i<by.length; i++)
                {
                    if(by[i].equals(yr))
                    {
                        chk1 = 1;
                        break;
                    }
                }
                brn = schdata[5].split(" ");
                chk2 = 0;
                for(int i=0; i<brn.length; i++)
                {
                    if(brn[i].equals(bran1))
                    {
                        chk2 = 1;
                        break;
                    }
                }
                if(chk1 == 1 && chk2 == 1)
                {
                    bw.write("<tr>");
                    bw.write("<td>" +schdata[0]+ "</td>");
                    bw.write("<td>" +schdata[1]+ "</td>");
                    bw.write("<td>" +schdata[2]+ "</td>");
                    br1 = new BufferedReader(new FileReader("JobCompanies.txt"));
                    while((comp = br1.readLine()) != null)
                    {
                        compdata = comp.split("\\$");
                        if(schdata[2].equals(compdata[0]))
                        {
                            bw.write("<td>" +compdata[1]+ "</td>");
                            bw.write("<td>" +compdata[2]+ "</td>");
                        }
                    }
                    br1.close();
                    bw.write("<td>" +schdata[3]+ "</td>");
                    bw.write("<td>" +schdata[6]+ "</td>");          
                    bw.write("</tr>");
                }
            }
            bw.write("</table>");
            bw.write("</center>");  
            bw.write("</body>");
            bw.write("</html>");
            br.close();
            bw.close();
            Runtime rt = Runtime.getRuntime();
            rt.exec("Explorer Sch3.html");
        }
        catch(IOException ioe1)
        {
        }
    }
}