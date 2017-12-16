/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Duarte
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
                    Pessoa a = new Aluno(parts[1],parts[2],parts[3],parts[4]);
                    person.add(a);
                }
                else if(parts[0].compareTo("P")==0){
                    Pessoa p = new Professor(parts[1],parts[2],parts[3],parts[4]);
                    person.add(p);
                }
                else if(parts[0].compareTo("F")==0){
                    Pessoa fc = new Funcionario(parts[1],parts[2],parts[3],parts[4]);
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
            String [] parts = new String[6];
            
            while((aux=br.readLine())!=null){
                parts = aux.split("-");
                if(parts[0].compareTo("AD")==0){
                    Local ad = new AreaDesportiva(parts[1],Double.parseDouble(parts[2]),Double.parseDouble(parts[3]));
                    place.add(ad);
                }
                else if(parts[0].compareTo("B")==0){
                    Local b = new Bar(parts[1],Integer.parseInt(parts[2]),Double.parseDouble(parts[3]),Double.parseDouble(parts[4]),Double.parseDouble(parts[5]));
                    place.add(b);
                }
                else if(parts[0].compareTo("E")==0){
                    Local ex = new Exposicao(parts[1],parts[2],Double.parseDouble(parts[3]),Double.parseDouble(parts[4]),Double.parseDouble(parts[5]));
                    place.add(ex);
                }
                else if(parts[0].compareTo("J")==0){
                    Local j = new Jardim(parts[1],Double.parseDouble(parts[2]),Double.parseDouble(parts[3]),Double.parseDouble(parts[4]));
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
            String aux;
            String [] parts = new String[4];
            
            while((aux=br.readLine())!=null){
                parts = aux.split("-");
                ConvivioDei cd = new ConvivioDei(parts[1]);
                convivio.add(cd);
            br.close();
            }
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
