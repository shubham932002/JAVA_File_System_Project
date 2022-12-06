// Porgram to Produce BatchYear-Branch wise Conducted Drives Information Report
import java.io.*;
public class YearBranch_Drives_Report
{
    YearBranch_Drives_Report(String yr, String bran)
    {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Drives3.html"));
            BufferedReader br = new BufferedReader(new FileReader("Conducted_Drives.txt"));
            BufferedReader br1;
            BufferedReader br2;
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<center><h1>PCCOER Ravet</h1></center>");     
            bw.write("<center><h1>BatchYear-Branch wise Comducted Placement Drives Information Report</h1></center>");
            bw.write("<br>");
            /*bw.write("<h3>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for the Batch Year : "+"20"+ dt+ "</h3>");*/
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the Batch Year: "+ yr+ "</h3>");
            bw.write("<h3>"+"&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;for the Branch : "+ bran+ "</h3>");
            bw.write("<center>");
            bw.write("<table border = 1 cell padding = 0 cell spacing = 0>");
            bw.write("<tr>");
            bw.write("<th>Drive ID No.</th>");
            bw.write("<th>Drive Date</th>");
            bw.write("<th>Schedule ID No.</th>");
            bw.write("<th>Company ID No.</th>");
            bw.write("<th>Comp. Short Name</th>");
            bw.write("<th>Comp. Full Name</th>");
            bw.write("<th>Drive Type</th>");
            bw.write("<th>Applicable Criteria</th>");
            bw.write("<th>Designation</th>");
            bw.write("<th>Package</th>");
            bw.write("<th>Rounds </th>");
            bw.write("<th>App. Students</th>");
            bw.write("<th>Placed Students</th>");
            bw.write("<th>Any Special Info.</th>");
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
            
            String drives, sch, comp;
            String drivesdata[], schdata[] = null, compdata[], by[], bra[];
            int chk = 0, chk2 = 0;
            while((drives = br.readLine()) != null)
            {
                drivesdata = drives.split("\\$");
                br1 = new BufferedReader(new FileReader("Drive_Schedule.txt"));
                    while((sch = br1.readLine()) != null)
                    {
                        schdata = sch.split("\\$");
                        if(drivesdata[2].equals(schdata[0]))
                        {
                            
                            break;
                        }
                    }
                    br1.close();
                    by = schdata[4].split(" ");
                chk = 0;
                for(int i=0; i<by.length; i++)
                {
                    if(by[i].equals(yr))
                    {
                        chk = 1;
                        break;
                    }
                }
                bra = schdata[5].split(" ");
                chk2 = 0;
                for(int i=0; i<bra.length; i++)
                {
                    if(bra[i].equals(bran1))
                    {
                        chk2 = 1;
                        break;
                    } 
                }
                if(chk == 1 && chk2 == 1)
                {
                    bw.write("<tr>");
                    bw.write("<td>" +drivesdata[0]+ "</td>");
                    bw.write("<td>" +drivesdata[1]+ "</td>");
                    bw.write("<td>" +drivesdata[2]+ "</td>");
                    bw.write("<td>" +drivesdata[3]+ "</td>");
                    br2 = new BufferedReader(new FileReader("JobCompanies.txt"));
                    while((comp = br2.readLine()) != null)
                    {
                        compdata = comp.split("\\$");
                        if(drivesdata[3].equals(compdata[0]))
                        {
                            bw.write("<td>" +compdata[1]+ "</td>");
                            bw.write("<td>" +compdata[2]+ "</td>");
                            break;
                        }
                    }
                    br2.close();
                    bw.write("<td>" +drivesdata[4]+ "</td>");
                    bw.write("<td>" +drivesdata[5]+ "</td>");
                    bw.write("<td>" +drivesdata[6]+ "</td>");
                    bw.write("<td>" +drivesdata[7]+ "</td>");
                    bw.write("<td>" +drivesdata[8]+ "</td>");
                    bw.write("<td>" +drivesdata[9]+ "</td>");
                    bw.write("<td>" +drivesdata[10]+ "</td>");
                    bw.write("<td>" +drivesdata[11]+ "</td>");
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
            rt.exec("Explorer Drives3.html");
        }
        catch(IOException ioe1)
        {
        }
    }
}