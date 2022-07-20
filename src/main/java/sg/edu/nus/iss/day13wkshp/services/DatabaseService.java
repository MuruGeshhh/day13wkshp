package sg.edu.nus.iss.day13wkshp.services;
import java.nio.file.*;
import java.io.*;
import java.util.*;

import org.springframework.stereotype.Service;


@Service
public class DatabaseService {

    private File dataDir = new File("something directory");

    public File getDataDir(){
        return dataDir;
    }

    public void setDataDir(File dataDir){
        this.dataDir = dataDir;
    }


    // mvn spring-boot:run -Dspring-boot.run.arguments="--dataDir=/Users/vikki/Desktop/data"


    public boolean isDataDirValid() {

        return dataDir.exists() && dataDir.isDirectory() && dataDir.canWrite();
    }


    
}
