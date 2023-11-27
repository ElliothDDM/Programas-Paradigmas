
package metodos;

import alumno.Alumno;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    public void guardar(Alumno unAlumno){
        vPrincipal.addElement(unAlumno);
    }
    public void guardarArchivo(Alumno alumno){
        try{
           FileWriter fw=new FileWriter("Alumnos.txt",true); 
           BufferedWriter bw=new BufferedWriter(fw);
           PrintWriter pw=new PrintWriter(bw);
           pw.print(alumno.getNombre());
           pw.print("|"+alumno.getSexo());
           pw.println("|"+alumno.getEdad());
           pw.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
    }
}
    public DefaultTableModel listaAlumnos(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Sexo");
        cabeceras.addElement("Edad");
    
        DefaultTableModel mdlTabla=new DefaultTableModel(cabeceras,0);
        
        
        try{
            
            FileReader fr= new FileReader("Alumnos.txt");
            BufferedReader br= new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
            StringTokenizer dato = new StringTokenizer(d,"|");
            Vector x =new Vector();
            while(dato.hasMoreTokens()){
            x.addElement(dato.nextToken());
    }
            mdlTabla.addRow(x);
        }
        } catch(Exception e){
              JOptionPane.showMessageDialog(null,e);      
                    }                  
   return mdlTabla;    
}

    public void cboEdad (JComboBox edades){
        edades.removeAllItems();
        for(int x = 18; x < 60; x++){
            edades.addItem(x);
        }
    }
}


