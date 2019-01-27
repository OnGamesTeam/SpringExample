package com.project.coachAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    @Value("${fortunes.filename}")
    private String filename;

    private String[] frasi;

    public FileFortuneService(){}


    @PostConstruct // viene eseguito dopo il costruttore e dependecy injection
    public boolean loadFortunes() throws IOException{
        if(this.frasi == null) {
            String text = "";
            File file = new File(this.filename);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                text = text + line;
                line = br.readLine();
            }
            this.frasi = text.split("//");
            return true;
        }
        else return true;
    }
    @Override
    public String getFortune(){
        Random rand = new Random();
        return this.frasi[rand.nextInt(frasi.length)];
    }
}
