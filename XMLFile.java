package br.com.fbarros.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class XMLFile{
	
	private 	String 	path;
	private 	String 	content;
	private 	boolean isSigned;
	
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getContent() {
		if(content != null)               
            return content;
        else{
            if(getPath().equals("")
				return "Arquivo inválido"
			else
				return "Conteúdo inválido"
        }
        return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void createFile(){
		if(!this.getContent().isEmpty())
		{
            File f = new File(this.getFilePath());
            f.delete();
             
            BufferedWriter out;
			try {
				out = new BufferedWriter(new FileWriter(this.getFilePath(),false));
				out.write(this.getFileContent());
	            out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
             
		}
	}
        
    public boolean exists(){
        if(this.filePath != null) {
            File f = new File(this.getFilePath());
            if(f.exists())
                return true;
            else
                return false;
        }
        return false;
    }
}
