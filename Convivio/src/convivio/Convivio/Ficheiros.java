package convivio.Convivio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Ribeiro e Duarte Carvalho
 */
public class Ficheiros {
    
    public void ler_txt_pessoas(ArrayList<Pessoa> person){
        try{
            File f = new File("Pessoas.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String aux;
            String [] parts = new String[5];
            
            while((aux=br.readLine())!=null){
                parts = aux.split("-");
                if(parts[0].compareTo("A")==0){
                    Aluno a = new Aluno(parts[1],parts[2],parts[3],parts[4]);
                    person.add(a);
                }
                else if(parts[0].compareTo("P")==0){
                    Professor p = new Professor(parts[1],parts[2],parts[3],parts[4]);
                    person.add(p);
                }
                else if(parts[0].compareTo("F")==0){
                    Funcionario fc = new Funcionario(parts[1],parts[2],parts[3],parts[4]);
                    person.add(fc);
                }
            }
            br.close();
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void fich_objeto(ArrayList<Pessoa> person){
        try{
            File f = new File("Pessoas.obj");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Pessoa p;
            
            while((p=(Pessoa)ois.readObject())!=null){
                person.add(p);
            }
            
            ois.close();
        }
        catch (FileNotFoundException ex) {
            ler_txt_pessoas(person);
            write_fich_objecto(person);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public void write_fich_objecto(ArrayList<Pessoa> person){
        try{
            File f = new File("Pessoas.obj");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (Pessoa tipo:person){
                oos.writeObject(tipo);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void ler_txt_locais(ArrayList<Local> place){
        try{
            File f = new File("Locais.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String aux;
            int i;
            String [] parts = new String[6];
            ArrayList<String> desportos = new ArrayList();
            
            while((aux=br.readLine())!=null){
                parts = aux.split("-");
                if(parts[0].compareTo("AD")==0){
                    String []ajudante = parts[4].split(";");
                    for(i=0;i<ajudante.length;i++){
                        desportos.add(ajudante[i]);
                    }
                    AreaDesportiva ad = new AreaDesportiva(parts[1],Double.parseDouble(parts[2]),Double.parseDouble(parts[3]),desportos);
                    place.add(ad);
                    //AreaDesportiva ad = new AreaDesportiva(parts[1],Double.parseDouble(parts[2]),Double.parseDouble(parts[3]));
                    //place.add(ad);
                }
                else if(parts[0].compareTo("B")==0){
                    Bar b = new Bar(parts[1],Integer.parseInt(parts[2]),Double.parseDouble(parts[3]),Double.parseDouble(parts[4]),Double.parseDouble(parts[5]));
                    place.add(b);
                }
                else if(parts[0].compareTo("E")==0){
                    Exposicao ex = new Exposicao(parts[1],parts[2],Double.parseDouble(parts[3]),Double.parseDouble(parts[4]),Double.parseDouble(parts[5]));
                    place.add(ex);
                }
                else if(parts[0].compareTo("J")==0){
                    Jardim j = new Jardim(parts[1],Double.parseDouble(parts[2]),Double.parseDouble(parts[3]),Double.parseDouble(parts[4]));
                    place.add(j);
                }
                
            }
            br.close();
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void fich_objeto2(ArrayList<Local> place){
        try{
            File f = new File("Locais.obj");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Local l;
            
            while((l=(Local)ois.readObject())!=null){
                place.add(l);
            }
            
            ois.close();
        }
        catch (FileNotFoundException ex) {
            ler_txt_locais(place);
            write_fich_objecto2(place);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public void write_fich_objecto2(ArrayList<Local> place){
        try{
            File f = new File("Locais.obj");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (Local tipo:place){
                oos.writeObject(tipo);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void ler_txt_ConvivioDei(ArrayList<ConvivioDei> convivio){
        try{
            File f = new File("ConvivioDei.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String aux,aux2;
            int i;
            String [] parts;
            String [] partsPessoa = new String[5];
            String [] partsLocal = new String[6];
            ArrayList<Pessoa> pessoasIns = new ArrayList();
            ArrayList<Local> locaisIns = new ArrayList();
            ArrayList<String> desportos = new ArrayList();
            
            while((aux=br.readLine())!=null){
                parts = aux.split("-");
                String []helper = parts[1].split(";");
                for(i=0;i<helper.length;i++){
                    partsPessoa = helper[i].split(",");
                    if(partsPessoa[0].compareTo("A")==0){
                        Aluno a = new Aluno(partsPessoa[1],partsPessoa[2],partsPessoa[3],partsPessoa[4]);
                        pessoasIns.add(a);
                    }
                    else if(partsPessoa[0].compareTo("P")==0){
                        Professor p = new Professor(partsPessoa[1],partsPessoa[2],partsPessoa[3],partsPessoa[4]);
                        pessoasIns.add(p);
                    }
                    else if(partsPessoa[0].compareTo("F")==0){
                        Funcionario fc = new Funcionario(partsPessoa[1],partsPessoa[2],partsPessoa[3],partsPessoa[4]);
                        pessoasIns.add(fc);
                    }
                }
                String []helper2= parts[2].split(";");
                for(i=0;i<helper2.length;i++){
                    partsPessoa = helper2[i].split(",");
                    if(partsPessoa[0].compareTo("AD")==0){
                        String []ajudante = partsPessoa[4].split("/");
                        for(i=0;i<ajudante.length;i++){
                            desportos.add(ajudante[i]);
                        }
                        AreaDesportiva ad = new AreaDesportiva(partsPessoa[1],Double.parseDouble(partsPessoa[2]),Double.parseDouble(partsPessoa[3]),desportos);
                        locaisIns.add(ad);
                    }
                    else if(parts[0].compareTo("B")==0){
                        Bar b = new Bar(partsPessoa[1],Integer.parseInt(partsPessoa[2]),Double.parseDouble(partsPessoa[3]),Double.parseDouble(partsPessoa[4]),Double.parseDouble(partsPessoa[5]));
                        locaisIns.add(b);
                    }
                    else if(parts[0].compareTo("E")==0){
                        Exposicao ex = new Exposicao(partsPessoa[1],partsPessoa[2],Double.parseDouble(partsPessoa[3]),Double.parseDouble(partsPessoa[4]),Double.parseDouble(partsPessoa[5]));
                        locaisIns.add(ex);
                    }
                    else if(parts[0].compareTo("J")==0){
                        Jardim j = new Jardim(partsPessoa[1],Double.parseDouble(partsPessoa[2]),Double.parseDouble(partsPessoa[3]),Double.parseDouble(partsPessoa[4]));
                        locaisIns.add(j);   
                    }
                }
                
                ConvivioDei cd = new ConvivioDei(parts[0],pessoasIns,locaisIns);
                convivio.add(cd);
            }
            br.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
   
    public void fich_objeto3(ArrayList<ConvivioDei> convivio){
        
        try{
            File f = new File("ConvivioDei.obj");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ConvivioDei cd;
            
            while((cd=(ConvivioDei)ois.readObject())!=null){
                convivio.add(cd);
            }
            ois.close();
        }
        catch (FileNotFoundException ex) {
            ler_txt_ConvivioDei(convivio);
            write_fich_objecto3(convivio);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public void write_fich_objecto3(ArrayList<ConvivioDei> convivio){
        try{
            File f = new File("ConvivioDei.obj");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (ConvivioDei tipo:convivio){
                oos.writeObject(tipo);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }    
}
